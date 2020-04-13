package com.jiayu.reverseproxy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author morningrain
 * @Description 类描述
 * @Data 2020/4/13
 */
@Component
public class CharsetFilter extends ZuulFilter {

    /**
     * 过滤器的类型
     * pre - 前置过滤
     * route - 路由后过过滤
     * error - 异常过滤
     * post - 远程服务调用后过滤
     *
     * @return 过滤器的类型
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 同种类的过滤器的执行顺序。
     * 按照返回值的自然升序执行。
     *
     * @return 同种类的过滤器的执行顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 返回boolean类型。代表当前filter是否生效。
     * 默认值为false。
     *
     * @return 返回true代表开启filter。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * run方法就是过滤器的具体逻辑。
     * 过滤器的具体逻辑。需要注意，这里我们通过ctx.setSendZuulResponse(false)令zuul过滤该请求，不对其进行路由，然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码，当然我们也可以进一步优化我们的返回，比如，
     * 通过ctx.setResponseBody(body)对返回body内容进行编辑等。
     *
     * @return 可以返回任意的对象，当前实现忽略
     */
    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        System.out.println(request.getRequestURL());

        String error = request.getParameter("error");
        if (error != null) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            //重中之重，这里一定要加要给Response设置CharacterEncoding编码为UTF-8
            requestContext.getResponse().setCharacterEncoding("UTF-8");
            requestContext.getResponse().setContentType("text/html;cahrset=UTF-8");
            requestContext.setResponseBody("有错误未处理" + "：" + error);
        }

        return null;
    }
}

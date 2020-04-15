package com.jiayu.serviceone.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//该注解定义了该接口的一个Feign客户端 name指定了注册到Eureka的服务名,fallback是服务降级后的实现类接
@FeignClient(name = "service-provider", fallback = FeignClientFallback.class)
public interface FeignClientTest {

    @RequestMapping(value = "/serviceProvider/test", method = RequestMethod.GET)
    String getServiceTwoInfo();

}
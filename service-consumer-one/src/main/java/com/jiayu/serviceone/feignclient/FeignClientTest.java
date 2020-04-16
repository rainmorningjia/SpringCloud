package com.jiayu.serviceone.feignclient;


import com.jiayu.model.test.TestUser;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//该注解定义了该接口的一个Feign客户端 name指定了注册到Eureka的服务名,fallback是服务降级后的实现类接
@FeignClient(name = "service-provider", fallback = FeignClientFallback.class)
public interface FeignClientTest {

    @LoadBalanced
    @RequestMapping(value = "/serviceProvider/test", method = RequestMethod.GET)
    List<TestUser> getServiceTwoInfo();

}

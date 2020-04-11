package com.jiayu.reverseproxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul网管代理
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ReverseProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReverseProxyApplication.class, args);
    }
}

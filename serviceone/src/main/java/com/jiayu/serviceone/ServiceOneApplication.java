package com.jiayu.serviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.jiayu.serviceone")
@EnableFeignClients //开启feign
@EnableDiscoveryClient
public class ServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceOneApplication.class, args);
    }
}

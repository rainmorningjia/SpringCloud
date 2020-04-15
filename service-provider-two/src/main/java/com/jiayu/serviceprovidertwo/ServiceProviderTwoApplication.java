package com.jiayu.serviceprovidertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.jiayu.serviceprovidertwo")
@EnableEurekaClient
@EnableWebMvc
public class ServiceProviderTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderTwoApplication.class, args);
    }

}

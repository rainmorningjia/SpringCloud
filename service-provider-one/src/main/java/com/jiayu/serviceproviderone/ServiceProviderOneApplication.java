package com.jiayu.serviceproviderone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.jiayu.serviceproviderone")
@EnableEurekaClient
@EnableWebMvc
public class ServiceProviderOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceProviderOneApplication.class, args);
    }

}

package com.jiayu.serviceone.controller;

import com.jiayu.serviceone.feignclient.FeignClientTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceConsumer")
public class ServiceOneController {

    @Autowired
    private FeignClientTest feignClientTest;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testOne() {
        String serviceTwoInfo = feignClientTest.getServiceTwoInfo();
        return "helloWorld:+" + serviceTwoInfo;
    }
}

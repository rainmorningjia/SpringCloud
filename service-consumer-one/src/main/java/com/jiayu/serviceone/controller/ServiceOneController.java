package com.jiayu.serviceone.controller;

import com.jiayu.model.test.TestUser;
import com.jiayu.serviceone.feignclient.FeignClientTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/serviceConsumer")
public class ServiceOneController {

    @Autowired
    private FeignClientTest feignClientTest;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<TestUser> testOne() {
        List<TestUser> serviceTwoInfo = feignClientTest.getServiceTwoInfo();
        return serviceTwoInfo;
    }
}

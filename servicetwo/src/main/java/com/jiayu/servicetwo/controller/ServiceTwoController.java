package com.jiayu.servicetwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceTwo")
public class ServiceTwoController {

    @RequestMapping(value = "/testTwo", method = RequestMethod.GET)
    public String testTwo() {
        return "你好,世界";
    }

}

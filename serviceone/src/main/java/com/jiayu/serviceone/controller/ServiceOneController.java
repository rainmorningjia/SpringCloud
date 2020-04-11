package com.jiayu.serviceone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceOne")
public class ServiceOneController {

    @RequestMapping("/test")
    public String test() {
        return "helloWorld";
    }
}

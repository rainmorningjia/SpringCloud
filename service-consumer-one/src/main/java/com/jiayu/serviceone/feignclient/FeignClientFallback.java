package com.jiayu.serviceone.feignclient;

import org.springframework.stereotype.Component;

/**
 * @author morningrain
 * @Description 类描述
 * @Data 2020/4/14
 */
@Component
public class FeignClientFallback implements FeignClientTest {
    @Override
    public String getServiceTwoInfo() {
        return "看不到世界";
    }
}

package com.jiayu.serviceone.feignclient;

import com.jiayu.model.test.TestUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author morningrain
 * @Description 类描述
 * @Data 2020/4/14
 */
@Component
public class FeignClientFallback implements FeignClientTest {
    @Override
    public List<TestUser> getServiceTwoInfo() {
        List<TestUser> list = new ArrayList<>();
        TestUser testUser = new TestUser();
        testUser.setUserName("fail");
        testUser.setCount(0);
        testUser.setAddress("杭州市");
        testUser.setId(0L);
        list.add(testUser);
        return list;
    }
}

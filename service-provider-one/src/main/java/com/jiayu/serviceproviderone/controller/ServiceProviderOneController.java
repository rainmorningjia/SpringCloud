package com.jiayu.serviceproviderone.controller;

import com.jiayu.model.test.TestUser;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/serviceProvider")
public class ServiceProviderOneController {

    private List<TestUser> listUser = new ArrayList<TestUser>();

    private Integer count = 0;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<TestUser> testTwo() {
        TestUser user = new TestUser();
        if (CollectionUtils.isEmpty(listUser)) {
            user.setId(0L);
        } else {
            user.setId(listUser.get(listUser.size() - 1).getId() + 1);
        }
        user.setAddress("杭州市");
        count = count++;
        user.setCount(count);
        user.setUserName("test");
        listUser.add(user);
        System.out.printf(listUser.toString());
        return listUser;

    }

}

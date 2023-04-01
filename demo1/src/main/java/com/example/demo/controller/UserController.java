package com.example.demo.controller;

import com.example.demo.model.entity.UserEntity;
import com.example.demo.service.TestService2;
import com.example.demo.service.TestService1;
import com.example.demo.service.TestService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Autowired
    private TestService1 testService1; // @service注解+Autowired装配

    @Resource
    private TestService2 testService2; // @service注解+Resource装配

    @Autowired
    private TestService3 testService3; // xml+Autowired装配

    @PostMapping("test1")
    public String test1() {
        return testService1.test();
    }

    @PostMapping("test2")
    public String test2() {
        return testService2.test();
    }

    @PostMapping("test3")
    public String test3() {
        return testService3.test();
    }

    // 返回xml
    @PostMapping(value = "test4",produces = MediaType.APPLICATION_XML_VALUE)
    public UserEntity test4() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("wang");
        userEntity.setAge(10);
        return userEntity;
    }
    // 返回json
    @PostMapping(value = "test5")
    public UserEntity test5() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("wang");
        userEntity.setAge(10);
        return userEntity;
    }

}

package com.cloud.springcloud.eurekaclientfeigngetaway.controller;

import com.cloud.springcloud.eurekaclientfeigngetaway.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;


    @GetMapping("userInfo")
    public String userInfo(){


        return userClient.userInfo();

    }


}

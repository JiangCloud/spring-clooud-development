package com.cloud.springcloud.eurekaclientfeign.controller;


import com.cloud.springcloud.eurekaclientfeign.service.UserInfoClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class ShowInfoController {
    @Resource
    private UserInfoClient userInfoClient;

    @GetMapping
    public String showUserInfo(){



        return userInfoClient.getUserInfo();
    }


}

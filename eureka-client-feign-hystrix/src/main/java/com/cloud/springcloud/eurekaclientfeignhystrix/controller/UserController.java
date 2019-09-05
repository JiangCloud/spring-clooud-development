package com.cloud.springcloud.eurekaclientfeignhystrix.controller;

import com.cloud.springcloud.eurekaclientfeignhystrix.service.UserInfoClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("userInfo")
public class UserController {

    private UserInfoClient userInfoClient;


    @Autowired
    public void setUserInfoClient(UserInfoClient userInfoClient) {
        this.userInfoClient = userInfoClient;
    }

    @GetMapping("/showUserInfo")
    @HystrixCommand(fallbackMethod = "defaultUserInfo")
    public String showUserInfo(){

      return   userInfoClient.userInfo();
    }

    public  String defaultUserInfo(){

        return "I am  a  boy";



    }


}

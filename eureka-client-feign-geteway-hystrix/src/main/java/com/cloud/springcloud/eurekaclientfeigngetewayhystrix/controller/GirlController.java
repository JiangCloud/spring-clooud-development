package com.cloud.springcloud.eurekaclientfeigngetewayhystrix.controller;

import com.cloud.springcloud.eurekaclientfeigngetewayhystrix.service.UserClient;;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController




public class GirlController {
    @Resource
    private UserClient userClient;

    @RequestMapping("girlInfo")
    //@HystrixCommand(fallbackMethod = "girlInfoFallBack")
    public  String girlInfo(){

        return  userClient.girlInfo();

    }
/*
    public  String girlInfoFallBack(){
        return "fail";


    }
*/

}

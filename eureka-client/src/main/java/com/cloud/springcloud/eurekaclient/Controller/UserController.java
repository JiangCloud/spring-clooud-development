package com.cloud.springcloud.eurekaclient.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/pushInfos")
    public String pushInfo(){

        return "I am  chinese";
    }

}

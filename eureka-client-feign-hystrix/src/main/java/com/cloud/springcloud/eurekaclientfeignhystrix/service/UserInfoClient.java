package com.cloud.springcloud.eurekaclientfeignhystrix.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client")
public interface UserInfoClient {

    @RequestMapping("/user/pushInfos")
     String userInfo();
}

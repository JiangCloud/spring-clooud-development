package com.cloud.springcloud.eurekaclientfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface UserInfoClient {
    @GetMapping("/pushInfos")
    String getUserInfo();

}

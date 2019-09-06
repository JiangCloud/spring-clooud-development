package com.cloud.springcloud.eurekaclientfeigngetaway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-zuul" )
public interface UserClient {

      @GetMapping("/hi/pushInfos")
      String userInfo();



}

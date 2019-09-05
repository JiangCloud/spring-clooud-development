package com.cloud.springcloud.eurekaclientfeigngetewayhystrix.service;


import feign.Feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name="eureka-client-zuul", fallback=UserClientFallBack.class)
public interface UserClient {

    @RequestMapping("/hi/user/pushInfos")
    String girlInfo();
}

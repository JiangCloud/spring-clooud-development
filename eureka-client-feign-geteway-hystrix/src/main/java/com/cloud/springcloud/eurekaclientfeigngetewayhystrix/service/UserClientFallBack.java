
package com.cloud.springcloud.eurekaclientfeigngetewayhystrix.service;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient {


    @Override
    public String girlInfo() {
        return "get data fail";
    }
}

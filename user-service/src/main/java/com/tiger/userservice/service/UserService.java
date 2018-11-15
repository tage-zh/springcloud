package com.tiger.userservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Value("${server.port}")
    private String port;

    public String sayHello(){
        return "Hello from "+ port;
    }
}

package com.tiger.userservice.controller;

import com.tiger.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return  userService.sayHello();
    }
}

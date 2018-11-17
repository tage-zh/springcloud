package com.tiger.ribbonservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tiger.ribbonservice.service.RibbonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonUserController {
    @Autowired
    private RibbonUserService ribbonUserService;

    @RequestMapping("/hello")
//    @HystrixCommand(fallbackMethod = "helloConsumerfallback")
    public String hello(){
        return ribbonUserService.hello();
    }

    public String helloConsumerfallback(){
        return ribbonUserService.hello();
    }
}

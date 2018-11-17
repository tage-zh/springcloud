package com.tiger.ribbonservice.controller;

import com.tiger.ribbonservice.service.RibbonUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonUserController {
    @Autowired
    private RibbonUserService ribbonUserService;

    @RequestMapping("/hello")
    public String hello(){
        return ribbonUserService.hello();
    }
}

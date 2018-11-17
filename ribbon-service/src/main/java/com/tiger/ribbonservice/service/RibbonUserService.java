package com.tiger.ribbonservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RibbonUserService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        return restTemplate.getForObject("http://USER-SERVICE/hello",String.class);
    }
}

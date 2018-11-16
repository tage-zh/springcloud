package com.tiger.userservice.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Log log = LogFactory.getLog(this.getClass());
    @Value("${server.port}")
    private String port;

    public String sayHello(){
        log.info("start hello");
        return "Hello from "+ port;
    }
}

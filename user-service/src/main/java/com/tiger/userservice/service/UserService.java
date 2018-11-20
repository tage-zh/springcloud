package com.tiger.userservice.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class UserService {
    private Log log = LogFactory.getLog(this.getClass());
    @Value("${server.port}")
    private String port;

    @Value("${age}")
    String age;

    public String sayHello(){
        log.info("start hello");
        log.info("start end");
        return "Hello from "+ port +":"+port;
    }
}

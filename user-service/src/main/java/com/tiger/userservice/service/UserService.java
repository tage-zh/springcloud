package com.tiger.userservice.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private Log log = LogFactory.getLog(this.getClass());
    @Value("${server.port}")
    private String port;

    @Value("${sang}")
    String sang;

    public String sayHello(){
        log.info("start hello");
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        log.info("start end");
        return "Hello from "+ port +": ：："+sang;
    }
}

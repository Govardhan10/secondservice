package com.centime.secondservice.controller;

import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloControllerImpl implements HelloController{

    @Qualifier("eurekaClient")
    @Lazy
    @Autowired
    EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Override
    public ResponseEntity<String> getGreeting() {
        log.info("Service name : {} , endpoint : /greeting",eurekaClient.getApplication(appName).getName());
        return ResponseEntity.ok().body("Hello");
    }
}

package com.centime.secondservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Hello Controller")
public interface HelloController {

    @ApiOperation(value = "Get method to get hello string")
    @GetMapping(value = "/greeting",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getGreeting();

}

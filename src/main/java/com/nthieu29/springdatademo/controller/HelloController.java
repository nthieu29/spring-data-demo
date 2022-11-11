package com.nthieu29.springdatademo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return "Hello World";
    }
}

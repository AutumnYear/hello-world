package com.study.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello () {
        String test = "Hello,World!";
        System.out.println(test);
        return test;
    }

}

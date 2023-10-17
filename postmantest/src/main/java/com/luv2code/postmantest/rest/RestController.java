package com.luv2code.postmantest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/test")
public class RestController {

    // add a request for a code /hello mapping id on ip website enpoint
    @GetMapping("/hello")
    public String sayHello() {
        return " Hello World";

    }

}

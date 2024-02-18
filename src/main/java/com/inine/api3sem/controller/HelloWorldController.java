package com.inine.api3sem.controller;

import com.inine.api3sem.entities.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public HelloWorld hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return new HelloWorld(counter.incrementAndGet(), String.format(template, name));
    }
}

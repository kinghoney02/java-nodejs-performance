package com.alex.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

//    @GetMapping("/")
//    String helloWorld() {
//        return "Hello World";
//    }

    @GetMapping("/")
    public Mono<String> helloWorld() {
        return Mono.just("Hello World");
    }
}

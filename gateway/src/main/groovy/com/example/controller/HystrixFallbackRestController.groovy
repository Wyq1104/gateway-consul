package com.example.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

    @GetMapping("/service1/fallback")
    public Mono<String> getService1Msg() {
        return Mono.just("No response from sercice 1 and will be back shortly");
    }

}
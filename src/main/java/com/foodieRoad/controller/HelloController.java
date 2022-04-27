package com.foodieRoad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/27
 */
@RestController
public class HelloController {

    @GetMapping("/")
    Flux<String> hello(){
        return Flux.just("Hello","world");
    }
}

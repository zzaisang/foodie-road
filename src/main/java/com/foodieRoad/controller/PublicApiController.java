package com.foodieRoad.controller;

import com.foodieRoad.domain.payload.SeoulRestaurantResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/04
 */
@RestController
public class PublicApiController {

    @GetMapping("/public/store/source")
    public Mono<SeoulRestaurantResult> apiCallTest(){
        return WebClient.create()
                .get()
                .uri("")
                .retrieve()
                .bodyToMono(SeoulRestaurantResult.class);
    }
}

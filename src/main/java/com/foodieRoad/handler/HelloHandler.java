package com.foodieRoad.handler;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import static org.springframework.web.reactive.function.BodyInserters.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/27
 */
@Component
public class HelloHandler {

    public RouterFunction<ServerResponse> routes(){
        return route(GET("/"), this::hello)
                .andRoute(GET("/stream"), this::stream);
    }

    public Mono<ServerResponse> hello(ServerRequest req){
        return ServerResponse.ok().body(Flux.just("Hello","world"),String.class);
    }

    public Mono<ServerResponse> stream(ServerRequest req){

        Stream<Integer> stream = Stream.iterate(0, i -> i + 1);
        Flux<Map<String,Integer>> flux = Flux.fromStream(stream)
                .map(i -> Collections.singletonMap("value", i));
        return ServerResponse.ok().contentType(MediaType.APPLICATION_NDJSON)
                .body(fromPublisher(flux, new ParameterizedTypeReference<Map<String,Integer>>(){}));

    }
}

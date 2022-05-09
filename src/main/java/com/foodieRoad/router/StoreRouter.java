package com.foodieRoad.router;

import com.foodieRoad.handler.CommonApiHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/08
 */
@Configuration
public class StoreRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(CommonApiHandler commonApiHandler){
        return route(GET("/store"), commonApiHandler::getAll);
    }
}

package com.foodieRoad.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;




/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/07
 */
@Component
@Lazy
@ConfigurationProperties(prefix = "external.seoul-common")
@Getter
@Setter
public class CommonApiProperties {

    private String url;

    private String key;

    private String name;


//    private final RestaurantApi restaurantApi;

//    @Getter
//    @RequiredArgsConstructor
//    public static final class RestaurantApi {
//        private final String name;
//        private final String key;
//    }
}

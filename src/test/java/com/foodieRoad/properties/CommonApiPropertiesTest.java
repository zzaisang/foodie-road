package com.foodieRoad.properties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/07
 */
//@ActiveProfiles("local")
class CommonApiPropertiesTest {

    @Autowired
    CommonApiProperties commonApiProperties;

    @Test
    void propertiesTest() {
        Assertions.assertEquals("LOCALDATA_072404", commonApiProperties.getUrl());
    }
}
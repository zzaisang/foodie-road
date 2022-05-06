package com.foodieRoad.domain.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/05
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SeoulRestaurantResult {

    @JsonProperty("LOCALDATA_072404")
    private SeoulRestaurantCommonResult result;

}

package com.foodieRoad.domain.payload;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/02
 */
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SeoulRestaurantCommonResult {

    @JsonProperty("list_total_count")
    private Long listTotalCount;

    @JsonProperty("RESULT")
    private PublicCommonApiResult result;

    @JsonProperty("row")
    private List<SeoulRestaurantDataResult> dataResultList;

}

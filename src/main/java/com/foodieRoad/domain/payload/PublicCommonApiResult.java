package com.foodieRoad.domain.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/04
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PublicCommonApiResult {

    @JsonProperty("CODE")
    private String code;

    @JsonProperty("MESSAGE")
    private String message;

}

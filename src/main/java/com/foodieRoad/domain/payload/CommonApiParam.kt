package com.foodieRoad.domain.payload

import lombok.AllArgsConstructor
import lombok.Getter

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/08
 */
enum class CommonApiParam(
    val typeName : String
) {
    START_PAGE("start_page"), END_PAGE("end_page");
}
package com.foodieRoad.domain.payload;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/02
 */
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SeoulRestaurantResult {

    @JsonProperty("list_total_count")
    private Long listTotalCount;

    @JsonProperty("RESULT")
    private PublicCommonApiResult result;

    @Schema(description = "개방자치단체코드")
    private String OPNSFTEAMCODE;

    @Schema(description = "관리번호")
    private String MGTNO;

    @Schema(description = "인허가일자")
    private String APVPERMYMD;

    @Schema(description = "인허가취소일자")
    private String APVCANCELYMD;

    @Schema(description = "영업상태코드")
    private String TRDSTATEGBN;

    @Schema(description = "영업상태명")
    private String TRDSTATENM;

    @Schema(description = "상세영업상태코드")
    private String DTLSTATEGBN;

    @Schema(description = "상세영업상태명")
    private String DTLSTATENM;

    @Schema(description = "폐업일자")
    private String DCBYMD;

    @Schema(description = "휴업시작일자")
    private String CLGSTDT;

    @Schema(description = "휴업종료일자")
    private String CLGENDDT;

    @Schema(description = "재개업일자")
    private String ROPNYMD;

    @Schema(description = "전화번호")
    private String SITETEL;

    @Schema(description = "소재지면적")
    private String SITEAREA;

    @Schema(description = "소재지우편번호")
    private String SITEPOSTNO;

    @Schema(description = "지번주소")
    private String SITEWHLADDR;

    @Schema(description = "도로명주소")
    private String RDNWHLADDR;

    @Schema(description = "도로명우편번호")
    private String RDNPOSTNO;

    @Schema(description = "사업장명")
    private String BPLCNM;

    @Schema(description = "최종수정일자")
    private String LASTMODTS;

    @Schema(description = "데이터갱신구분")
    private String UPDATEGBN;

    @Schema(description = "데이터갱신일자")
    private String UPDATEDT;

    @Schema(description = "업태구분명")
    private String UPTAENM;

    @Schema(description = "좌표정보(X)")
    private String X;

    @Schema(description = "좌표정보(Y)")
    private String Y;

    @Schema(description = "위생업태명")
    private String SNTUPTAENM;

    @Schema(description = "남성종사자수")
    private String MANEIPCNT;

    @Schema(description = "여성종사자수")
    private String WMEIPCNT;

    @Schema(description = "영업장주변구분명")
    private String TRDPJUBNSENM;

    @Schema(description = "등급구분명")
    private String LVSENM;

    @Schema(description = "급수시설구분명")
    private String WTRSPLYFACILSENM;

    @Schema(description = "총인원")
    private String TOTEPNUM;

    @Schema(description = "본사종업원수")
    private String HOFFEPCNT;

    @Schema(description = "공장사무직종업원수")
    private String FCTYOWKEPCNT;

    @Schema(description = "공장판매직종업원수")
    private String FCTYSILJOBEPCNT;

    @Schema(description = "공장생산직종업원수")
    private String FCTYPDTJOBEPCNT;

    @Schema(description = "건물소유구분명")
    private String BDNGOWNSENM;

    @Schema(description = "보증액")
    private String ISREAM;

    @Schema(description = "월세액")
    private String MONAM;

    @Schema(description = "다중이용업소여부")
    private String MULTUSNUPSOYN;

    @Schema(description = "시설총규모")
    private String FACILTOTSCP;

    @Schema(description = "전통업소지정번호")
    private String JTUPSOASGNNO;

    @Schema(description = "전통업소주된음식")
    private String JTUPSOMAINEDF;

    @Schema(description = "홈페이지")
    private String HOMEPAGE;

}

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
public class SeoulRestaurantDataResult {

    @Schema(description = "개방자치단체코드")
    @JsonProperty("OPNSFTEAMCODE")
    private String OPNSFTEAMCODE;

    @Schema(description = "관리번호")
    @JsonProperty("MGTNO")
    private String MGTNO;

    @Schema(description = "인허가일자")
    @JsonProperty("APVPERMYMD")
    private String APVPERMYMD;

    @Schema(description = "인허가취소일자")
    @JsonProperty("APVCANCELYMD")
    private String APVCANCELYMD;

    @Schema(description = "영업상태코드")
    @JsonProperty("TRDSTATEGBN")
    private String TRDSTATEGBN;

    @Schema(description = "영업상태명")
    @JsonProperty("TRDSTATENM")
    private String TRDSTATENM;

    @Schema(description = "상세영업상태코드")
    @JsonProperty("DTLSTATEGBN")
    private String DTLSTATEGBN;

    @Schema(description = "상세영업상태명")
    @JsonProperty("DTLSTATENM")
    private String DTLSTATENM;

    @Schema(description = "폐업일자")
    @JsonProperty("DCBYMD")
    private String DCBYMD;

    @Schema(description = "휴업시작일자")
    @JsonProperty("CLGSTDT")
    private String CLGSTDT;

    @Schema(description = "휴업종료일자")
    @JsonProperty("CLGENDDT")
    private String CLGENDDT;

    @Schema(description = "재개업일자")
    @JsonProperty("ROPNYMD")
    private String ROPNYMD;

    @Schema(description = "전화번호")
    @JsonProperty("SITETEL")
    private String SITETEL;

    @Schema(description = "소재지면적")
    @JsonProperty("SITEAREA")
    private String SITEAREA;

    @Schema(description = "소재지우편번호")
    @JsonProperty("SITEPOSTNO")
    private String SITEPOSTNO;

    @Schema(description = "지번주소")
    @JsonProperty("SITEWHLADDR")
    private String SITEWHLADDR;

    @Schema(description = "도로명주소")
    @JsonProperty("RDNWHLADDR")
    private String RDNWHLADDR;

    @Schema(description = "도로명우편번호")
    @JsonProperty("RDNPOSTNO")
    private String RDNPOSTNO;

    @Schema(description = "사업장명")
    @JsonProperty("BPLCNM")
    private String BPLCNM;

    @Schema(description = "최종수정일자")
    @JsonProperty("LASTMODTS")
    private String LASTMODTS;

    @Schema(description = "데이터갱신구분")
    @JsonProperty("UPDATEGBN")
    private String UPDATEGBN;

    @Schema(description = "데이터갱신일자")
    @JsonProperty("UPDATEDT")
    private String UPDATEDT;

    @Schema(description = "업태구분명")
    @JsonProperty("UPTAENM")
    private String UPTAENM;

    @Schema(description = "좌표정보(X)")
    @JsonProperty("X")
    private String X;

    @Schema(description = "좌표정보(Y)")
    @JsonProperty("Y")
    private String Y;

    @Schema(description = "위생업태명")
    @JsonProperty("SNTUPTAENM")
    private String SNTUPTAENM;

    @Schema(description = "남성종사자수")
    @JsonProperty("MANEIPCNT")
    private String MANEIPCNT;

    @Schema(description = "여성종사자수")
    @JsonProperty("WMEIPCNT")
    private String WMEIPCNT;

    @Schema(description = "영업장주변구분명")
    @JsonProperty("TRDPJUBNSENM")
    private String TRDPJUBNSENM;

    @Schema(description = "등급구분명")
    @JsonProperty("LVSENM")
    private String LVSENM;

    @Schema(description = "급수시설구분명")
    @JsonProperty("WTRSPLYFACILSENM")
    private String WTRSPLYFACILSENM;

    @Schema(description = "총인원")
    @JsonProperty("TOTEPNUM")
    private String TOTEPNUM;

    @Schema(description = "본사종업원수")
    @JsonProperty("HOFFEPCNT")
    private String HOFFEPCNT;

    @Schema(description = "공장사무직종업원수")
    @JsonProperty("FCTYOWKEPCNT")
    private String FCTYOWKEPCNT;

    @Schema(description = "공장판매직종업원수")
    @JsonProperty("FCTYSILJOBEPCNT")
    private String FCTYSILJOBEPCNT;

    @Schema(description = "공장생산직종업원수")
    @JsonProperty("FCTYPDTJOBEPCNT")
    private String FCTYPDTJOBEPCNT;

    @Schema(description = "건물소유구분명")
    @JsonProperty("BDNGOWNSENM")
    private String BDNGOWNSENM;

    @Schema(description = "보증액")
    @JsonProperty("ISREAM")
    private String ISREAM;

    @Schema(description = "월세액")
    @JsonProperty("MONAM")
    private String MONAM;

    @Schema(description = "다중이용업소여부")
    @JsonProperty("MULTUSNUPSOYN")
    private String MULTUSNUPSOYN;

    @Schema(description = "시설총규모")
    @JsonProperty("FACILTOTSCP")
    private String FACILTOTSCP;

    @Schema(description = "전통업소지정번호")
    @JsonProperty("JTUPSOASGNNO")
    private String JTUPSOASGNNO;

    @Schema(description = "전통업소주된음식")
    @JsonProperty("JTUPSOMAINEDF")
    private String JTUPSOMAINEDF;

    @Schema(description = "홈페이지")
    @JsonProperty("HOMEPAGE")
    private String HOMEPAGE;

}

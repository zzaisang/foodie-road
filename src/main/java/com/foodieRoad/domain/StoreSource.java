package com.foodieRoad.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/04/30
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Document(collection = "store_source")
public class StoreSource {

    @Id
    private Long id;

    @Field(name = "개방자치단체코드")
    private String OPNSFTEAMCODE;

    @Field(name = "관리번호")
    private String MGTNO;

    @Field(name = "인허가일자")
    private String APVPERMYMD;
    @Field(name = "인허가취소일자")
    private String APVCANCELYMD;
    @Field(name = "영업상태코드")
    private String TRDSTATEGBN;
    @Field(name = "영업상태명")
    private String TRDSTATENM;
    @Field(name = "상세영업상태코드")
    private String DTLSTATEGBN;
    @Field(name = "상세영업상태명")
    private String DTLSTATENM;
    @Field(name = "폐업일자")
    private String DCBYMD;
    @Field(name = "휴업시작일자")
    private String CLGSTDT;
    @Field(name = "휴업종료일자")
    private String CLGENDDT;
    @Field(name = "재개업일자")
    private String ROPNYMD;
    @Field(name = "전화번호")
    private String SITETEL;
    @Field(name = "소재지면적")
    private String SITEAREA;
    @Field(name = "소재지우편번호")
    private String SITEPOSTNO;
    @Field(name = "지번주소")
    private String SITEWHLADDR;
    @Field(name = "도로명주소")
    private String RDNWHLADDR;
    @Field(name = "도로명우편번호")
    private String RDNPOSTNO;
    @Field(name = "사업장명")
    private String BPLCNM;
    @Field(name = "최종수정일자")
    private String LASTMODTS;
    @Field(name = "데이터갱신구분")
    private String UPDATEGBN;
    @Field(name = "데이터갱신일자")
    private String UPDATEDT;
    @Field(name = "업태구분명")
    private String UPTAENM;
    @Field(name = "좌표정보(X)")
    private String X;
    @Field(name = "좌표정보(Y)")
    private String Y;
    @Field(name = "위생업태명")
    private String SNTUPTAENM;
    @Field(name = "남성종사자수")
    private String MANEIPCNT;
    @Field(name = "여성종사자수")
    private String WMEIPCNT;
    @Field(name = "영업장주변구분명")
    private String TRDPJUBNSENM;
    @Field(name = "등급구분명")
    private String LVSENM;
    @Field(name = "급수시설구분명")
    private String WTRSPLYFACILSENM;
    @Field(name = "총인원")
    private String TOTEPNUM;
    @Field(name = "본사종업원수")
    private String HOFFEPCNT;
    @Field(name = "공장사무직종업원수")
    private String FCTYOWKEPCNT;
    @Field(name = "공장판매직종업원수")
    private String FCTYSILJOBEPCNT;
    @Field(name = "공장생산직종업원수")
    private String FCTYPDTJOBEPCNT;
    @Field(name = "건물소유구분명")
    private String BDNGOWNSENM;
    @Field(name = "보증액")
    private String ISREAM;
    @Field(name = "월세액")
    private String MONAM;
    @Field(name = "다중이용업소여부")
    private String MULTUSNUPSOYN;
    @Field(name = "시설총규모")
    private String FACILTOTSCP;
    @Field(name = "전통업소지정번호")
    private String JTUPSOASGNNO;
    @Field(name = "전통업소주된음식")
    private String JTUPSOMAINEDF;
    @Field(name = "홈페이지")
    private String HOMEPAGE;

}

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
 * @since 2022/05/07
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Localdata072404Result {

    @JsonProperty("LOCALDATA_072404")
    public Localdata072404 localdata072404;


    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Localdata072404 {
        @JsonProperty("row")
        public List<Row> row;
        @JsonProperty("RESULT")
        public Result result;
        @JsonProperty("list_total_count")
        public int listTotalCount;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Row {
        @JsonProperty("HOMEPAGE")
        public String homepage;
        @JsonProperty("JTUPSOMAINEDF")
        public String jtupsomainedf;
        @JsonProperty("JTUPSOASGNNO")
        public String jtupsoasgnno;
        @JsonProperty("FACILTOTSCP")
        public String faciltotscp;
        @JsonProperty("MULTUSNUPSOYN")
        public String multusnupsoyn;
        @JsonProperty("MONAM")
        public String monam;
        @JsonProperty("ISREAM")
        public String isream;
        @JsonProperty("BDNGOWNSENM")
        public String bdngownsenm;
        @JsonProperty("FCTYPDTJOBEPCNT")
        public String fctypdtjobepcnt;
        @JsonProperty("FCTYSILJOBEPCNT")
        public String fctysiljobepcnt;
        @JsonProperty("FCTYOWKEPCNT")
        public String fctyowkepcnt;
        @JsonProperty("HOFFEPCNT")
        public String hoffepcnt;
        @JsonProperty("TOTEPNUM")
        public String totepnum;
        @JsonProperty("WTRSPLYFACILSENM")
        public String wtrsplyfacilsenm;
        @JsonProperty("LVSENM")
        public String lvsenm;
        @JsonProperty("TRDPJUBNSENM")
        public String trdpjubnsenm;
        @JsonProperty("WMEIPCNT")
        public String wmeipcnt;
        @JsonProperty("MANEIPCNT")
        public String maneipcnt;
        @JsonProperty("SNTUPTAENM")
        public String sntuptaenm;
        @JsonProperty("Y")
        public String y;
        @JsonProperty("X")
        public String x;
        @JsonProperty("UPTAENM")
        public String uptaenm;
        @JsonProperty("UPDATEDT")
        public String updatedt;
        @JsonProperty("UPDATEGBN")
        public String updategbn;
        @JsonProperty("LASTMODTS")
        public String lastmodts;
        @JsonProperty("BPLCNM")
        public String bplcnm;
        @JsonProperty("RDNPOSTNO")
        public String rdnpostno;
        @JsonProperty("RDNWHLADDR")
        public String rdnwhladdr;
        @JsonProperty("SITEWHLADDR")
        public String sitewhladdr;
        @JsonProperty("SITEPOSTNO")
        public String sitepostno;
        @JsonProperty("SITEAREA")
        public String sitearea;
        @JsonProperty("SITETEL")
        public String sitetel;
        @JsonProperty("ROPNYMD")
        public String ropnymd;
        @JsonProperty("CLGENDDT")
        public String clgenddt;
        @JsonProperty("CLGSTDT")
        public String clgstdt;
        @JsonProperty("DCBYMD")
        public String dcbymd;
        @JsonProperty("DTLSTATENM")
        public String dtlstatenm;
        @JsonProperty("DTLSTATEGBN")
        public String dtlstategbn;
        @JsonProperty("TRDSTATENM")
        public String trdstatenm;
        @JsonProperty("TRDSTATEGBN")
        public String trdstategbn;
        @JsonProperty("APVCANCELYMD")
        public String apvcancelymd;
        @JsonProperty("APVPERMYMD")
        public String apvpermymd;
        @JsonProperty("MGTNO")
        public String mgtno;
        @JsonProperty("OPNSFTEAMCODE")
        public String opnsfteamcode;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result {
        @JsonProperty("MESSAGE")
        public String message;
        @JsonProperty("CODE")
        public String code;
    }
}

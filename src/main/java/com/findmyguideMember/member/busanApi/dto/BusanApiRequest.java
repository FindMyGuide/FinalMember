package com.findmyguideMember.member.busanApi.dto;

import com.findmyguideMember.member.busanApi.domain.BusanApi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BusanApiRequest {

    private Long restaurantId; // 식당 ID

    private String restaurantName; // 식당명
    private String restaurantAddress; // 식당 주소
    private BigDecimal restaurantLa; // 식당 위도
    private BigDecimal restaurantLo; // 식장 경도
    private String telNo; // 식당대표전화번호
    private String restaurantCode; // 영업신고증업태명
    private String restaurantLcnc; // 영업인 허가명
    private String restaurantIntroduce; // 음식점 소개 내용

    public BusanApi toBusanApi(Long restaurantId, String restaurantName,
                               String restaurantAddress, BigDecimal restaurantLa,
                               BigDecimal restaurantLo, String telNo,
                               String restaurantCode, String restaurantLcnc,
                               String restaurantIntroduce) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantLa = restaurantLa;
        this.restaurantLo = restaurantLo;
        this.telNo = telNo;
        this.restaurantCode = restaurantCode;
        this.restaurantLcnc = restaurantLcnc;
        this.restaurantIntroduce = restaurantIntroduce;

        return BusanApi.builder().restaurantId(this.restaurantId)
                .restaurantName(this.restaurantName)
                .restaurantAddress(this.restaurantAddress)
                .restaurantLa(this.restaurantLa)
                .restaurantLo(this.restaurantLo)
                .telNo(this.telNo)
                .restaurantCode(this.restaurantCode)
                .restaurantLcnc(this.restaurantLcnc)
                .restaurantIntroduce(this.restaurantIntroduce)
                .build();
    }
}

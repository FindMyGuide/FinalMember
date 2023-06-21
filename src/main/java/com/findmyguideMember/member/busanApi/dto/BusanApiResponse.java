package com.findmyguideMember.member.busanApi.dto;

import com.findmyguideMember.member.busanApi.domain.BusanApi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BusanApiResponse {

    private Long restaurantId; // 식당 ID
    private String restaurantName; // 식당명
    private String restaurantAddress; // 식당 주소
    private BigDecimal restaurantLa; // 식당 위도
    private BigDecimal restaurantLo; // 식장 경도
    private String telNo; // 식당대표전화번호
    private String restaurantCode; // 영업신고증업태명
    private String restaurantLcnc; // 영업인 허가명
    private String restaurantIntroduce; // 음식점 소개 내용

    public BusanApiResponse(BusanApi busanApi) {
        this.restaurantId = busanApi.getRestaurantId();
        this.restaurantName = busanApi.getRestaurantName();
        this.restaurantAddress = busanApi.getRestaurantAddress();
        this.restaurantLa = busanApi.getRestaurantLa();
        this.restaurantLo = busanApi.getRestaurantLo();
        this.telNo = busanApi.getTelNo();
        this.restaurantCode = busanApi.getRestaurantCode();
        this.restaurantLcnc = busanApi.getRestaurantLcnc();
        this.restaurantIntroduce = busanApi.getRestaurantIntroduce();
    }


}

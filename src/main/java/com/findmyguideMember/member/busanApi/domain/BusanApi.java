package com.findmyguideMember.member.busanApi.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusanApi {

    @Id
    private Long restaurantId; // 식당 ID

    private String restaurantName; // 식당명
    private String restaurantAddress; // 식당 주소
    private BigDecimal restaurantLa; // 식당 위도
    private BigDecimal restaurantLo; // 식장 경도
    private String telNo; // 식당대표전화번호
    private String restaurantCode; // 영업신고증업태명
    private String restaurantLcnc; // 영업인 허가명
    private String restaurantIntroduce; // 음식점 소개 내용
}

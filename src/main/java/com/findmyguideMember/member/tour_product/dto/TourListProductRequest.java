package com.findmyguideMember.member.tour_product.dto;

import com.findmyguideMember.member.member.domain.Member;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TourListProductRequest {

    private Member member;
    private String title;


}

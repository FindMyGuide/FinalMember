package com.findmyguideMember.member.tour_product.dto;

import com.findmyguideMember.member.member.domain.Member;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TourListProductResponse {


    private String title;

    public TourListProductResponse(TourListProduct tourListProduct){
        this.title = tourListProduct.getTitle();

    }
}

package com.findmyguideMember.member.tour_product.dto;

import com.findmyguideMember.member.member.domain.Member;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TourListProductRequest {

    private String title;

    private String content;


    public TourListProduct toTourListProduct(){
        return TourListProduct.builder()
                .title(title)
                .content(content)
                .build();
    }


}

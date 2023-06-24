package com.findmyguideMember.member.restaurant_review.dto;

import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantReviewRequest {

    private int rating;

    private String content;

    public RestaurantReview toRestaurantReview() {
        return RestaurantReview.builder()
                .rating(rating)
                .content(content)
                .build();
    }
}

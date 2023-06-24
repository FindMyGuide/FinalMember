package com.findmyguideMember.member.restaurant_review.dto;

import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;

public class RestaurantReviewResponse {
    private  int rating;

    private String content;

    public RestaurantReviewResponse(RestaurantReview restaurantReview) {
        this.rating = restaurantReview.getRating();
        this.content = restaurantReview.getContent();
    }
}

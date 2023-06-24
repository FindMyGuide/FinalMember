package com.findmyguideMember.member.tour_location_review.dto;

import com.findmyguideMember.member.tour_location_review.domain.TourLocationReview;

public class TourLocationReviewResponse {

    private int rating;

    private String content;

    public TourLocationReviewResponse(TourLocationReview tourLocationReview) {
        this.rating = tourLocationReview.getRating();
        this.content = tourLocationReview.getContent();
    }
}

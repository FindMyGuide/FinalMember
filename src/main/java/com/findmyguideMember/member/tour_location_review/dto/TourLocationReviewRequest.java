package com.findmyguideMember.member.tour_location_review.dto;

import com.findmyguideMember.member.tour_location_review.domain.TourLocationReview;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TourLocationReviewRequest {

    private int rating;

    private String content;

    public TourLocationReview toTourLocationReview() {
        return TourLocationReview.builder()
                .rating(rating)
                .content(content)
                .build();
    }
}

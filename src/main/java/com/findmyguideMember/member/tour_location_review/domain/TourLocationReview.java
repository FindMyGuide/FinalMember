package com.findmyguideMember.member.tour_location_review.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TourLocationReview {

    @Id
    @GeneratedValue
    @Column(name = "tour_location_review_id")
    private Long id;

    private int rating;

    private String content;
}

package com.findmyguideMember.member.restaurant_review.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantReview {

    @Id
    @GeneratedValue
    @Column(name = "restaurant_review_id")
    private Long id;

    private int rating;

    private String content;
}

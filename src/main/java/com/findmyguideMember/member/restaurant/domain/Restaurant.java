package com.findmyguideMember.member.restaurant.domain;

import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Restaurant {
    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Long id;

    @OneToMany
    private List<RestaurantReview> restaurantReviews = new ArrayList<>();
}

package com.findmyguideMember.member.tour_location.domain;

import com.findmyguideMember.member.tour_location_review.domain.TourLocationReview;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class TourLocation {
    @Id
    @GeneratedValue
    @Column(name = "tour_location_id")
    private Long id;

    @OneToMany
    private List<TourLocationReview> tourLocationReviews = new ArrayList<>();
}

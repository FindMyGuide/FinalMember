package com.findmyguideMember.member.member.domain;

import com.findmyguideMember.member.member.MemberGrade;
import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;
import com.findmyguideMember.member.tour_location_review.domain.TourLocationReview;
import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
    private String nickname;

    private MemberGrade grade;

    @OneToMany(mappedBy = "member")
    private List<TourListProduct> TourListProducts = new ArrayList<>();

    @OneToMany
    private List<TourLocationReview> tourLocationReviews = new ArrayList<>();

    @OneToMany
    private List<RestaurantReview> restaurantReviews = new ArrayList<>();
}

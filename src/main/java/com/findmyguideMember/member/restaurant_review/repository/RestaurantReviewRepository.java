package com.findmyguideMember.member.restaurant_review.repository;

import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantReviewRepository extends JpaRepository<RestaurantReview, Long> {
}

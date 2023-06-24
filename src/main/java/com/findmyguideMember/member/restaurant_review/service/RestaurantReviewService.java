package com.findmyguideMember.member.restaurant_review.service;

import com.findmyguideMember.member.restaurant_review.domain.RestaurantReview;
import com.findmyguideMember.member.restaurant_review.dto.RestaurantReviewRequest;
import com.findmyguideMember.member.restaurant_review.dto.RestaurantReviewResponse;
import com.findmyguideMember.member.restaurant_review.repository.RestaurantReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RestaurantReviewService {

    private final RestaurantReviewRepository restaurantReviewRepository;

    @Transactional
    public RestaurantReviewResponse save(RestaurantReviewRequest restaurantReviewRequest) {

        RestaurantReview save = restaurantReviewRepository.save(restaurantReviewRequest.toRestaurantReview());
        return new RestaurantReviewResponse(save);
    }

    // 수정

    public void delete(RestaurantReview restaurantReview) {
        restaurantReviewRepository.deleteById(restaurantReview.getId());
    }
}

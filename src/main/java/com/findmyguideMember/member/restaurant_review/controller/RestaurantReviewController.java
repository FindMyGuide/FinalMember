package com.findmyguideMember.member.restaurant_review.controller;

import com.findmyguideMember.member.restaurant_review.dto.RestaurantReviewRequest;
import com.findmyguideMember.member.restaurant_review.dto.RestaurantReviewResponse;
import com.findmyguideMember.member.restaurant_review.service.RestaurantReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/RestaurntReview")
public class RestaurantReviewController {
    private RestaurantReviewService restaurantReviewService;

    @PostMapping
    public ResponseEntity<RestaurantReviewResponse> register(
            @RequestBody final RestaurantReviewRequest restaurantReviewRequest) {
        RestaurantReviewResponse restaurantReviewResponse = restaurantReviewService.save(restaurantReviewRequest);
        return ResponseEntity.ok().body(restaurantReviewResponse);
    }
}

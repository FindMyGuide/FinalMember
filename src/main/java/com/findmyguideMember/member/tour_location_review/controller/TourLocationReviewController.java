package com.findmyguideMember.member.tour_location_review.controller;

import com.findmyguideMember.member.tour_location_review.dto.TourLocationReviewResponse;
import com.findmyguideMember.member.tour_location_review.dto.TourLocationReviewRequest;
import com.findmyguideMember.member.tour_location_review.service.TourLocationReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/TourLocationReview")
public class TourLocationReviewController {
    private TourLocationReviewService tourLocationReviewService;

    @PostMapping
    public ResponseEntity<TourLocationReviewResponse> register(
            @RequestBody final TourLocationReviewRequest tourLocationReviewRequest) {
        TourLocationReviewResponse tourLocationReviewResponse = tourLocationReviewService.save(tourLocationReviewRequest);
        return ResponseEntity.ok().body(tourLocationReviewResponse);
    }
}

package com.findmyguideMember.member.tour_location_review.service;

import com.findmyguideMember.member.tour_location_review.domain.TourLocationReview;
import com.findmyguideMember.member.tour_location_review.dto.TourLocationReviewResponse;
import com.findmyguideMember.member.tour_location_review.dto.TourLocationReviewRequest;
import com.findmyguideMember.member.tour_location_review.repository.TourLocationReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TourLocationReviewService {

    private final TourLocationReviewRepository tourLocationReviewRepository;

    @Transactional
    public TourLocationReviewResponse save(TourLocationReviewRequest tourLocationReviewRequest) {

        TourLocationReview save = tourLocationReviewRepository.save(tourLocationReviewRequest.toTourLocationReview());
        return new TourLocationReviewResponse(save);
    }

    //수정 만들어야함

    public void delete(TourLocationReview tourLocationReview) {
        tourLocationReviewRepository.deleteById(tourLocationReview.getId());
    }
}

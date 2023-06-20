package com.findmyguideMember.member.tour_location.service;

import com.findmyguideMember.member.tour_location.repository.TourLocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TourLocationService {

    private  final TourLocationRepository tourLocationRepository;
}

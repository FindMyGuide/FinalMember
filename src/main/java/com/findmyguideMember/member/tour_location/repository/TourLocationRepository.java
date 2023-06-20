package com.findmyguideMember.member.tour_location.repository;

import com.findmyguideMember.member.tour_location.domain.TourLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourLocationRepository extends JpaRepository<TourLocation, Long> {
}

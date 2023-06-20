package com.findmyguideMember.member.restaurant.repository;

import  com.findmyguideMember.member.restaurant.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}

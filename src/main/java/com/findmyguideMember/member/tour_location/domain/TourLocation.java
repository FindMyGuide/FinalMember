package com.findmyguideMember.member.tour_location.domain;

import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class TourLocation {
    @Id
    @GeneratedValue
    @Column(name = "tour_location_id")
    private Long id;
}

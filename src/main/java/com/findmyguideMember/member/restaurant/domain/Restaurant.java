package com.findmyguideMember.member.restaurant.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Restaurant {
    @Id
    @GeneratedValue
    @Column(name = "restaurant_id")
    private Long id;
}

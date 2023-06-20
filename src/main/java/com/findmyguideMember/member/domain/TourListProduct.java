package com.findmyguideMember.member.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class TourListProduct {

    @Id @GeneratedValue
    @Column(name = "tourlist_id")
    private Long id;

}

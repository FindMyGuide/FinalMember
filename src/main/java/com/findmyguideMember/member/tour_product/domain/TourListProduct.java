package com.findmyguideMember.member.tour_product.domain;

import com.findmyguideMember.member.member.domain.Member;
import com.findmyguideMember.member.tour_product.enum_language.Language;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class TourListProduct {

    @Id
    @GeneratedValue
    @Column(name = "tourlist_id")
    private Long id;

    @ManyToOne
    private Member member;

    private String title;

    private String content;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Language languages;
    // 시간 포맷 설정 가능
    private LocalDate tourStartDate;


    // 시간 포맷 설정 가능
    private LocalDate tourEndDate;





}

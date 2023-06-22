package com.findmyguideMember.member.tour_location.domain;

import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TourLocation {

    @Id
    @Column(name = "tour_location_id")
    private Long id;

    private String title;
    private String image;
    private String mapx;
    private String mapy;

}

package com.findmyguideMember.member.tour_location.dto;

import com.findmyguideMember.member.tour_location.domain.TourLocation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TourLocationRequest {

    private Long id;
    private String title;
    private String image;
    private String mapx;
    private String mapy;

    public TourLocation toTourLocation(Long id, String title,String image,
                                       String mapx, String mapy) {

        this.id = id;
        this.title = title;
        this.image = image;
        this.mapx = mapx;
        this.mapy = mapy;

        return TourLocation.builder()
                .id(this.id).title(this.title)
                .image(this.image)
                .mapx(this.mapx)
                .mapy(this.mapy)
                .build();
    }
}

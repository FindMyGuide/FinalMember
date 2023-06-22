package com.findmyguideMember.member.tour_product.controller;

import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import com.findmyguideMember.member.tour_product.dto.TourListProductRequest;
import com.findmyguideMember.member.tour_product.dto.TourListProductResponse;
import com.findmyguideMember.member.tour_product.enum_language.Language;
import com.findmyguideMember.member.tour_product.service.TourListProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
@RequestMapping("/tourListProduct")
public class Controller {
    private TourListProductService tourListProductService;

    @PostMapping
    public ResponseEntity<TourListProductResponse> register(
            @RequestBody final TourListProductRequest tourListProductRequest) {
        TourListProductResponse tourListProductResponse =  tourListProductService.save(tourListProductRequest);
        return ResponseEntity.ok().body(tourListProductResponse);
    }

}

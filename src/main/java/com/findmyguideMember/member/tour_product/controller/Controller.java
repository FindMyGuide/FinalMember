package com.findmyguideMember.member.tour_product.controller;

import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import com.findmyguideMember.member.tour_product.enum_language.Language;
import com.findmyguideMember.member.tour_product.service.TourListProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class Controller {
    private TourListProductService tourListProductService;

    @PostMapping("/test")
    public void register(){
        TourListProduct tourListProduct = new TourListProduct();

        tourListProductService.save(tourListProduct);
    }






}

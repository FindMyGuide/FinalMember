package com.findmyguideMember.member.tour_product.service;


import com.findmyguideMember.member.tour_product.domain.TourListProduct;
import com.findmyguideMember.member.tour_product.dto.TourListProductRequest;
import com.findmyguideMember.member.tour_product.dto.TourListProductResponse;
import com.findmyguideMember.member.tour_product.repository.TourListProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TourListProductService {

    private final TourListProductRepository  tourListProductRepository;

    @Transactional
    public TourListProductResponse save(TourListProductRequest tourListProductRequest){

        TourListProduct save = tourListProductRepository.save(tourListProductRequest.toTourListProduct());
        return new TourListProductResponse(save);

    }




}

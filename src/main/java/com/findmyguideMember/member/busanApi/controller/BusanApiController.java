package com.findmyguideMember.member.busanApi.controller;

import com.findmyguideMember.member.busanApi.service.BusanApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class BusanApiController {

    private final BusanApiService busanApiService = new BusanApiService();

    @RequestMapping(value="/testValue", method = RequestMethod.GET)
    public String result() throws IOException {
        return busanApiService.getApi();
    }
}

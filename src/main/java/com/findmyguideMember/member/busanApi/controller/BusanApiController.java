package com.findmyguideMember.member.busanApi.controller;

import com.findmyguideMember.member.busanApi.service.BusanApiService;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class BusanApiController {

    private final BusanApiService busanApiService;

    @GetMapping("/busanApi")
    @ResponseBody
    public String busanResult() {
        return busanApiService.getApi();
    }
}

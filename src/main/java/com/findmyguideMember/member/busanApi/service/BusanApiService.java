package com.findmyguideMember.member.busanApi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BusanApiService {

    public String getApi() throws IOException {
        String result = "";

        URL url = new URL("https://busan-7beach.openapi.redtable.global/api/rstr?serviceKey=tLrTsrUteIbenzAV9bAVR6zv01p69xPrtGdx9pu9Vl4GOey9XJlkXFFCZuNM5Xur");

        BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(),
                "UTF-8"));


        result = bf.readLine();



        return result;
    }


}

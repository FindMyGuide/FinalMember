package com.findmyguideMember.member.busanApi.service;

import com.findmyguideMember.member.busanApi.domain.BusanApi;
import com.findmyguideMember.member.busanApi.dto.BusanApiRequest;
import com.findmyguideMember.member.busanApi.dto.BusanApiResponse;
import com.findmyguideMember.member.busanApi.repository.BusanApiRepository;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BusanApiService {

    private final BusanApiRepository busanApiRepository;

    @Transactional
    public String getApi() {
        String result;

        try {
            URL url = new URL("https://busan-7beach.openapi.redtable.global/api/rstr?serviceKey=tLrTsrUteIbenzAV9bAVR6zv01p69xPrtGdx9pu9Vl4GOey9XJlkXFFCZuNM5Xur");

            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(),
                    "UTF-8"));
            result = bf.readLine();
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(result);
            JSONArray body = (JSONArray) jsonObject.get("body");

//            for (int i = 0; i < body.size(); i++) {
                JSONObject items = (JSONObject) body.get(0);

                Long restaurantId = 0L;
                if (items.get("RSTR_ID") != null) {
                    restaurantId = Long.valueOf(items.get("RSTR_ID").toString()); // 식당 ID
                } else  {
                    System.out.println("error!");
                }

                String restaurantName = "";
                if (items.get("RSTR_NM") != null) {
                    restaurantName = items.get("RSTR_NM").toString(); // 식당명
                } else  {
                    System.out.println("error!");
                }

                String restaurantAddress = "";
                if (items.get("RSTR_RDNMADR") != null){
                    restaurantAddress = items.get("RSTR_RDNMADR").toString(); // 식당 주소
                } else  {
                    System.out.println("error!");
                }

                BigDecimal restaurantLa = new BigDecimal(0);
                if (items.get("RSTR_LA") != null){
                    restaurantLa = new BigDecimal(items.get("RSTR_LA").toString()); // 식당 위도
                } else  {
                    System.out.println("error!");
                }

                BigDecimal restaurantLo = new BigDecimal(0);
                if (items.get("RSTR_LO") != null){
                    restaurantLo = new BigDecimal(items.get("RSTR_LO").toString());// 식장 경도
                } else  {
                    System.out.println("error!");
                }

                String telNo = "";
                if (items.get("RSTR_TELNO") != null){
                    telNo = items.get("RSTR_TELNO").toString(); // 식당대표전화번호
                } else  {
                    System.out.println("error!");
                }

                String restaurantCode = "";
                if (items.get("BSNS_STATM_BZCND_NM") != null){
                    restaurantCode = items.get("BSNS_STATM_BZCND_NM").toString(); // 영업신고증업태명
                } else  {
                    System.out.println("error!");
                }

                String restaurantLcnc = "";
                if (items.get("BSNS_LCNC_NM") != null){
                    restaurantLcnc = items.get("BSNS_LCNC_NM").toString(); // 영업인 허가명
                } else  {
                    System.out.println("error!");
                }

                String restaurantIntroduce = "";
                if (items.get("RSTR_INTRCN_CONT") != null){
                    restaurantIntroduce = items.get("RSTR_INTRCN_CONT").toString();; // 음식점 소개 내용
                } else  {
                    System.out.println("error!");
                }

                BusanApiRequest busanApiRequest = new BusanApiRequest();
                save(busanApiRequest, restaurantId, restaurantName,
                        restaurantAddress,restaurantLa, restaurantLo, telNo,
                        restaurantCode, restaurantLcnc, restaurantIntroduce);

                System.out.println(Long.valueOf(items.get("RSTR_ID").toString()));
                System.out.println(items.get("RSTR_NM").toString());
                System.out.println(items.get("RSTR_RDNMADR").toString());
                System.out.println(Float.parseFloat(items.get("RSTR_LA").toString()));
                System.out.println(Float.parseFloat(items.get("RSTR_LO").toString()));
                System.out.println(items.get("RSTR_TELNO").toString());
                System.out.println(items.get("BSNS_STATM_BZCND_NM").toString());
                System.out.println(items.get("BSNS_LCNC_NM").toString());
                System.out.println(items.get("RSTR_INTRCN_CONT").toString());
//            }

            result = "성공적";

        } catch (Exception e) {
            result = "실패했습니다.";
            System.out.println(e);
        }

        return result;
    }

    @Transactional
    public void save(BusanApiRequest busanApiRequest, Long restaurantId, String restaurantName,
                     String restaurantAddress, BigDecimal restaurantLa,
                     BigDecimal restaurantLo, String telNo,
                     String restaurantCode, String restaurantLcnc,
                     String restaurantIntroduce) {

        BusanApi save = busanApiRepository.save(busanApiRequest.toBusanApi(restaurantId,
                restaurantName, restaurantAddress, restaurantLa, restaurantLo,
                telNo, restaurantCode, restaurantLcnc, restaurantIntroduce));

        System.out.println(new BusanApiResponse(busanApiRepository.findById(new BusanApiResponse(save).getRestaurantId()).get()).getRestaurantId());
    }

}

package com.greenart.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.mapper.DaeguHotelMapper;
import com.greenart.service.DaeguHotelService;
import com.greenart.vo.DaeguHotelVO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaeguHotelAPIController {
    @Autowired
    DaeguHotelService service;
    @Autowired
    DaeguHotelMapper mapper;
    
    // https://thegoodnight.daegu.go.kr/ajax/api/thegoodnight.html?mode=json&item_count=200
    @GetMapping("/api/daeguHotel")
    public Map<String, Object> getDaeguHotel() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("https://thegoodnight.daegu.go.kr/ajax/api/thegoodnight.html"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("mode","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("item_count","UTF-8") + "=" + URLEncoder.encode("200", "UTF-8"));

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("ContentType", "application/json");

        System.out.println("code : "+conn.getResponseCode());
        System.out.println("message : "+conn.getResponseMessage());

        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        }
        else {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line = null;
        while((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();

        try{
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(sb.toString());
            JSONArray dataArray = (JSONArray) jsonObj.get("data");
            for(int i=0; i<dataArray.size(); i++) {
                JSONObject item = (JSONObject)dataArray.get(i);
                // System.out.println("=================================");
                // System.out.println("호텔이름 : "+item.get("shop"));
                // System.out.println("전화번호 : "+item.get("tel"));
                // System.out.println("주소 : "+item.get("address"));
                // System.out.println("제공 : "+item.get("offer"));
                // System.out.println("시설 : "+item.get("facilities"));
                // System.out.println("태그 : "+item.get("tag"));

                DaeguHotelVO vo = new DaeguHotelVO();
                vo.setH_shop((String)item.get("shop").toString());
                vo.setH_tel((String)item.get("tel").toString());
                vo.setH_address((String)item.get("address").toString());
                vo.setH_offer((String)item.get("offer").toString());
                vo.setH_facilities((String)item.get("facilities").toString());
                vo.setH_tag((String)item.get("tag").toString());
                System.out.println(vo);
                service.insertDaeguHotel(vo);
            }
        }
        catch(ParseException pe) {
            pe.printStackTrace();
        }

        resultMap.put("status", true);
        resultMap.put("message", "데이터가 입력되었습니다.");
        return resultMap;
    }

    @GetMapping("/api/hotelName")
    public Map<String, Object> getHotelName(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectHotel();
        resultMap.put("data", list);
        return resultMap;
    }

    @PatchMapping("/hotel/api/update")
    public Map<String, Object> postHotelUpdateAPI(@RequestBody DaeguHotelVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.updateProduct(vo);
        resultMap.put("status", true);
        resultMap.put("message", "등록되었습니다");

        return resultMap;
    }

}

package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.greenart.service.HotelCartService;
import com.greenart.vo.HotelCartVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelCartAPIController {
    @Autowired
    HotelCartService service;
    
    @PostMapping("/cart/add")
    public Map<String, Object> postCartAdd(
        @RequestBody HotelCartVO vo, HttpSession session
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();

        boolean duplicated = service.isDuplicatedCart(vo.getHc_h_seq());
        if(duplicated) {
            resultMap.put("status", false);
            resultMap.put("message", "이미 관심 목록에 있습니다.");
            return resultMap;
        }
        service.insertCartHotel(vo);
        
        resultMap.put("status", true);
        resultMap.put("message", "관심 목록에 추가되었습니다");

        return resultMap;
    }
    
    @DeleteMapping("/cart/remove")
    public Map<String, Object> deleteCart(
        @RequestParam Integer h_seq, @RequestParam Integer mi_seq, HttpSession session
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.deleteCartHotel(h_seq, mi_seq);
        resultMap.put("status", true);
        resultMap.put("message", "삭제되었습니다");

        return resultMap;
    }

}

package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.greenart.service.HotelCartService;
import com.greenart.vo.HotelCartVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
        service.insertProduct(vo);
        resultMap.put("status", true);
        resultMap.put("message", "카트에 상품이 추가되었습니다");
        Integer cart_cnt = service.selectCount(vo.getHc_mi_seq());
        session.setAttribute("cart_cnt", cart_cnt);
        return resultMap;
    }
    
    @DeleteMapping("/cart/remove")
    public Map<String, Object> deleteCart(
        @RequestParam Integer h_seq, @RequestParam Integer mi_seq, HttpSession session
    ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.deleteCartProduct(h_seq, mi_seq);
        resultMap.put("status", true);
        resultMap.put("message", "삭제되었습니다");

        Integer cart_cnt = service.selectCount(mi_seq);
        session.setAttribute("cart_cnt", cart_cnt);

        return resultMap;
    }

    @PatchMapping("/cart/change")
    public Map<String, Object> cartChange(
        @RequestParam Integer h_seq, @RequestParam Integer mi_seq,
        @RequestParam Integer cnt
        ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.changeProductCnt(h_seq, mi_seq, cnt);
        resultMap.put("status", true);
        return resultMap;
    }

}

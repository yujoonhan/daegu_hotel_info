package com.greenart.controller;

import java.util.List;

import com.greenart.service.HotelCartService;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelCartController {
    @Autowired
    HotelCartService service;

    @GetMapping("/cart")
    public String getHotelCart(){
        return "redirect:/login";
    }
    
    // http://localhost/cart/user002?hGp3lVn=123
    @GetMapping("/cart/{member_id}")
    public String getHotelCart(
        @PathVariable @Nullable String member_id,
        @RequestParam Integer hGp3lVn,
        Model model
    ){
        if(member_id == null){
            return "redirect:/login";
        }
        List<DaeguHotelVO> list = service.selectCartProducts(hGp3lVn);
        model.addAttribute("list", list);
        return "/product/cart";
    }
}

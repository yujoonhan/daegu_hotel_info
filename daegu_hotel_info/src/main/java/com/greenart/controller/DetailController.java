package com.greenart.controller;


import com.greenart.service.DaeguHotelService;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailController {
    @Autowired
    DaeguHotelService service;

    @GetMapping("/detail")
    public String getDetail(@RequestParam Integer h_seq, Model model) {
        DaeguHotelVO item = service.selectHotelNameBySeq(h_seq);
        model.addAttribute("product", item);

        return "/detail/info";
    }
}

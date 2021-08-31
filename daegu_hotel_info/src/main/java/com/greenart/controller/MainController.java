package com.greenart.controller;

import com.greenart.mapper.DaeguHotelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    DaeguHotelMapper mapper;

    @GetMapping("/")
    public String getMain() {
        return "/index";
    }

    @GetMapping("/search")
    public String getSearch() {
        return "/search/search";
    }

}

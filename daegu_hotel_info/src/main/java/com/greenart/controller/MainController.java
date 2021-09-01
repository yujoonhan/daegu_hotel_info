package com.greenart.controller;

import javax.servlet.http.HttpSession;

import com.greenart.mapper.DaeguHotelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    DaeguHotelMapper mapper;

    @GetMapping("/")
    public String getMain(Model model, HttpSession session){
        return "/index";
    }

    @GetMapping("/search")
    public String getSearch() {
        return "/search/search";
    }

}

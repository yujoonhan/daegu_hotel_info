package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.SearchHotelService;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchHotelAPICotroller {
    @Autowired
    SearchHotelService service;

    @GetMapping("/api/search/nam")
    public Map<String, Object> getSearchNamList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchNam(keyword);
        resultMap.put("list", list);
        return resultMap;
    }
    @GetMapping("/api/search/adr")
    public Map<String, Object> getSearchAdrList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchAdr(keyword);
        resultMap.put("list", list);
        return resultMap;
    }
    @GetMapping("/api/search/ofr")
    public Map<String, Object> getSearchOfrList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchOfr(keyword);
        resultMap.put("list", list);
        return resultMap;
    }
    @GetMapping("/api/search/fac")
    public Map<String, Object> getSearchFacList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchFac(keyword);
        resultMap.put("list", list);
        return resultMap;
    }
    @GetMapping("/api/search/tag")
    public Map<String, Object> getSearchTagList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchTag(keyword);
        resultMap.put("list", list);
        return resultMap;
    }
}

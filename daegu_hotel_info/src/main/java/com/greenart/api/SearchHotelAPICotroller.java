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

    @GetMapping("/api/search/add_list")
    public Map<String, Object> getAddList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchAdd(keyword);
        resultMap.put("add_list", list);
        return resultMap;
    }
    @GetMapping("/api/search/off_list")
    public Map<String, Object> getOffList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchOff(keyword);
        resultMap.put("off_list", list);
        return resultMap;
    }
    @GetMapping("/api/search/fac_list")
    public Map<String, Object> getFacList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchFac(keyword);
        resultMap.put("fac_list", list);
        return resultMap;
    }
    @GetMapping("/api/search/nam_list")
    public Map<String, Object> getNamList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchNam(keyword);
        resultMap.put("nam_list", list);
        return resultMap;
    }
    @GetMapping("/api/search/tag_list")
    public Map<String, Object> getTagList(
        @RequestParam @Nullable String keyword
    ) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> list = service.selectSearchTag(keyword);
        resultMap.put("tag_list", list);
        return resultMap;
    }
    

}

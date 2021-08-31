package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.service.DaeguHotelService;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchHotelAPICotroller {
    @Autowired
    DaeguHotelService service;
    
    @GetMapping("/api/searchDis")
    public Map<String, Object> getSearchDis(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchFacDis();
        resultMap.put("searchDis", vo);
        return resultMap;
    }
    @GetMapping("/api/searchBus")
    public Map<String, Object> getSearchBus(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchFacBus();
        resultMap.put("searchBus", vo);
        return resultMap;
    }
    @GetMapping("/api/searchEnt")
    public Map<String, Object> getSearchEnt(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchFacEnt();
        resultMap.put("searchEnt", vo);
        return resultMap;
    }
    @GetMapping("/api/searchVid")
    public Map<String, Object> getSearchVid(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchFacVid();
        resultMap.put("searchVid", vo);
        return resultMap;
    }
    @GetMapping("/api/searchHea")
    public Map<String, Object> getSearchHea(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchFacHea();
        resultMap.put("searchHea", vo);
        return resultMap;
    }


    @GetMapping("/api/searchBre")
    public Map<String, Object> getSearchBre(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerBre();
        resultMap.put("searchBre", vo);
        return resultMap;
    }
    @GetMapping("/api/searchMor")
    public Map<String, Object> getSearchMor(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerMor();
        resultMap.put("searchMor", vo);
        return resultMap;
    }
    @GetMapping("/api/searchLau")
    public Map<String, Object> getSearchLau(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerLau();
        resultMap.put("searchLau", vo);
        return resultMap;
    }
    
    
    @GetMapping("/api/searchTra")
    public Map<String, Object> getSearchTra(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerTra();
        resultMap.put("searchTra", vo);
        return resultMap;
    }
    @GetMapping("/api/searchStr")
    public Map<String, Object> getSearchStr(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerStr();
        resultMap.put("searchStr", vo);
        return resultMap;
    }
    @GetMapping("/api/searchFac")
    public Map<String, Object> getSearchFac(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerFac();
        resultMap.put("searchFac", vo);
        return resultMap;
    }
    @GetMapping("/api/searchNat")
    public Map<String, Object> getSearchNat(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<DaeguHotelVO> vo = service.selectSearchSerNat();
        resultMap.put("searchNat", vo);
        return resultMap;
    }

}

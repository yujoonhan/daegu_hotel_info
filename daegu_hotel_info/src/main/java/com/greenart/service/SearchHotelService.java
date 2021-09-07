package com.greenart.service;

import java.util.List;

import com.greenart.mapper.SearchHotelMapper;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchHotelService {
    @Autowired
    SearchHotelMapper mapper;
    public List<DaeguHotelVO> selectSearchNam(String keyword){
        if(keyword == null){keyword = "%%";}
        else if(keyword != null) {keyword = "%"+keyword+"%";}
        return mapper.selectSearchNam(keyword);
    }
    public List<DaeguHotelVO> selectSearchAdr(String keyword){
        if(keyword == null){keyword = "%%";}
        else if(keyword != null) {keyword = "%"+keyword+"%";}
        return mapper.selectSearchAdr(keyword);
    }
    public List<DaeguHotelVO> selectSearchOfr(String keyword){
        if(keyword == null){keyword = "%%";}
        else if(keyword != null) {keyword = "%"+keyword+"%";}
        return mapper.selectSearchOfr(keyword);
    }
    public List<DaeguHotelVO> selectSearchFac(String keyword){
        if(keyword == null){keyword = "%%";}
        else if(keyword != null) {keyword = "%"+keyword+"%";}
        return mapper.selectSearchFac(keyword);
    }
    public List<DaeguHotelVO> selectSearchTag(String keyword){
        if(keyword == null){keyword = "%%";}
        else if(keyword != null) {keyword = "%"+keyword+"%";}
        return mapper.selectSearchTag(keyword);
    }
}

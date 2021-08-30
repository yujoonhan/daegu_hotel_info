package com.greenart.service;

import java.util.List;

import com.greenart.mapper.DaeguHotelMapper;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaeguHotelService {
    @Autowired
    DaeguHotelMapper mapper;
    public void insertDaeguHotel(DaeguHotelVO vo){
        mapper.insertDaeguHotel(vo);
    }
    public List<DaeguHotelVO> selectHotelName() {
        return mapper.selectHotelName();
    }
    public List<DaeguHotelVO> selectSearchAdr(String region) {
        return mapper.selectSearchAdr(region);
    }
}

package com.greenart.service;

import java.util.List;

import com.greenart.mapper.DaeguHotelMapper;
import com.greenart.vo.DaeguHotelVO;
import com.greenart.vo.HotelImageVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaeguHotelService {
    @Autowired
    DaeguHotelMapper mapper;
    public void insertDaeguHotel(DaeguHotelVO vo){
        mapper.insertDaeguHotel(vo);
    }
    public List<DaeguHotelVO> selectHotel() {
        return mapper.selectHotel();
    }
    public DaeguHotelVO selectHotelNameBySeq(Integer h_seq) {
        return mapper.selectHotelNameBySeq(h_seq);
    }

    public void insertHotelImage(HotelImageVO vo){
        mapper.insertHotelImage(vo);
    }
    public String selectHotelImagePath(String uri){
        return mapper.selectHotelImagePath(uri);
    }
    public void updateProduct(DaeguHotelVO vo){
        mapper.updateProduct(vo);
    }
}

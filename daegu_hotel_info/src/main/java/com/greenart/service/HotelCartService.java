package com.greenart.service;

import java.util.List;

import com.greenart.mapper.HotelCartMapper;
import com.greenart.vo.DaeguHotelVO;
import com.greenart.vo.HotelCartVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelCartService {
    @Autowired HotelCartMapper mapper;

    public void insertCartHotel(HotelCartVO vo){
        mapper.insertCartHotel(vo);
    }

    public List<DaeguHotelVO> selectCartHotels(Integer mi_seq){
        return mapper.selectCartHotels(mi_seq);
    }

    public void deleteCartHotel(Integer h_seq, Integer mi_seq){
        mapper.deleteCartHotel(h_seq, mi_seq);
    }

    public boolean isDuplicatedCart(Integer seq) {
        return mapper.selectCartBySeq(seq) > 0;
    }
}

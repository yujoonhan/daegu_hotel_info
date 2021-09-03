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

    public void insertProduct(HotelCartVO vo){
        mapper.insertProduct(vo);
    }

    public List<DaeguHotelVO> selectCartProducts(Integer mi_seq){
        return mapper.selectCartProducts(mi_seq);
    }

    public void deleteCartProduct(Integer h_seq, Integer mi_seq){
        mapper.deleteCartProduct(h_seq, mi_seq);
    }

    public boolean isDuplicatedCart(Integer seq) {
        return mapper.selectCartBySeq(seq) > 0;
    }
}

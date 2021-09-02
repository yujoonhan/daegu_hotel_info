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
        Integer cnt = mapper.selectCartProductCnt(vo);
        if(cnt == 1){
            mapper.updateCartProductCnt(vo);
        }
        else{
            mapper.insertProduct(vo);
        }
    }
    public Integer selectCount(Integer mi_seq){
        return mapper.selectCount(mi_seq);
    }
    public List<DaeguHotelVO> selectCartProducts(Integer mi_seq){
        return mapper.selectCartProducts(mi_seq);
    }
    
    public void deleteCartProduct(Integer h_seq, Integer mi_seq){
        mapper.deleteCartProduct(h_seq, mi_seq);
    }

    public void changeProductCnt(Integer h_seq, Integer mi_seq, Integer cnt){
        mapper.changeProductCnt(h_seq, mi_seq, cnt);
    }
}

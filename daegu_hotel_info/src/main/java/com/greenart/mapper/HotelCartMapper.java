package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;
import com.greenart.vo.HotelCartVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelCartMapper {
    public void insertProduct(HotelCartVO vo);
    public Integer selectCartProductCnt(HotelCartVO vo);
    public void updateCartProductCnt(HotelCartVO vo);
    public Integer selectCount(Integer mi_seq);
    public List<DaeguHotelVO> selectCartProducts(Integer mi_seq);

    public void deleteCartProduct(Integer h_seq, Integer mi_seq);
    public void changeProductCnt(Integer hi_seq, Integer mi_seq, Integer cnt);
}

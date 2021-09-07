package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;
import com.greenart.vo.HotelCartVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HotelCartMapper {
    public void insertCartHotel(HotelCartVO vo);
    public List<DaeguHotelVO> selectCartHotels(Integer mi_seq);

    public void deleteCartHotel(Integer h_seq, Integer mi_seq);
    public Integer selectCartBySeq(Integer seq);

}

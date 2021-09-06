package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;
import com.greenart.vo.HotelImageVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaeguHotelMapper {
    public void insertDaeguHotel(DaeguHotelVO vo);
    public List<DaeguHotelVO> selectHotel();
    public DaeguHotelVO selectHotelNameBySeq(Integer h_seq);

    public void insertHotelImage(HotelImageVO vo);
    public String selectHotelImagePath(String uri);
    public void updateProduct(DaeguHotelVO vo);
    
}

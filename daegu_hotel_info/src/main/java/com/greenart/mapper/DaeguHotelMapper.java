package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaeguHotelMapper {
    public void insertDaeguHotel(DaeguHotelVO vo);
    public List<DaeguHotelVO> selectHotelName();
    public List<DaeguHotelVO> selectSearchAdr(String region);
}

package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchHotelMapper {
    public List<DaeguHotelVO> selectSearchNam(String keyword);
    public List<DaeguHotelVO> selectSearchAdr(String keyword);
    public List<DaeguHotelVO> selectSearchOfr(String keyword);
    public List<DaeguHotelVO> selectSearchFac(String keyword);
    public List<DaeguHotelVO> selectSearchTag(String keyword);
}

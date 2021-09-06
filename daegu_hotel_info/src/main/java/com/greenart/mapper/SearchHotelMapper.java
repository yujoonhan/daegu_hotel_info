package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchHotelMapper {
    public List<DaeguHotelVO> selectSearchAdd(String keyword);
    public List<DaeguHotelVO> selectSearchOff(String keyword);
    public List<DaeguHotelVO> selectSearchFac(String keyword);
    public List<DaeguHotelVO> selectSearchNam(String keyword);
    public List<DaeguHotelVO> selectSearchTag(String keyword);
}

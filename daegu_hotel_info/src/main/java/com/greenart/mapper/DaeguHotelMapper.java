package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguHotelVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaeguHotelMapper {
    public void insertDaeguHotel(DaeguHotelVO vo);
    public List<DaeguHotelVO> selectHotel();
    public DaeguHotelVO selectHotelNameBySeq(Integer h_seq);

    public String getHotelImageFileName(String uri);

    
    public List<DaeguHotelVO> selectSearchFacDis();
    public List<DaeguHotelVO> selectSearchFacBus();
    public List<DaeguHotelVO> selectSearchFacEnt();
    public List<DaeguHotelVO> selectSearchFacVid();
    public List<DaeguHotelVO> selectSearchFacHea();

    public List<DaeguHotelVO> selectSearchSerBre();
    public List<DaeguHotelVO> selectSearchSerMor();
    public List<DaeguHotelVO> selectSearchSerLau();
    
    public List<DaeguHotelVO> selectSearchSerTra();
    public List<DaeguHotelVO> selectSearchSerStr();
    public List<DaeguHotelVO> selectSearchSerFac();
    public List<DaeguHotelVO> selectSearchSerNat();
    
}

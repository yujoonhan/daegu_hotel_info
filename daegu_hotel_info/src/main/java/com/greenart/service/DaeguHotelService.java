package com.greenart.service;

import java.util.List;

import com.greenart.mapper.DaeguHotelMapper;
import com.greenart.vo.DaeguHotelVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaeguHotelService {
    @Autowired
    DaeguHotelMapper mapper;
    public void insertDaeguHotel(DaeguHotelVO vo){
        mapper.insertDaeguHotel(vo);
    }
    public List<DaeguHotelVO> selectHotel() {
        return mapper.selectHotel();
    }
    public DaeguHotelVO selectHotelNameBySeq(Integer h_seq) {
        return mapper.selectHotelNameBySeq(h_seq);
    }
    
    public String getHotelImageFileName(String uri){
        return mapper.getHotelImageFileName(uri);
    }




    public List<DaeguHotelVO> selectSearchFacDis() {
        return mapper.selectSearchFacDis();
    }
    public List<DaeguHotelVO> selectSearchFacBus() {
        return mapper.selectSearchFacBus();
    }
    public List<DaeguHotelVO> selectSearchFacEnt() {
        return mapper.selectSearchFacEnt();
    }
    public List<DaeguHotelVO> selectSearchFacVid() {
        return mapper.selectSearchFacVid();
    }
    public List<DaeguHotelVO> selectSearchFacHea() {
        return mapper.selectSearchFacHea();
    }
    

    public List<DaeguHotelVO> selectSearchSerBre() {
        return mapper.selectSearchSerBre();
    }
    public List<DaeguHotelVO> selectSearchSerMor() {
        return mapper.selectSearchSerMor();
    }
    public List<DaeguHotelVO> selectSearchSerLau() {
        return mapper.selectSearchSerLau();
    }

    
    public List<DaeguHotelVO> selectSearchSerTra() {
        return mapper.selectSearchSerTra();
    }
    public List<DaeguHotelVO> selectSearchSerStr() {
        return mapper.selectSearchSerStr();
    }
    public List<DaeguHotelVO> selectSearchSerFac() {
        return mapper.selectSearchSerFac();
    }
    public List<DaeguHotelVO> selectSearchSerNat() {
        return mapper.selectSearchSerNat();
    }
}

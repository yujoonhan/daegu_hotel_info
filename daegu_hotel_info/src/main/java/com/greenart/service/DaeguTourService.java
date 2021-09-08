package com.greenart.service;

import java.util.List;

import com.greenart.mapper.DaeguTourMapper;
import com.greenart.vo.DaeguTourVO;
import com.greenart.vo.TourRegionVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaeguTourService {
    @Autowired
    DaeguTourMapper mapper;
    public void insertDaeguTour(DaeguTourVO vo) {
        mapper.insertDaeguTour(vo);
    }

    public List<TourRegionVO> selectTourByAddress(Integer h_seq, String region){
        if(region == null){region = "%%";}
        else if(region != null) {region = "%"+region+"%";}
        return mapper.selectTourByAddress(h_seq, region);
    }
}

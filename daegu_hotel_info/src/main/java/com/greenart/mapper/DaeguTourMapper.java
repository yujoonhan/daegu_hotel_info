package com.greenart.mapper;

import java.util.List;

import com.greenart.vo.DaeguTourVO;
import com.greenart.vo.TourRegionVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaeguTourMapper {
    public void insertDaeguTour(DaeguTourVO vo);
    public List<TourRegionVO> selectTourByAddress(Integer h_seq, String region);
}

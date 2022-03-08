package com.bitc.team5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bitc.team5.dto.HotDto;

@Mapper
public interface HotMapper {

	void hotinsert(HotDto hotPlace) throws Exception;

	List<HotDto> selectHotList() throws Exception;

	List<HotDto> hotDetailList() throws Exception;

}

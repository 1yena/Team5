package com.bitc.team5.service.hot;

import java.util.List;

import com.bitc.team5.dto.HotDto;

public interface HotService {

	void hotinsert(HotDto hotPlace) throws Exception;

	List<HotDto> selectHotList() throws Exception;

	List<HotDto> hotDetailList() throws Exception;

}

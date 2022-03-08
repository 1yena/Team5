package com.bitc.team5.service.hot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.team5.dto.HotDto;
import com.bitc.team5.mapper.HotMapper;

@Service
public class HotServiceImpl implements HotService {
	
	@Autowired
	private HotMapper hotMapper;

	@Override
	public void hotinsert(HotDto hotPlace) throws Exception {
		hotMapper.hotinsert(hotPlace);
		
	}

	@Override
	public List<HotDto> selectHotList() throws Exception {
		return hotMapper.selectHotList();
	}

	@Override
	public List<HotDto> hotDetailList() throws Exception {
		return hotMapper.hotDetailList();
	}

}

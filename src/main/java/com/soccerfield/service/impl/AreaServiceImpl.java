package com.soccerfield.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soccerfield.dao.AreaMapper;
import com.soccerfield.entity.Area;
import com.soccerfield.entity.AreaExample;
import com.soccerfield.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {
	
	@Resource
	public AreaMapper areaMapper;

	//遍历球场对应的区域信息
	@Override
	public List<Area> getInfoByStaid(Integer staid) {
		
		AreaExample areaExample = new AreaExample();
		areaExample.createCriteria().andStaidEqualTo(staid).andAdelsignEqualTo(0);
		
		return areaMapper.selectByExample(areaExample);
	}

	//根据区域ID遍历对应区域信息
	@Override
	public Area getInfoByAreaid(Integer areaid) {
		return  areaMapper.selectByPrimaryKey(areaid);
	}

}

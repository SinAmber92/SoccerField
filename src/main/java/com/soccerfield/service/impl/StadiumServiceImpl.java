package com.soccerfield.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soccerfield.dao.StadiumMapper;
import com.soccerfield.entity.Stadium;
import com.soccerfield.entity.StadiumExample;
import com.soccerfield.service.StadiumService;

@Service
public class StadiumServiceImpl implements StadiumService{

	@Resource
	public StadiumMapper stadiumMapper;
	
	//返回球场逻辑删除列为0的球场信息
	@Override
	public List<Stadium> showAllStadium() {
		StadiumExample stadiumExample = new StadiumExample();
		stadiumExample.createCriteria().andSdelsignEqualTo(0);
		return stadiumMapper.selectByExample(stadiumExample);
	}

	//后台返回全部球场信息
	@Override
	public List<Stadium> vipShowAllStadium() {
		return stadiumMapper.selectByExample(null);
	}

	//后台根据球场ID删除制定球场
	@Override
	public int vipdelStadium(int staid) {
		return stadiumMapper.deleteByPrimaryKey(staid);
	}

	//后台新增球场信息
	@Override
	public int vipAddStadium(Stadium stadium) {
		return stadiumMapper.insertSelective(stadium);
	}

}

package com.soccerfield.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soccerfield.dao.StadiumMapper;
import com.soccerfield.entity.Stadium;
import com.soccerfield.service.StadiumService;

@Service
public class StadiumServiceImpl implements StadiumService{

	@Resource
	public StadiumMapper stadiumMapper;
	
	//返回全部球场信息
	@Override
	public List<Stadium> showAllStadium() {
		return stadiumMapper.selectByExample(null);
	}

}

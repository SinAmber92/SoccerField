package com.soccerfield.service;

import java.util.List;

import com.soccerfield.entity.Area;

public interface AreaService {
	
	//遍历球场对应的区域信息
	List<Area> getInfoByStaid(Integer staid);
	
	//根据区域ID遍历对应区域信息
	Area getInfoByAreaid(Integer areaid);
}

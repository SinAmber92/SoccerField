package com.soccerfield.service;

import java.util.List;

import com.soccerfield.entity.Stadium;

public interface StadiumService {

	//返回球场逻辑删除列为0的球场信息
	List<Stadium> showAllStadium();
	
	//后台返回全部球场信息
	List<Stadium> vipShowAllStadium();
	
	//后台根据球场id删除制定球场
	int vipdelStadium(int staid);
	
	//后台新增球场信息
	int vipAddStadium(Stadium stadium);
	
}

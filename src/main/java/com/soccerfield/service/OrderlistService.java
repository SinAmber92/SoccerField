package com.soccerfield.service;

import java.util.List;
import java.util.Map;

import com.soccerfield.entity.Orderlist;

public interface OrderlistService {
	
	/**
	 * 根据区域ID和日期 筛选出所有当天可选择的时间
	 * @param areaid	区域ID
	 * @param date		日期字符串：YYYYMMDD
	 * @return			返回当天该区域所有可选时间列表
	 */

	//新建订单插入数据库
	int createOrderlist(Orderlist orderlist);
	
	//显示时间状态（可选/不可选）
	List<Map<String, Object>> selectChoiceTime(int areaid, String date);
	
	//更新订单状态
	int updataOstatus(int orderid, int ostatus);

	//根据用户ID返回用户的所有订单信息
	List<Orderlist> getOrderlistByUserid(int userid);
}

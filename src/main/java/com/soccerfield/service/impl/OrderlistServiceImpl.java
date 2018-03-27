package com.soccerfield.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soccerfield.dao.AreaMapper;
import com.soccerfield.dao.OrderlistMapper;
import com.soccerfield.dao.StadiumMapper;
import com.soccerfield.entity.Orderlist;
import com.soccerfield.entity.OrderlistExample;
import com.soccerfield.entity.Stadium;
import com.soccerfield.service.OrderlistService;

@Service
public class OrderlistServiceImpl implements OrderlistService {

	@Resource
	public OrderlistMapper orderlistMapper;
	@Resource
	public StadiumMapper stadiumMapper;
	@Resource
	public AreaMapper areaMapper;
	
	//付款后生成新订单
	@Override
	public int createOrderlist(Orderlist orderlist) {
		return orderlistMapper.insertSelective(orderlist);
	}

	//显示时间状态（可选/不可选）
	@Override
	public List<Map<String, Object>> selectChoiceTime(int areaid, String date) {
		List<Map<String, Object>> response = new ArrayList<Map<String,Object>>();
//		Integer areaid = 1;					//区域ID
//		String date = "20180315";		//日期字符串--YYYYMMDD
		int staid = areaMapper.selectByPrimaryKey(areaid).getStaid();
		Stadium stadium = stadiumMapper.selectByPrimaryKey(staid);
		//传入参数设置：
		int staopentime = Integer.parseInt(stadium.getStaopentime().substring(0, 2));	//球场开门时间
		int staclosetime = Integer.parseInt(stadium.getStaclosetime().substring(0, 2));	//球场关门时间
		String staunittime = stadium.getStaunittime();									//球场每场球赛时间
		//将staunittime字符串做int转型处理
		int staunithour = Integer.parseInt(staunittime.substring(0, 1));
		int staunitmin = Integer.parseInt(staunittime.substring(2, 3));
		//获取到所有预订该区域的订单信息
		List<Orderlist> orders = orderlistMapper.selectByAreaidAndDate(areaid, date);
				//selectByAreaidAndDate(areaid, date);
		List<String> orderedTimes = new ArrayList<String>();
		//向response里添加所有营业时间
		for (int i = staopentime;; i++) {
			if (i == staclosetime) {
				Map<String, Object> time = new HashMap<String, Object>();
				time.put("date", i+":00");
				time.put("status", true);
				response.add(time);
				break;
			}
			Map<String, Object> time1 = new HashMap<String, Object>();
			time1.put("date", i+":00");
			time1.put("status", true);
			response.add(time1);
			Map<String, Object> time2 = new HashMap<String, Object>();
			time2.put("date", i+":30");
			time2.put("status", true);
			response.add(time2);
		}
		//获取所有该区域被预定的起始时间
		for (int i = 0; i < orders.size(); i++) {
			Orderlist orderlist = orders.get(i);
			String orestarttime = orderlist.getOrestarttime();
			String orestarthour = orestarttime.substring(8,10);
			String orestartmin = orestarttime.substring(10,12);
			orderedTimes.add(orestarthour+":"+orestartmin);
		}
		//将response中所有不可选的时间对应的状态属性设置成false
		for (int i = 0; i < orderedTimes.size(); i++) {
			int orderedHour = Integer.parseInt(orderedTimes.get(i).substring(0, 2));
			int orderedMin = Integer.parseInt(orderedTimes.get(i).substring(3, 5));
			for (int j = orderedHour-staunithour; j<=orderedHour+staunithour && j>=orderedHour-staunithour; j++) {
				if (j==orderedHour-staunithour && orderedMin==0) {
					if (staunitmin==0) {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					}
				} else if (j==orderedHour-staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						continue;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						continue;
					}
				}
				if (j==orderedHour+staunithour && orderedMin==0) {
					if (staunitmin==0) {
						break;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
						}
						break;
					}
				} else if (j==orderedHour+staunithour && orderedMin!=0) {
					if (staunitmin==0) {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
						}
						break;
					} else {
						for (int k = 0; k < response.size(); k++) {
							if (response.get(k).get("date").equals(j+":00")) {
								response.get(k).put("status", false);
							}
							if (response.get(k).get("date").equals(j+":30")) {
								response.get(k).put("status", false);
							}
						}
						break;
					}
				}
				for (int k = 0; k < response.size(); k++) {
					if (response.get(k).get("date").equals(j+":00")) {
						response.get(k).put("status", false);
					}
					if (response.get(k).get("date").equals(j+":30")) {
						response.get(k).put("status", false);
					}
				}
			}
		}
		return response;
	}

	//更新订单状态
	@Override
	public int updataOstatus(int orderid, int ostatus) {
		Orderlist record = new Orderlist();
		record.setOstatus(ostatus);
		OrderlistExample example = new OrderlistExample();
		example.createCriteria().andOrderidEqualTo(orderid);
		int i = orderlistMapper.updateByExampleSelective(record, example);
		return i;
	}

	//根据用户ID返回用户的所有订单信息
	@Override
	public List<Orderlist> getOrderlistByUserid(int userid) {
		OrderlistExample example = new OrderlistExample();
		example.createCriteria().andUseridEqualTo(userid);
		return orderlistMapper.selectByExample(example);
	}

}

package com.soccerfield.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.entity.Area;
import com.soccerfield.entity.Orderlist;
import com.soccerfield.service.AreaService;
import com.soccerfield.service.OrderlistService;
import com.soccerfield.utils.Response;

@RequestMapping("/orderlist")
@Controller
public class OrderlistController {
	
	@Resource
	public OrderlistService orderlistService;
	@Resource
	private AreaService areaService;
	/**
	 * 根据区域ID和日期 筛选出所有当天可选择的时间
	 * @param areaid	区域ID
	 * @param date		日期字符串：YYYYMMDD
	 * @return			返回当天该区域所有可选时间列表
	 */
	@RequestMapping("/getchoicetime")
	@ResponseBody
	public Response getChoiceTime(String areaid, String date) {
		
		List<Map<String, Object>> list = orderlistService.selectChoiceTime(Integer.parseInt(areaid), date);
		Response response = new Response();
		response.setCode(0);
		response.setMessage("获取成功！");
		response.setData(list);
		return response;
	}
	/**
	 * 修改订单状态
	 * @param orderid	需要修改的订单单号
	 * @param ostatus	需要修改成的状态值
	 * @return			是否修改成功
	 */
	@RequestMapping("/modifyostatus")
	@ResponseBody
	public Response modifyOstatus(String orderid, String ostatus) {
		Response response = new Response();
		int i = orderlistService.updataOstatus(Integer.parseInt(orderid), Integer.parseInt(ostatus));
		if (i==1) {
			response.setCode(0);
			response.setMessage("修改成功！");
		} else {
			response.setCode(1);
			response.setMessage("修改失败！");
		}
		return response;
	}
	
	//生成新订单
	@RequestMapping("/createorderlist")
	@ResponseBody
	public Response createOrderlist(String neworderlist) {
		Response response = new Response();
		JSONObject jobj = new JSONObject(neworderlist);
		Orderlist orderlist = new Orderlist();
		orderlist.setUserid(jobj.optInt("userid"));
		orderlist.setOname(jobj.optString("oname"));
		orderlist.setOtelphone(jobj.optString("otelphone"));
		orderlist.setAreaid(jobj.optInt("areaid"));
		orderlist.setOrestarttime(jobj.optString("orestarttime"));

		Area area  = areaService.getInfoByAreaid(2);
		
		orderlist.setOrdertime(new Date());
		orderlist.setStaid(area.getStaid());
		orderlist.setOstatus(1);
		orderlist.setOtotal(area.getAunprice());
		orderlist.setDeletesign(0);
		
		int i = orderlistService.createOrderlist(orderlist);
		if (i==0) {
			response.setCode(1);
			response.setData(i);
			response.setMessage("预定信息有误！预定失败！");
		} else {
			response.setCode(0);
			response.setData(i);
			response.setMessage("预定成功！");
		}
		return response;
	}
	
	//显示对应用户的全部订单
	@RequestMapping("/showperorderlist")
	@ResponseBody
	public Response showPerOrderlist(String userid) {
		Response response = new Response();
		List<Orderlist> list = orderlistService.getOrderlistByUserid(Integer.parseInt(userid));
		if (list.size()>0) {
			response.setCode(0);
			response.setData(list);
			response.setMessage("获取成功");
		} else {
			response.setCode(1);
			response.setMessage("获取失败");
		}
		return response;
	}
}

package com.soccerfield.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.entity.Area;
import com.soccerfield.service.AreaService;
import com.soccerfield.utils.Response;
/**
 * 
 * @author Amber
 *
 */


@Controller
@RequestMapping("/area")
public class AreaController {

	@Resource
	public AreaService areaService;
	
	//遍历球场对应的区域信息
	@RequestMapping("/getinfobystaid")
	@ResponseBody
	public Response getInfoByStaid(Integer staid){
//		System.out.println(staid);
		Response response = new Response();
		List<Area> alist = areaService.getInfoByStaid(staid);
		
		if(alist.size()!=0){
			response.setCode(0);
			response.setMessage("查找制定球场区域信息成功！");
			response.setData(alist);
		}else{
			response.setCode(1);
			response.setMessage("查找制定球场区域信息失败！");
		}
		
		return response;
	}
	
	//根据区域ID遍历对应区域信息
	@RequestMapping("/getinfobyareaid")
	@ResponseBody
	public Response getInfoByAreaid(Integer areaid){
		Response response = new Response();
		Area area = areaService.getInfoByAreaid(areaid);
		
		if(area.getAreaid() != null){
			response.setCode(0);
			response.setMessage("查找指定区域信息成功！");
			response.setData(area);
		}else{
			response.setCode(1);
			response.setMessage("查找指定区域信息失败！");
		}
		
		return response;
	}
	
}

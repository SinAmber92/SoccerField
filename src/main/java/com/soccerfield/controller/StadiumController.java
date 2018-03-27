package com.soccerfield.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.entity.Stadium;
import com.soccerfield.service.StadiumService;
import com.soccerfield.utils.Response;

/**
 * 
 * @author Amber
 *
 */
@Controller
@RequestMapping("/stadium")
public class StadiumController {
	
	@Resource
	public StadiumService stadiumService;
	
	
	//显示全部球场信息
	@RequestMapping("/showallstadium")
	@ResponseBody
	public Response showAllStadium(){
		
		Response response = new Response();
		List<Stadium> slist = stadiumService.showAllStadium();
		
		if(slist.size()!=0){
			response.setCode(0);
			response.setMessage("所有球场信息获取成功！");
			response.setData(slist);
		}else{
			response.setCode(1);
			response.setMessage("所有球场信息获取失败！");
		}
		
		return response;
	}
	
	
	
	

}

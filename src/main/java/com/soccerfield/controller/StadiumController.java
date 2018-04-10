package com.soccerfield.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.entity.Stadium;
import com.soccerfield.entity.User;
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
	
	
	//显示全部逻辑删除列为0的球场信息
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
/**********************************后台管理**********************************************/
	
	//后台遍历所有球场的信息
	@RequestMapping("/vipshowallstadium")
	@ResponseBody
	public Response vipShowAllStadium(HttpServletRequest request){
		
		Response response = new Response();
		User user = (User) request.getSession().getAttribute("user");
		
		if(user != null && (user.getUaccess()==1||user.getUaccess()==2)){
			List<Stadium> slist = stadiumService.vipShowAllStadium();
			if(slist.size() != 0){
				response.setCode(0);
				response.setMessage("球场信息获取成功！");
				response.setData(slist);
			}else{
				response.setCode(1);
				response.setMessage("球场信息获取失败！");
			}
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		
		return response;
	}
	
	//后台删除指定球场
	@RequestMapping("/vipdelstadium")
	@ResponseBody
	public Response vipDelStadium(String staid,HttpServletRequest request){
		
		Response  response = new Response();
		User user = (User) request.getSession().getAttribute("user");
		
		//管理员权限达到2才可以删除制定球场
		if(user!=null && user.getUaccess()==2){
			
			if(stadiumService.vipdelStadium(Integer.parseInt(staid))==1){
				response.setCode(0);
				response.setMessage("球场信息删除成功！");
			}else{
				response.setCode(1);
				response.setMessage("删除失败！用户不具备球场的删除权限！");
			}
			
		}else{

			response.setCode(2);
			response.setMessage("未登录！");
			
		}
		
		return response;
	}	
	
	//后台增加球场
	@RequestMapping("/vipaddstadium")
	@ResponseBody
	public Response vipAddStadium(String stadium,HttpServletRequest request){
		
		Response  response = new Response();
		User user = (User) request.getSession().getAttribute("user");
		Stadium nstadium = new Stadium();
		JSONObject json = new JSONObject(stadium);
		
		nstadium.setStaname(json.optString("staname"));
		nstadium.setStaaddr(json.optString("staaddr"));
		nstadium.setStaintro(json.optString("staintro"));
		nstadium.setStapic(json.optString("stapic"));
		nstadium.setStatel(json.optString("statel"));
		nstadium.setStaopentime(json.optString("staopentime"));
		nstadium.setStaclosetime(json.optString("staclosetime"));
		nstadium.setStaunittime(json.optString("staunittime"));
		nstadium.setSdelsign(json.optInt("sdelsign"));
		
		
		if(user!=null && (user.getUaccess()==2||user.getUaccess()==1)){
			if(stadiumService.vipAddStadium(nstadium)==1){
				response.setCode(0);
				response.setMessage("添加新球场成功！");
			}else{
				response.setCode(1);
				response.setMessage("添加失败！");
			}	
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		return response;
	}	
	
	//后台修改球场
	@RequestMapping("/vipmodstadium")
	@ResponseBody
	public Response vipModStadium(HttpServletRequest request){
		
		Response  response = new Response();
		User user = (User) request.getSession().getAttribute("user");
		
		if(user!=null && (user.getUaccess()==2||user.getUaccess()==1)){
			
			//暂时还没有写完
			
			
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		return response;
	}	
}

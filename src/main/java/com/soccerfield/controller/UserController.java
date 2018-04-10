package com.soccerfield.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soccerfield.entity.User;
import com.soccerfield.entity.UserLoginPostbody;
import com.soccerfield.service.UserService;
import com.soccerfield.utils.Response;

/**
 * 
 * @author Amber
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	public UserService userService;
	
	//登录确认
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Response login(@RequestBody UserLoginPostbody userLoginPostbody,HttpServletRequest request){
		
		Response response = new Response();
		
		List<User> ulist = userService.login(userLoginPostbody.getUtelphone(), userLoginPostbody.getUpassword());

		if(ulist.size()!=0){
			User user = ulist.get(0);
			request.getSession().setAttribute("user", user);
			response.setCode(0);
			response.setMessage("登录成功！");
			response.setData(user);
		}else{
			response.setCode(1);
			response.setMessage("登录失败！");
		}
		return response;

	}
		
	//注册用户
	@RequestMapping("/register")
	@ResponseBody
	public Response register(String user){
		
		Response response = new Response();
		JSONObject json = new JSONObject(user);
		User nuser = new User();
		
		nuser.setUsername(json.optString("username"));
		nuser.setUpassword(json.optString("upassword"));
		nuser.setUtelphone(json.optString("utelphone"));
		nuser.setUpersonid(json.optString("upersonid"));
		nuser.setUicon(json.optString("uicon"));
		nuser.setUaccess(0);
		
		if(userService.register(nuser)==1){
			response.setCode(0);
			response.setMessage("注册成功！");
		}else{
			response.setCode(1);
			response.setMessage("注册失败！");
		}
		return response;
				
	}
	
	//获取用户信息
	@RequestMapping("/getuserinfo")
	@ResponseBody
	public Response getUserInfo(String userid) {
		Response response = new Response();
		User user = userService.getUserByUserid(Integer.parseInt(userid));
		String icon = user.getUicon();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		map.put("icon", icon);
		return response;
	}
	
	//修改用户信息
	@RequestMapping("/modify")
	@ResponseBody
	public Response modify(String user,HttpServletRequest request){
		
		Response response = new Response();
		User olduser = (User) request.getSession().getAttribute("user");
		
		if(olduser!=null){

			JSONObject json = new JSONObject(user);
			User nuser = new User();
			
			nuser.setUserid(olduser.getUserid());
			nuser.setUsername(json.optString("username"));
			nuser.setUpassword(json.optString("upassword"));
			nuser.setUtelphone(json.optString("utelphone"));
			nuser.setUpersonid(json.optString("upersonid"));
			nuser.setUicon(json.optString("uicon"));
			
			if(userService.modify(nuser)==1){
				response.setCode(0);
				response.setMessage("编辑成功！");
				response.setData(user);
			}else{
				response.setCode(1);
				response.setMessage("编辑失败！");
			}
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
	
		return response;
	}
	
	//用户注销
	@RequestMapping("logout")
	@ResponseBody
	public Response logout(HttpServletRequest request){
		
		Response response = new Response();
		User user = (User) request.getSession().getAttribute("user");
		
		if(user!=null){
			request.getSession().removeAttribute("user");
			response.setCode(0);
			response.setMessage("退出成功！");
		}else{
			response.setCode(1);
			response.setMessage("未登录！");
		}

		return response;
	}

/********************************后台管理************************************************/
	//后台管理员注册用户
	@RequestMapping("/vipRegister")
	@ResponseBody
	public Response vipRegister(String user,HttpServletRequest request){
	
		Response response = new Response();
		User vipuser = (User) request.getSession().getAttribute("user");
		
		JSONObject json = new JSONObject(user);
		User nuser = new User();
		
		nuser.setUsername(json.optString("username"));
		nuser.setUpassword(json.optString("upassword"));
		nuser.setUtelphone(json.optString("utelphone"));
		nuser.setUpersonid(json.optString("upersonid"));
		nuser.setUicon(json.optString("uicon"));
		
		if(vipuser!=null){
			if(vipuser.getUaccess()==2){
				nuser.setUaccess(json.optInt("uaccess"));//高级管理员（2）可授权用户管理权限
			}else{
				nuser.setUaccess(0);
			}
			if(userService.register(nuser)==1){
				response.setCode(0);
				response.setMessage("注册成功！");
			}else{
				response.setCode(1);
				response.setMessage("注册失败！");
			}
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		return response;
				
	}
	
	//后台管理员编辑用户
	@RequestMapping("/vipmodify")
	@ResponseBody
	public Response vipModify(String user,HttpServletRequest request){

		Response response = new Response();
		User vipuser = (User) request.getSession().getAttribute("user");
		
		JSONObject json = new JSONObject(user);
		User nuser = new User();
		
		nuser.setUserid(json.optInt("userid"));
		nuser.setUsername(json.optString("username"));
		nuser.setUpassword(json.optString("upassword"));
		nuser.setUtelphone(json.optString("utelphone"));
		nuser.setUpersonid(json.optString("upersonid"));
		nuser.setUicon(json.optString("uicon"));
		
		if(vipuser!=null){
			if(vipuser.getUaccess()==2){
				nuser.setUaccess(json.optInt("uaccess"));//高级管理员（2）可更改用户管理权限
			}
			if(userService.modify(nuser)==1){
				response.setCode(0);
				response.setMessage("编辑成功！");
				response.setData(user);
			}else{
				response.setCode(1);
				response.setMessage("编辑失败！");
			}
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		return response;
	}
	
	//后台管理员删除用户
	@RequestMapping("vipdeluser")
	@ResponseBody
	public Response vipDelUser(String userid,HttpServletRequest request){
		
		Response response = new Response();
		User vipuser = (User) request.getSession().getAttribute("user");

		if(vipuser!=null){
			//高级管理员（2）有删除用户权限
			if(vipuser.getUaccess()==2){
				if(userService.delUser(Integer.parseInt(userid))==1){
					response.setCode(0);
					response.setMessage("删除成功！");
				}else{
					response.setCode(1);
					response.setMessage("删除失败！");
				}
			}else{
				response.setCode(3);
				response.setMessage("删除失败！管理员没有删除权限！");
			}

		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}

		return response;
	}
	
	//后台管理员登录用户
	@RequestMapping(value="/viplogin",method=RequestMethod.POST)
	@ResponseBody
	public Response viplogin(@RequestBody UserLoginPostbody userLoginPostbody,HttpServletRequest request){
		
		Response response = new Response();
		List<User> ulist = userService.login(userLoginPostbody.getUtelphone(), userLoginPostbody.getUpassword());

		if(ulist.size()!=0){
			User user = ulist.get(0);
			if(user.getUaccess()==2||user.getUaccess()==1){
				request.getSession().setAttribute("user", user);
				response.setCode(0);
				response.setMessage("登录成功！");
				response.setData(user);
			}else{
				response.setCode(1);
				response.setMessage("登录失败！您没有权限录入后台管理界面！");
			}
		}else{
			response.setCode(2);
			response.setMessage("登录失败！");
		}
		return response;

	}
	
	//后台遍历用户信息
	@RequestMapping(value="/vipshowusers",method=RequestMethod.POST)
	@ResponseBody
	public Response vipShowUsers(HttpServletRequest request){
		
		Response response = new Response();
		User vipuser = (User) request.getSession().getAttribute("user");
		
		if(vipuser!=null){
			//权限为2的用户登录可以看到所有用户的信息
			if(vipuser.getUaccess()==2){
				List<User> ulist = userService.getAllUser();
				if(ulist.size() != 0){
					response.setCode(0);
					response.setMessage("遍历信息成功！");
					response.setData(ulist);
				}else{
					response.setCode(1);
					response.setMessage("遍历信息失败！");
				}
			//权限为1的用户登录后可以看到所有普同用户也就是权限为0的用户的信息
			}else if(vipuser.getUaccess()==1){
				List<User> ulist = userService.getNorUser();
				if(ulist.size() != 0){
					response.setCode(0);
					response.setMessage("遍历信息成功！");
					response.setData(ulist);
				}else{
					response.setCode(1);
					response.setMessage("遍历信息失败！");
				}
			}else{
				response.setCode(1);
				response.setMessage("信息获取失败！该用户没有授权");
			}
		}else{
			response.setCode(2);
			response.setMessage("未登录！");
		}
		return response;
	}
	
	
}


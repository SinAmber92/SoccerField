package com.soccerfield.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
		
//		System.out.println("----------------------------");
//		System.out.println(utelphone+"|"+upassword);
		
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
		
/*		for (User user : ulist) {
//			System.out.println("lalalal");
			return user;
		}
//		System.out.println("ooo");
		return null;*/
		
	}
	
	//注册用户
	@RequestMapping("/register")
	@ResponseBody
	public Response register(String user){
//		System.out.println(user);
		Response response = new Response();
		JSONObject json = new JSONObject(user);
		User nuser = new User();
		
		nuser.setUsername(json.optString("username"));
		nuser.setUpassword(json.optString("upassword"));
		nuser.setUtelphone(json.optString("utelphone"));
		nuser.setUpersonid(json.optString("upersonid"));
		nuser.setUicon(json.optString("uicon"));
		
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
		File icon = downLoadIcon(user.getUicon());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user", user);
		map.put("icon", icon);
		return response;
	}
	
	
	//修改用户信息
	@RequestMapping("/modify")
	@ResponseBody
	public Response modify(String user,HttpServletRequest request){

//		System.out.println(user);
		Response response = new Response();
		User olduser = (User) request.getSession().getAttribute("user");
		
//		System.out.println("--------------------------");
//		System.out.println(olduser);
		
		if(olduser!=null){

			JSONObject json = new JSONObject(user);
			User nuser = new User();
			
			nuser.setUserid(olduser.getUserid());
			nuser.setUsername(json.optString("username"));
			nuser.setUpassword(json.optString("upassword"));
			nuser.setUtelphone(json.optString("utelphone"));
			nuser.setUpersonid(json.optString("upersonid"));
			nuser.setUicon(uploadFile(new File(json.optString("uicon"))));
			
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
			request.getSession().invalidate();
			response.setCode(1);
			response.setMessage("未登录！");
		}

		return response;
	}
	
	//上传文件
	private String uploadFile(File file){
		
		String path = Response.class.getClassLoader().getResource("").getPath()+"icon/"+file.getName();
		File copyFile = new File(path);
		
		InputStream fis = null;
		OutputStream fos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(copyFile);
			byte[] buff = new byte[20];//1024的倍数
			while(fis.read(buff)!=-1){
				fos.write(buff);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return path;
	}
	
	//下载图片
	private File downLoadIcon(String path) {
		return new File(path);
	}
	
}


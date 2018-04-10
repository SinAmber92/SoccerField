package com.soccerfield.service;

import java.util.List;

import com.soccerfield.entity.User;

/**
 * 
 * @author Amber
 *
 */
public interface UserService {

	//核实登录用户
	List<User> login(String utelphone,String upassword);
	
	//注册用户
	int register(User user);
	
	//修改用户
	int modify(User user);
	
	//获取用户信息
	User getUserByUserid(int userid);
	
	//遍历普通用户信息
	List<User> getNorUser();
	
	//遍历全部用户信息
	List<User> getAllUser();
	
	//删除指定用户
	int delUser(int userid);
}

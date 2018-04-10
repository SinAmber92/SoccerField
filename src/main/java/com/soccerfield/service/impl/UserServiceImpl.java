package com.soccerfield.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.soccerfield.dao.UserMapper;
import com.soccerfield.entity.User;
import com.soccerfield.entity.UserExample;
import com.soccerfield.service.UserService;

/**
 * 
 * @author Amber
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	public UserMapper userMapper;

	//核实登录用户
	@Override
	public List<User> login(String utelphone, String upassword) {
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUtelphoneEqualTo(utelphone).andUpasswordEqualTo(upassword);
		return userMapper.selectByExample(userExample);
		
	}

	//注册用户
	@Override
	public int register(User user) {
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUtelphoneEqualTo(user.getUtelphone());
		List<User> ulist = userMapper.selectByExample(userExample);
		
		if(ulist.size() == 0){
			return userMapper.insertSelective(user);
		}else{
			return 0;
		}
	}

	//修改用户
	@Override
	public int modify(User user) {
		
		//考虑修改的时候电话号码唯一的问题
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUtelphoneEqualTo(user.getUtelphone()).andUseridNotEqualTo(user.getUserid());
		List<User> ulist = userMapper.selectByExample(userExample);
		
		if(ulist.size()==0){
//			System.out.println("业务逻辑层1");
			UserExample nuserExample = new UserExample();
			nuserExample.createCriteria().andUseridEqualTo(user.getUserid());
			int result = userMapper.updateByExampleSelective(user, nuserExample);
			System.out.println(result);
			return result;
		}else{
//			System.out.println("业务逻辑层2");
			return 0;	
		}	
	}

	//获取用户信息
	@Override
	public User getUserByUserid(int userid) {
		return  userMapper.selectByPrimaryKey(userid);
	}

	//遍历普通用户信息
	@Override
	public List<User> getNorUser() {
		
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUaccessEqualTo(0);
		
		return userMapper.selectByExample(userExample);
	}

	//遍历所有用户信息
	@Override
	public List<User> getAllUser() {
		return userMapper.selectByExample(null);
	}

	//删除指定用户
	@Override
	public int delUser(int userid) {
		return userMapper.deleteByPrimaryKey(userid);
	}

}


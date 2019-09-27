package com.hp.server.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hp.mapper.UserMapper;
import com.hp.pojo.User;
import com.hp.service.IUserService;

@Service

public class UserService implements IUserService{

	@Resource
	private UserMapper userMapper;

	/**
	 * 根据用户名查询数据
	 */
	public User findUserByName(String uName) {
		return userMapper.findUserByName(uName);
		
	}

	/**
	 * 用户注册
	 */
	public void userRegister(Integer uId,String uName,String uPassword,String uPhone,String uAddress,int isManager) {
		userMapper.userRegister(uId,uName,uPassword,uPhone,uAddress,isManager);
		
	}
	
}

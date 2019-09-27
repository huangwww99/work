package com.hp.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hp.pojo.User;

public interface IUserService {

	/**
	 * 根据用户名查询数据
	 */
	public User findUserByName(String uName);
	
	/**
	 * 用户注册
	 */
	public void userRegister(Integer uId,String uName,String uPassword,String uPhone,String uAddress,int isManager) ;
}

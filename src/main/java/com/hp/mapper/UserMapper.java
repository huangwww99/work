package com.hp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hp.pojo.User;

public interface UserMapper {


	/**
	 * 根据用户名查询数据
	 */
	@Select(value= {"select * from tb_user where uName=#{userName}"})
	public User findUserByName(@Param("userName") String userName);

	/**
	 * 用户注册
	 */
	
	public void userRegister(Integer uId,@Param("userName")String uName,@Param("uPassword")String uPassword,@Param("uPhone")String uPhone,@Param("uAddress")String uAddress,int isManager) ;
}

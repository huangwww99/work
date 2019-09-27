package com.hp.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hp.pojo.User;
import com.hp.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController{
	
	@Resource
	private IUserService userService;
	  private static final Logger log=LoggerFactory.getLogger(UserController.class);
	@RequestMapping(value="login")
	public String login(HttpServletRequest request) {
	
		
		return "login";
	}
	/**
	 * 登入
	 * @param userName
	 * @param passWord
	 * @return
	 */
	@RequestMapping(value="loginon")
	public String loginon(@RequestParam("uName")String userName,@RequestParam("uPassword")String passWord) {
		
				Subject currentUser=SecurityUtils.getSubject();
				if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(userName, passWord);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
				log.info("登陆成功");
				
			} catch (AuthenticationException e) {
				e.printStackTrace();
				return "error";
				
			}
			
		}
				
		return "main";
	}
	@RequestMapping(value="register")
	public String userRegister(String uName,String uPassword,String uPhone,String uAddress) {
	
		Integer uId=null;
		int isManager=0;
		String hashAlgorithmName = "MD5"; 
		String credentials = uPassword; 
		int hashIterations = 3;       
		Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
		String Password = obj.toString();
		userService.userRegister(uId,uName,Password,uPhone,uAddress,isManager);
		return "main";
		
	}
}

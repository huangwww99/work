package com.hp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BaseController {

	/**
	 * 获取HttpServletRequest
	 */
	public HttpServletRequest getRequest() {
		
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	/**
	 * 获取HttpServletResponse
	 */
	public HttpServletResponse getReponse() {
		
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
	}
	
	/**
	 * HttpSession
	 */
	public HttpSession getSession() {
		
		return getRequest().getSession();
	}
}

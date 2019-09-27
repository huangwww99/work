package com.hp.pojo;

import java.util.Date;

public class User {
	private Integer uId;
	private String uName;
	private String uPassword;
	private String uPhone;
	private String uAddress;
	private Integer isManager;	//1:为管理员  0：不为管理员
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uId, String uName, String uPassword, String uPhone, String uAddress, Integer isManager) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
		this.uPhone = uPhone;
		this.uAddress = uAddress;
		this.isManager = isManager;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public Integer getIsManager() {
		return isManager;
	}
	public void setIsManager(Integer isManager) {
		this.isManager = isManager;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uPhone=" + uPhone
				+ ", uAddress=" + uAddress + ", isManager=" + isManager + "]";
	}

}

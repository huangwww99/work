package com.hp.shiro;

import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.X509Certificate;

import javax.annotation.Resource;

import org.apache.catalina.Container;
import org.apache.catalina.Context;
import org.apache.catalina.CredentialHandler;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.Realm;

import com.hp.mapper.UserMapper;
import com.hp.pojo.User;


public class JdbcRealm  extends AuthenticatingRealm{
	@Resource
	private UserMapper userMapper;
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		UsernamePasswordToken myToken= (UsernamePasswordToken) token;
		String userName = myToken.getUsername();
		User user = userMapper.findUserByName(userName);
		String credentials = user.getuPassword();
		System.out.println("JdbcRealm.doGetAuthenticationInfo()"+credentials+"登入===============================");
		String realmName = this.getName();
		SimpleHash hash=new SimpleHash("MD5", credentials, null, 3);
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userName, credentials, null, realmName);
		return info;
	}
	
}

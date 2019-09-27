<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<form action="user/register" method="post">
<table border="1" bordercolor="red" align="center">
	<tr>
		<td>账号</td>
		<td><input type="text" name="uName" /></td>
	</tr>
	<tr>
		<td>密码</td>
		<td><input type="password" name="uPassword" /></td>
	</tr>
	<tr>
		<td>电话号码</td>
		<td><input type="text" name="uPhone" /></td>
	</tr>
	<tr>
		<td>地址</td>
		<td><input type="text" name="uAddress" /></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="注册" /></td>
	</tr>
	</table>
	</form>
</body>
</html>
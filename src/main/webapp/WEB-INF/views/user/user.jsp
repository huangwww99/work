<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<table>
	<tr>
		<td>用户编号</td>
		<td>姓名</td>
		<td>年龄</td>
		<td>生日</td>
		<td>性别</td>
	</tr>
	<c:forEach items="${userList }" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.age }</td>
			<td><fmt:formatDate value="${user.birthDay }" pattern="yyyy-MM-dd"/></td>
			<td>${user.sex }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
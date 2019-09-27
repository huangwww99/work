<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/ssm/js/layui/css/layui.css">
  <script type="text/javascript" src="/ssm/js/jquery-2.2.1.min.js"></script>
  <script type="text/javascript">
  		$(function(){
  			$('a').click(function(){
  				var pageNum = $(this).attr('name');
  				$('#pageNum').val(pageNum);
  				$('form').submit();
  			});
  		});
  </script>
</head>
<body>
<div style="width:80%; margin:100px">
<div>
	<form action="/ssm/user/userInfo" method="post" id="form">	
			    编号：<input type="text" name="idSearch"  value="${idSearch }"/>
			 姓名：<input type="text" name="nameSearch" value="${nameSearch }"  />
			<input type="submit" value="查询" />
			<input type="hidden" value="1" name="pageNum" id="pageNum" />
	</form>
</div>
<table class="layui-table ">
	<tr>
		<td>用户编号</td>
		<td>姓名</td>
		<td>年龄</td>
		<td>生日</td>
		<td>性别</td>
	</tr>
	<c:forEach items="${page.list }" var="user">
		<tr>
			<td>${user.id }</td>
			<td>${user.name }</td>
			<td>${user.age }</td>
			<td><fmt:formatDate value="${user.birthDay }" pattern="yyyy-MM-dd"/></td>
			<td>${user.sex }</td>
		</tr>
	</c:forEach>
	<tr>
 		<td colspan="5" align="center">
			总共${page.total }条记录 
			当前第${page.pageNum }/${page.pages }页
			<a href="javascript:void(0)" name="1">首页</a>
			<c:if test="${page.hasPreviousPage}">
				<a href="javascript:void(0)" name="${page.pageNum-1 }">上一页</a>			
			</c:if>
			<c:if test="${page.hasPreviousPage==false}">
				上一页			
			</c:if>
			<c:if test="${page.hasNextPage }">
				<a href="javascript:void(0)" name="${page.pageNum+1 }">下一页</a>
			</c:if>
			<c:if test="${page.hasNextPage==false }">
				下一页
			</c:if>
			<a href="javascript:void(0)" name="${page.pages }">尾页</a>
		</td>
	</tr>
</table>
</div>
</body>
</html>
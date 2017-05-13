<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="com.po.Usr"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" rev="stylesheet" href="css/global.css" type="text/css" media="all" />
</head>
<body>	
       <h3>添加新用户</h3><br>
       <hr size=1>  
       <form action="RegUserServlet">
			<table align="center">
			<%
				Usr user = (Usr)request.getAttribute("user");
				if(user == null){
			%>
			<tr>
					<td>用户名：
					</td>
					<td><input type="text" name="userName">
					</td>
				</tr>
				<tr>
					<td>密码：
					</td>
					<td><input type="password" name="pwd">
					</td>
				</tr>
			<% 
				}else{
			%>
				<tr>
					<td>用户名：
					</td>
					<td><input type="text" name="userName" value=<%=user.getUserName()%>>
					</td>
				</tr>
				<tr>
					<td>密码：
					</td>
					<td><input type="password" name="pwd" value=<%=user.getPassword() %>>
					</td>
				</tr>
			<%} %>
				<tr>
					<td><input type="submit" value="注册">
					</td>
					<td><input type="reset" value="重置">
					</td>
				</tr>
			</table>
       	</form>
</body>
</html>
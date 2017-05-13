<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--导入struts标签库 --%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" rev="stylesheet" href="css/global.css" type="text/css" media="all" />
</head>

<body>
	<%-- <% 
	String strMess=(String)request.getAttribute("mess");
	if(strMess==null){
		strMess="";
	}
			
	%>	
	<%=strMess %> --%>
	<s:property value="#request.mess"/>
       <h3>添加新用户</h3><br>
       <hr size=1>  
       <form action="">
			<table align="center">
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
				<tr>
					<td><input type="submit" value="登录">
					</td>
					<td><input type="reset" value="重置">
					</td>
				</tr>
			</table>
       	</form>
</body>
</html>
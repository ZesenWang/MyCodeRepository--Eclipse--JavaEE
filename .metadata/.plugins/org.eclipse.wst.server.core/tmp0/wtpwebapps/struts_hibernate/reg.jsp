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
       <form action="regAction.action">
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
					<td>确认密码：
					</td>
					<td><input type="password" name="pwd1">
					</td>
				</tr>
				<tr>
					<td>性别：
					</td>
					<td><input type="radio" name="sex" value="man">男<input type="radio" name="sex" value="woman">女
					</td>
				</tr>
				<tr>
					<td>兴趣：
					</td>
					<td><input type="checkbox" name="interest" value="爬山">爬山<input type="checkbox" name="interest" value="钓鱼">钓鱼
					</td>
				</tr>
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
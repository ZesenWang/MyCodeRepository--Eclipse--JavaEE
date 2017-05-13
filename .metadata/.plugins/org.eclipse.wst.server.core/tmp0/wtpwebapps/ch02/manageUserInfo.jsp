<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="GetUserInfoServlet">查询所有用户信息</a>&nbsp&nbsp<a href="reg.jsp ">添加</a>
	<%
		java.util.List list=(java.util.List)request.getAttribute("userInfo");
		
		if(list==null) return;
	%>
	<table border=1 width=400>
		<tr>
			<th>用户名</th><th>密码</th><th>操作</th>
		</tr>
			<%
				for(int i=0;i<list.size();i++){
					com.po.Usr usr=(com.po.Usr)list.get(i);
					
					%>
					<tr><td><%=usr.getUserName() %></td><td><%=usr.getPassword() %></td><td>
					<a href="DltUserServlet?identity=<%=usr.getUserName() %>">删除</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="UpdUserServlet?username=<%=usr.getUserName() %>&&password=<%=usr.getPassword()%>">修改</a></td></tr>
					<%
				}
			
			%>

	</table>
</body>
</html>
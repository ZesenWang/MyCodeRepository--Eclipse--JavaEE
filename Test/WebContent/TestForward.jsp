<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%double i = Math.random();
	  if(i > 0.5){
	%>
		<jsp:forward page="example.jsp"/>
	<%
	  }else{
	%>
		<jsp:forward page="example.jsp"/>
	<%} %>
	<%--当使用forward标记跳转后 ，下面的内容就看不到了--%>
	<p>Can I be output</p>
	<%=i %>
</body>
</html>
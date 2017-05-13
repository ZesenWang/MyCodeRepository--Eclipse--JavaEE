<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Vector" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>爱尚网扇品</title>
<link rel="stylesheet" rev="stylesheet" href="css/global.css" type="text/css" media="all" />
</head>
<body>
	
	<div id="page">
		<div id="header">
			<jsp:include page="header.jsp" />      
       	</div>
			
		<div id="left_column">
			<jsp:include page="left_column.jsp" />  
		</div>
			
		<div id="center_column">		
			<div class="divBorder">
				<img src="images/all_fans.gif" /><br>
				<%
					Vector<Vector<String>> vector = (Vector<Vector<String>>)request.getAttribute("product");
					for(int i=0;i<vector.size();i++){
						Vector oneProduct = vector.get(i);
				%>
						<div id='sort_product'>
							<ul>
								<li><p class='gpic'><a href='item.jsp'><img width='205' height='154' src="<%=oneProduct.get(3) %>"></a></p></li> 
								<li><p class='gbt'><a href='item.jsp'>品名：<%=oneProduct.get(1) %> </a></p></li>
								<li><p class='gprice'>促销价：<span style="color:#FF6600;font-weight:bold;"></span>￥<%=oneProduct.get(2) %>元</p></li>
								<li><p class='gsale'>已售出：<span style='font-weight:bold;'><%=oneProduct.get(4) %></span>&nbsp;笔</p></li>
							</ul>
						</div>
				<%
					}
				%>
			</div>	
				
				<div id='page_next'><a class="pageLink" href="SortServlet?id=up">上一页</a>&nbsp;<a class="pageLink" href="SortServlet?id=down">下一页</a>&nbsp;</div>   	
			</div>
					
		<div id="footer">
			<jsp:include page="bottom.jsp" />  
		</div>
		
	</div>
</body>
</html>
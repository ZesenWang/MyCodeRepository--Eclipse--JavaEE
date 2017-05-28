<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.util.List,com.po.Mhs"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
    <title>Support Admin</title>
    <!-- BOOTSTRAP CORE STYLE CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME CSS -->
    <link href="assets/css/font-awesome.min.css" rel="stylesheet" />
    <!-- CUSTOM STYLE CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- Google	Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Nova+Flat' rel='stylesheet' type='text/css' />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div id="head">
       
    </div>
    
    <section id="main">
        <div class="container">
            <div class="row">
                <div class="col-lg-9 col-md-9 col-sm-9 ">

                  
                      <div class="hr-div"> <hr /></div>
                        <div class="col-lg-7 col-md-7 col-sm-7">
                          
                            <div class="alert alert-info">
                           
                        	<h3>您查询的病历如下:</h3>
                        		<%
                                   
       									List<Mhs> list=(List<Mhs>)request.getAttribute("mhsInfo");
       									if(list==null){
       										response.sendRedirect("queryByNoAction.action?method=doShow"); 
       										return;
       									}
       								%>		
       								
       							<% 
                                       
                                   		for(int i=0;i<list.size();i++){
                                   			Mhs mhs=list.get(i);
                                 %>
                          
                                 	编号:<%=mhs.getNo() %> <br> 日期：<%=mhs.getDatetime() %><br>状态：<%=mhs.getStatment() %><br>
                                 	操作：<a href="update.jsp?no=<%=mhs.getNo()%>">修改 </a> &nbsp;&nbsp;<a href="feichu.jsp?no=<%=mhs.getNo()%>&mh=<%=mhs.getMh()%>">废除</a>
                                <hr />
                              	 
                                <ul>
                                    <li>
                                      <%=mhs.getMh() %>
                                    </li>
                                    
                                   
                                </ul>
                                <hr />
                                 
                                 <%
                                  
       									}
                                 %>
                    </div>
                        </div>
                    

                </div>
                <div class="col-lg-3 col-md-3 col-sm-3">
                   
                    <div class="list-group">
                        <a href="manage.jsp" >返回管理页面
                        </a>

                    
                      


                    </div>
                    
                    
                </div>
            </div>
        </div>
    </section>
    <div id="footer">
        <div class="container">

            <div class="row">
               
             
              




            </div>

        </div>

    </div>
    <!--  Jquery Core Script -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--  Core Bootstrap Script -->
    <script src="assets/js/bootstrap.js"></script>

</body>
</html>

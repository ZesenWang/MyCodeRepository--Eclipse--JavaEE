<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.util.List,com.po.Patient"  %>
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
        <div class="container">
            <div class="row">

                <div class="col-lg-4 col-md-4 col-sm-4">
                    <a href="index.jsp">
                    <img src="assets/img/logo.png"  />
                        </a>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4 text-center" >
                     <img src="assets/img/top-mouse.png "  class="header-mid" />
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                
                </div>
                
            </div>
        </div>
    </div>    
    <section id="main" >
        <div class="container" align="center">
            <div class="row">
                <div class="col-lg-9 col-md-9 col-sm-9 ">

                     <h3>病人管理列表</h3>
                    
                      <div class="hr-div"> <hr /></div>
                                                  <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>病人编号</th>
                                              <th>病人姓名</th>
                                            <th>年龄</th>
                                            <th>性别</th>
                                            <th>地址</th>
                                             <th>联系电话</th>
                                             <th>操作</th>
                                           
                                        </tr>
                                    </thead>
                                    <tbody>
                                   <%
                                   
       									List<Patient> list=(List<Patient>)request.getAttribute("patientInfo");
       									if(list==null){
       										response.sendRedirect("queryAction.action?method=doShow"); 
       										return;
       									}
       										
       					 
                                       
                                   		for(int i=0;i<list.size();i++){
                                   			Patient patient=list.get(i);
                                   %>
                                     <tr>
                                            <td><%=patient.getPatientid() %></td>
                                             <td> <i class="fa fa-user" ></i> <%=patient.getPatientname() %></td>
                                              <td><%=patient.getAge() %></td>
                                            <td><%=patient.getSex() %></td>
                                            <td><%=patient.getAddress() %></span></td>
                                            <td><%=patient.getPhonenumber() %></td>                                       
                                            <td><a href="medcinehistory.jsp">新增 </a></td>
                                        </tr>
                                   
                                	   
                                   <%
                                	   
                                   }
                                   
                                   %>
                                       
                                    </tbody>
                                </table>
                            </div>
                    <ul class="pagination">
  <li class="disabled"><a href="#">&laquo;</a></li>
  <li class="active"><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">&raquo;</a></li>

                </div>
                  <div class="col-lg-3 col-md-3 col-sm-3">
                 
                    <div class="text-left">
                        <form action="queryByIdAction.action">
                        <tr>查询请输入病人编号：</tr>
                        <tr>
                        <td><input type="text" name="patientid"/> &nbsp;</td>
                        <td><input type="submit" value="查 &nbsp;询"/></td>
                        </tr>
						</form>
						<form action="queryByNoAction.action">
						<tr>查询请输入病历编号：</tr>
                        <tr>
                        <td><input type="text" name="no"/> &nbsp;</td>
                        <td><input type="submit" value="查 &nbsp;询"/></td>
                        </tr>
						</form>

                    </div>
                    
                </div>
          
            </div>
        </div>
    </section>
    <div id="footer">
       
        </div>

    </div>
    <!--  Jquery Core Script -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--  Core Bootstrap Script -->
    <script src="assets/js/bootstrap.js"></script>

</body>
</html>

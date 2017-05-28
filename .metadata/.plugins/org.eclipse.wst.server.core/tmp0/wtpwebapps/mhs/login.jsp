<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
                    <h4><span>Call:</span> +01-4589-987-567</h4>
                    <h4><span>E-mail:</span> info@domain.com</h4>
                </div>
                
            </div>
        </div>
    </div>
   <section style="padding:100px 0px 0px 0px;" >
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-lg-offset-3  col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 ">
                   <p>请输入工号和密码</p>
                    <div class="alert alert-info">
                 
                        <div class="media">
                        <div class="pull-left">
                            <img src="assets/img/admin.png" class="img-responsive" />
                        </div>
                        <div class="media-body">
                            <h3 class="media-heading">医生登录</h3>
                            
                            <form action="loginAction.action">
                            	
                        		<div class="form-group">
                           			<input type="text" name="doctorid" class="form-control" required="required" placeholder="username" />
                        		</div>
                        		
                    
                        		<div class="form-group">
                            		<input type="text" name="password" class="form-control" required="required" placeholder="Password" />
                        		</div>
                       		    <div class="form-group">
                         			<!--   <a href="loginAction.action" class="btn btn-success">登录</a>-->
                         			<input type="submit" value="登录"/>
                                </div>
                      

                             </form>
                            
                        </div>
                    </div>
                       
                   
                    </div>
                  
                       
                   
                    </div>
                </div>
                
            </div>

        </div>

    </section>
    
    <div id="footer">
        <div class="container">

            <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-4">
                   
                </div>
               
                <div class="col-lg-4 col-md-4 col-sm-4">

                   
                </div>




            </div>

        </div>

    </div>
    <!--  Jquery Core Script -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--  Core Bootstrap Script -->
    <script src="assets/js/bootstrap.js"></script>

</body>
</html>

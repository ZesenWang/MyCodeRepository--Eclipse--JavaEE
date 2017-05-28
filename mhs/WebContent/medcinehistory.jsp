<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@  page import="java.util.*"%>

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
    <section id="main">
        <div class="container">
            <div class="row">
                <div class="col-lg-9 col-md-9 col-sm-9 alert alert-info">

                    <h3 class=" text-center">门急诊病历</h3>
                   <div class="hr-div"> <hr /></div>
                    <form action="addAction.action">
					

                      
                     
                     
                        <div class="form-group col-lg-12 col-md-12 col-sm-12">
                            <label>病人编号</label>
                            <input type="text" name="patientid" class="form-control" required="required" placeholder="Enter PatientID " />
                        </div>
                       
                        <div class="form-group col-lg-12 col-md-12 col-sm-12">
                            <label>医生编号</label>
                            <input type="text" name="doctorid" class="form-control" required="required" placeholder="Enter DoctorID " />
                        </div>
                        <div class="form-group col-lg-12 col-md-12 col-sm-12">
                            <label>请输入处方</label>
                            <textarea class="form-control" name="mh" rows="14" placeholder="Enter Notification " ></textarea>
                        </div>

                        <div class="form-group col-lg-12 col-md-12 col-sm-12">
                            <button type="submit" class="btn btn-primary">确&nbsp;&nbsp;定</button>
                        </div>
                    </form>

                </div>
             
            </div>
        </div>
    </section>
    <div id="footer">
        <div class="container">

            <div class="row">
                <div class="col-lg-4 col-md-4 col-sm-4">
                    <h3>Physical Location</h3>
                    <p>
                        <i>Addresss :</i> 125/890 , New York Street,
                        <br />
                        United States of America (USA).
                         <br />
                       &copy; 2014 yourdomian | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                   
                    </p>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">
                    <h3>Get Quick Help</h3>
                    <h4><span>Call: </span>+01-4589-987-567</h4>
                    <h4><span>E-mail: </span>info@domain.com</h4>
                    <h4><span>Skype:</span> sonasup</h4>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-4">

                    <h3>Subscribe For Updates</h3>
                    <form>

                        <div class="form-group">
                            <input type="text" class="form-control" required="required" placeholder="Your Email" />
                        </div>


                        <div class="form-group">
                            <button type="submit" class="btn btn-danger">Click To Subscribe</button>
                        </div>
                    </form>
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

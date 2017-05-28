package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.po.Patient;

public final class manage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\" />\r\n");
      out.write("    <!--[if IE]>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    <title>Support Admin</title>\r\n");
      out.write("    <!-- BOOTSTRAP CORE STYLE CSS -->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- FONT AWESOME CSS -->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- CUSTOM STYLE CSS -->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Google\tFonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Nova+Flat' rel='stylesheet' type='text/css' />\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"head\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("                    <a href=\"index.jsp\">\r\n");
      out.write("                    <img src=\"assets/img/logo.png\"  />\r\n");
      out.write("                        </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-4 text-center\" >\r\n");
      out.write("                     <img src=\"assets/img/top-mouse.png \"  class=\"header-mid\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>    \r\n");
      out.write("    <section id=\"main\" >\r\n");
      out.write("        <div class=\"container\" align=\"center\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-9 col-md-9 col-sm-9 \">\r\n");
      out.write("\r\n");
      out.write("                     <h3>病人管理列表</h3>\r\n");
      out.write("                    \r\n");
      out.write("                      <div class=\"hr-div\"> <hr /></div>\r\n");
      out.write("                                                  <div class=\"table-responsive\">\r\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>病人编号</th>\r\n");
      out.write("                                              <th>病人姓名</th>\r\n");
      out.write("                                            <th>年龄</th>\r\n");
      out.write("                                            <th>性别</th>\r\n");
      out.write("                                            <th>地址</th>\r\n");
      out.write("                                             <th>联系电话</th>\r\n");
      out.write("                                             <th>操作</th>\r\n");
      out.write("                                           \r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                   ");

                                   
       									List<Patient> list=(List<Patient>)request.getAttribute("patientInfo");
       									if(list==null){
       										response.sendRedirect("queryAction.action?method=doShow"); 
       										return;
       									}
       										
       					 
                                       
                                   		for(int i=0;i<list.size();i++){
                                   			Patient patient=list.get(i);
                                   
      out.write("\r\n");
      out.write("                                     <tr>\r\n");
      out.write("                                            <td>");
      out.print(patient.getPatientid() );
      out.write("</td>\r\n");
      out.write("                                             <td> <i class=\"fa fa-user\" ></i> ");
      out.print(patient.getPatientname() );
      out.write("</td>\r\n");
      out.write("                                              <td>");
      out.print(patient.getAge() );
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print(patient.getSex() );
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print(patient.getAddress() );
      out.write("</span></td>\r\n");
      out.write("                                            <td>");
      out.print(patient.getPhonenumber() );
      out.write("</td>                                       \r\n");
      out.write("                                            <td><a href=\"medcinehistory.jsp\">新增 </a></td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                   \r\n");
      out.write("                                \t   \r\n");
      out.write("                                   ");

                                	   
                                   }
                                   
                                   
      out.write("\r\n");
      out.write("                                       \r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    <ul class=\"pagination\">\r\n");
      out.write("  <li class=\"disabled\"><a href=\"#\">&laquo;</a></li>\r\n");
      out.write("  <li class=\"active\"><a href=\"#\">1</a></li>\r\n");
      out.write("  <li><a href=\"#\">2</a></li>\r\n");
      out.write("  <li><a href=\"#\">3</a></li>\r\n");
      out.write("  <li><a href=\"#\">4</a></li>\r\n");
      out.write("  <li><a href=\"#\">5</a></li>\r\n");
      out.write("  <li><a href=\"#\">&raquo;</a></li>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                  <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                 \r\n");
      out.write("                    <div class=\"text-left\">\r\n");
      out.write("                        <form action=\"queryByIdAction.action\">\r\n");
      out.write("                        <tr>查询请输入病人编号：</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"patientid\"/> &nbsp;</td>\r\n");
      out.write("                        <td><input type=\"submit\" value=\"查 &nbsp;询\"/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"queryByNoAction.action\">\r\n");
      out.write("\t\t\t\t\t\t<tr>查询请输入病历编号：</tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                        <td><input type=\"text\" name=\"no\"/> &nbsp;</td>\r\n");
      out.write("                        <td><input type=\"submit\" value=\"查 &nbsp;询\"/></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("          \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--  Jquery Core Script -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <!--  Core Bootstrap Script -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

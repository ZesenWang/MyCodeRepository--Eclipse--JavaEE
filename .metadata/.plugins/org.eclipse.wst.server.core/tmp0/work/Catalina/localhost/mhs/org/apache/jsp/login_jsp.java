package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <h4><span>Call:</span> +01-4589-987-567</h4>\r\n");
      out.write("                    <h4><span>E-mail:</span> info@domain.com</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   <section style=\"padding:100px 0px 0px 0px;\" >\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-6 col-lg-offset-3  col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 \">\r\n");
      out.write("                   <p>请输入工号和密码</p>\r\n");
      out.write("                    <div class=\"alert alert-info\">\r\n");
      out.write("                 \r\n");
      out.write("                        <div class=\"media\">\r\n");
      out.write("                        <div class=\"pull-left\">\r\n");
      out.write("                            <img src=\"assets/img/admin.png\" class=\"img-responsive\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"media-body\">\r\n");
      out.write("                            <h3 class=\"media-heading\">医生登录</h3>\r\n");
      out.write("                            \r\n");
      out.write("                            <form action=\"loginAction.action\">\r\n");
      out.write("                            \t\r\n");
      out.write("                        \t\t<div class=\"form-group\">\r\n");
      out.write("                           \t\t\t<input type=\"text\" name=\"doctorid\" class=\"form-control\" required=\"required\" placeholder=\"username\" />\r\n");
      out.write("                        \t\t</div>\r\n");
      out.write("                        \t\t\r\n");
      out.write("                    \r\n");
      out.write("                        \t\t<div class=\"form-group\">\r\n");
      out.write("                            \t\t<input type=\"text\" name=\"password\" class=\"form-control\" required=\"required\" placeholder=\"Password\" />\r\n");
      out.write("                        \t\t</div>\r\n");
      out.write("                       \t\t    <div class=\"form-group\">\r\n");
      out.write("                         \t\t\t<!--   <a href=\"loginAction.action\" class=\"btn btn-success\">登录</a>-->\r\n");
      out.write("                         \t\t\t<input type=\"submit\" value=\"登录\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                      \r\n");
      out.write("\r\n");
      out.write("                             </form>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                       \r\n");
      out.write("                   \r\n");
      out.write("                    </div>\r\n");
      out.write("                  \r\n");
      out.write("                       \r\n");
      out.write("                   \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
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

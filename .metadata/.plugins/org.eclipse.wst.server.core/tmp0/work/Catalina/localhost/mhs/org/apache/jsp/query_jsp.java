package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.po.Mhs;

public final class query_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <section id=\"main\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-9 col-md-9 col-sm-9 \">\r\n");
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                      <div class=\"hr-div\"> <hr /></div>\r\n");
      out.write("                        <div class=\"col-lg-7 col-md-7 col-sm-7\">\r\n");
      out.write("                          \r\n");
      out.write("                            <div class=\"alert alert-info\">\r\n");
      out.write("                           \r\n");
      out.write("                        \t<h3>您查询的病历如下:</h3>\r\n");
      out.write("                        \t\t");

                                   
       									List<Mhs> list=(List<Mhs>)request.getAttribute("mhsInfo");
       									if(list==null){
       										response.sendRedirect("queryByNoAction.action?method=doShow"); 
       										return;
       									}
       								
      out.write("\t\t\r\n");
      out.write("       \t\t\t\t\t\t\t\t\r\n");
      out.write("       \t\t\t\t\t\t\t");
 
                                       
                                   		for(int i=0;i<list.size();i++){
                                   			Mhs mhs=list.get(i);
                                 
      out.write("\r\n");
      out.write("                          \r\n");
      out.write("                                 \t编号:");
      out.print(mhs.getNo() );
      out.write(" <br> 日期：");
      out.print(mhs.getDatetime() );
      out.write("<br>状态：");
      out.print(mhs.getStatment() );
      out.write("<br>\r\n");
      out.write("                                 \t操作：<a href=\"update.jsp?no=");
      out.print(mhs.getNo());
      out.write("\">修改 </a> &nbsp;&nbsp;<a href=\"feichu.jsp?no=");
      out.print(mhs.getNo());
      out.write("&mh=");
      out.print(mhs.getMh());
      out.write("\">废除</a>\r\n");
      out.write("                                <hr />\r\n");
      out.write("                              \t \r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                      ");
      out.print(mhs.getMh() );
      out.write("\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    \r\n");
      out.write("                                   \r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <hr />\r\n");
      out.write("                                 \r\n");
      out.write("                                 ");

                                  
       									}
                                 
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-sm-3\">\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"list-group\">\r\n");
      out.write("                        <a href=\"manage.jsp\" >返回管理页面\r\n");
      out.write("                        </a>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("               \r\n");
      out.write("             \r\n");
      out.write("              \r\n");
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

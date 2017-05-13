package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<!-- 设置页面不能缓存保护信息 -->\r\n");
      out.write("\t");
 
		response.setHeader("Cache-Control","no-store"); 
		response.setDateHeader("Expires",0); 
		response.setHeader("Pragma","No-cache");
        
	
      out.write(" \t\r\n");
      out.write("<title>职工登陆</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">  \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/mycss.css\"> \r\n");
      out.write("\t<script src=\"jq/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/myjs.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".body{\r\n");
      out.write("\tbackground-image:url(bambooTexture.jpeg);\r\n");
      out.write("}\r\n");
      out.write(".table{\r\n");
      out.write("\tborder-width:medium;\r\n");
      out.write("\tborder-color:#fff;\r\n");
      out.write("}\r\n");
      out.write("div{\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
 
	String mess = (String)session.getAttribute("mess");
	if(mess == null)
		mess = "";

      out.write("\r\n");
      out.write("<body id=\"index\" class=\"body\">\r\n");
      out.write("<h1 align=\"center\">欢迎使用</h1>\r\n");
      out.write("<h3 align=\"center\">浙江名中医馆挂号平台（内部使用）</h3>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"LoginServlet\">\r\n");
      out.write(" <div id =\"outdiv\">\r\n");
      out.write(" <div id = \"mydiv\">\r\n");
      out.write(" ");
      out.print(mess );
      out.write("\r\n");
      out.write("<table  class = \"table table-bordered\" class=\"table\">\r\n");
      out.write("    <tr id = \"text-style\">\r\n");
      out.write("      <td >用户名：</td>\r\n");
      out.write("      <td ><input type = \"text\" name = \"userName\" id = \"userName\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr id = \"text-style\">\r\n");
      out.write("      <td >密码：</td>\r\n");
      out.write("      <td ><input type = \"password\" name = \"password\" id = \"password\" ></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr id = \"text-style\">\r\n");
      out.write("      <td colspan = 1 ><input type = \"submit\" value = \"登陆\" id = \"submit\"></td>\r\n");
      out.write("      <td colspan = 1 ><input type=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

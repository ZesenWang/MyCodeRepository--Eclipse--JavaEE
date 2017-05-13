package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openWin(url,width,height){\r\n");
      out.write("var phxWin=window.open(url,'','width='+width+',height='+height+',left='+(screen.width-width)/2+',top='+(screen.height-height)/2+'');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"logo\">\r\n");
      out.write("\t\t<a href=\"#\"><img src=\"images/logo.png\" border= \"0 \"/></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"header_right\">\r\n");
      out.write("\t\t");

			String userName = null;
      		if(session.getAttribute("useName") != null)
      			userName = session.getAttribute("useName").toString();
      		if(userName == null){
      	
      out.write("\r\n");
      out.write("\t\t欢迎光临，<a href=\"reg.jsp\">注册</a>/<a href=\"login.jsp\">登陆</a>\r\n");
      out.write("\t\t");

      	}else{
      		byte a[]=userName.getBytes("ISO-8859-1");
      		userName=new String(a);
      		out.print(""+userName+"，<span style='color:red'>欢迎光临!</span>");
      	
      out.write("\n");
      out.write("      \t<a href=\"logout.jsp\">/注销</a>\n");
      out.write("      \t");
 
      	}
      	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<img src=\"images/chat.png\" />&nbsp;<a onClick=\"openWin('contact.jsp',300,200)\" style=\"cursor:hand\" >联系我们</a> <img src=\"images/order.png\" />&nbsp;<a href=\"cart_view.jsp\">购物车</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"headermenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"index.jsp\"><img src=\"images/dh_1.png\" border= \"0 \"/>&nbsp首页</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"#\" ><img src=\"images/dh_2.png\" border= \"0 \"/>&nbsp商店公告</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"ShowProductServlet\" ><img src=\"images/dh_3.png\" border= \"0 \"/>&nbsp全部商品</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"#\" ><img src=\"images/dh_4.png\" border= \"0 \"/>&nbsp付款方式</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"#\"><img src=\"images/dh_5.png\" border= \"0 \"/>&nbsp关于我们</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"li\" href=\"#\" ><img src=\"images/dh_6.png\" border= \"0 \"/>&nbsp在线留言</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"search\">\r\n");
      out.write("\t\t<form id=\"form1\" name=\"search\" method=\"post\" action=\"#\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"textfield\" style=\"color:#a4a4a4;vertical-align:middle;\" value=\"请输入关键字\"  onfocus=\"this.value=''\" />&nbsp\r\n");
      out.write("\t\t\t<input name=\"imageField\" type=\"image\" align=\"absmiddle\" src=\"images/search.gif\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>");
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

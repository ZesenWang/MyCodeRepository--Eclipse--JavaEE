package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageUserInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<a href=\"GetUserInfoServlet\">查询所有用户信息</a>&nbsp&nbsp<a href=\"reg.jsp \">添加</a>\r\n");
      out.write("\t");

		java.util.List list=(java.util.List)request.getAttribute("userInfo");
		
		if(list==null) return;
	
      out.write("\r\n");
      out.write("\t<table border=1 width=400>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>用户名</th><th>密码</th><th>操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t");

				for(int i=0;i<list.size();i++){
					com.po.Usr usr=(com.po.Usr)list.get(i);
					
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr><td>");
      out.print(usr.getUserName() );
      out.write("</td><td>");
      out.print(usr.getPassword() );
      out.write("</td><td>\r\n");
      out.write("\t\t\t\t\t<a href=\"DltUserServlet?identity=");
      out.print(usr.getUserName() );
      out.write("\">删除</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t<a href=\"UpdUserServlet?username=");
      out.print(usr.getUserName() );
      out.write("&&password=");
      out.print(usr.getPassword());
      out.write("\">修改</a></td></tr>\r\n");
      out.write("\t\t\t\t\t");

				}
			
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
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

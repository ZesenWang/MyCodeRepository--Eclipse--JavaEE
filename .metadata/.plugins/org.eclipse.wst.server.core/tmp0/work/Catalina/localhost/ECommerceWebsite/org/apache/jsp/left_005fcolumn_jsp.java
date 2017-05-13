package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class left_005fcolumn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("  \t<tr>\r\n");
      out.write("      \t<td valign=top width=4 height=4><img height=4 src=\"images/line_01.gif\" width=4></td>\r\n");
      out.write("      \t<td background=images/line_02.gif height=4></td>\r\n");
      out.write("     \t<td valign=top width=4 height=4><img height=4 src=\"images/line_03.gif\" width=4></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      \t<td background=images/line_04.gif></td>\r\n");
      out.write("      \t<td>\r\n");
      out.write("      \t\t<div id=\"left_login\">\r\n");
      out.write("      \t\t\t<img src=\"images/vip_logo.png\" /><br><br>\r\n");
      out.write("      \t\t\t");

      			String userName = null;
      			if(session.getAttribute("user") != null)
      				userName = session.getAttribute("user").toString();
      			if(userName == null){
      			
      out.write("\r\n");
      out.write("      \t\t\t\t<form action=\"Loginservlets\" method=\"post\">\n");
      out.write("      \t\t\t\t\t");

							String mess=(String)request.getAttribute("mess");
							if(mess==null){
									mess="";
							}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<font>\t");
      out.print(mess );
      out.write("</font><br>\r\n");
      out.write("      \t\t\t\t\t<font class=\"zt1\">用户名：</font><input type=\"text\" name=\"txtName\" class=\"input\"><br><br>\r\n");
      out.write("      \t\t\t\t\t<font class=\"zt1\">密&nbsp;&nbsp;码：</font><input type=\"password\" name=\"pwd\" class=\"input\"><br>\r\n");
      out.write("          \t\t\t\t<a href=\"reg.jsp\"><img src=\"images/reg_button.gif\" border= \"0 \" /></a>\r\n");
      out.write("          \t\t\t\t<input name=\"imageField\" type=\"image\" src=\"images/login_button.gif\" />\r\n");
      out.write("          \t\t\t</form>\r\n");
      out.write("          \t\t");

      			}else{      				
      				byte a[]=userName.getBytes("ISO-8859-1");
      	      		userName=new String(a);
      				Calendar cal = Calendar.getInstance();
      				int hour = cal.get(Calendar.HOUR_OF_DAY);
      				if (hour >= 5 && hour < 8) {
      					out.print("<span style='color:red'>早上好!&nbsp;"+userName+"</span>");
      				 }else if (hour >= 8 && hour < 11) {
      					out.print("<span style='color:red'>上午好!&nbsp;"+userName+"</span>");
      				 }else if (hour >= 11 && hour < 13) {
      					out.print("<span style='color:red'>中午好!&nbsp;"+userName+"</span>");
      				 }else if (hour >= 13 && hour < 18) {
      					out.print("<span style='color:red'>下午好!&nbsp;"+userName+"</span>");
      				 }else if (hour >= 18 && hour < 23) {
      					out.print("<span style='color:red'>晚上好!&nbsp;"+userName+"</span>");
      				 }else {
      					out.print("<span style='color:red'>夜深啦!&nbsp;"+userName+"</span>"); 
      				 }      					       				
       			
      out.write("\r\n");
      out.write("      \t\t\t<br><br>\r\n");
      out.write("      \t\t\t<form action=\"exit\" method=\"post\">\r\n");
      out.write("      \t\t\t\t<input type=\"submit\" name=\"exit\" value=\"退出\">\r\n");
      out.write("      \t\t\t</form>\r\n");
      out.write("      \t\t\t\t\r\n");
      out.write("      \t\t\t");

      			}
          		
      out.write("\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("      \t\t</div>\r\n");
      out.write("      \t</td>\r\n");
      out.write("      \t<td background=images/line_05.gif>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \t<tr>\r\n");
      out.write("     \t<td valign=top width=4 height=4><img height=4 src=\"images/line_06.gif\" width=4></td>\r\n");
      out.write("      \t<td background=images/line_07.gif></td>\r\n");
      out.write("      \t<td valign=top width=4 height=4><img height=4 src=\"images/line_08.gif\" width=4></td>\r\n");
      out.write("   \t</tr>\r\n");
      out.write(" </table><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<table border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("  \t<tr>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_01.gif\" width=4></td>\r\n");
      out.write("    \t<td background=images/line_02.gif height=4></td>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_03.gif\" width=4></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<td background=images/line_04.gif></td>\r\n");
      out.write("      \t<td>\r\n");
      out.write("        \t\t<div id=\"left_sort\">\r\n");
      out.write("        \t\t\t<img src=\"images/sort_logo.png\" /><br><br>\r\n");
      out.write("    \t\t\t\t<div id=\"sort_menu\">\r\n");
      out.write("    \t\t\t\t<ul id=\"menu\">\r\n");
      out.write("     \t\t\t\t\t<li><img src=\"images/sort_menu.gif\" />&nbsp;&nbsp;<a class=\"li_sort\" href=\"SortServlet?id=1\">日式女扇</a></li>\r\n");
      out.write("     \t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("     \t\t\t\t\t<li><img src=\"images/sort_menu.gif\" />&nbsp;&nbsp;<a class=\"li_sort\" href=\"SortServlet?id=2\">仿古男扇</a></li>\r\n");
      out.write("     \t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("   \t\t\t\t\t\t<li><img src=\"images/sort_menu.gif\" />&nbsp;&nbsp;<a class=\"li_sort\" href=\"SortServlet?id=3\">韩国扇</a></li>\r\n");
      out.write("   \t\t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("   \t\t\t\t\t\t<li><img src=\"images/sort_menu.gif\" />&nbsp;&nbsp;<a class=\"li_sort\" href=\"SortServlet?id=4\">檀香扇</a></li>\r\n");
      out.write("   \t\t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("   \t\t\t\t\t\t<li><img src=\"images/sort_menu.gif\" />&nbsp;&nbsp;<a class=\"li_sort\" href=\"SortServlet?id=5\">礼品广告扇</a></li>\r\n");
      out.write("   \t\t\t\t\t</ul>\r\n");
      out.write("   \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("        \t\r\n");
      out.write("      \t</td>\r\n");
      out.write("      \t<td background=images/line_05.gif>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \t<tr>\r\n");
      out.write("     \t<td valign=top width=4 height=4><img height=4 src=\"images/line_06.gif\" width=4></td>\r\n");
      out.write("      \t<td background=images/line_07.gif></td>\r\n");
      out.write("      \t<td valign=top width=4 height=4><img height=4 src=\"images/line_08.gif\" width=4></td>\r\n");
      out.write("   \t</tr>\r\n");
      out.write("</table><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<table border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("  \t<tr>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_01.gif\" width=4></td>\r\n");
      out.write("    \t<td background=images/line_02.gif height=4></td>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_03.gif\" width=4></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<td background=images/line_04.gif></td>\r\n");
      out.write("      \t<td>\r\n");
      out.write("        \t\t<div id=\"left_sort\">\r\n");
      out.write("        \t\t\t<img src=\"images/contact_logo.png\" /><br><br>\r\n");
      out.write("    \t\t\t\t<div id=\"sort_menu\">\r\n");
      out.write("    \t\t\t\t\t贝壳：<a target=\"_blank\" href=\"http://www.taobao.com/webww/ww.php?ver=3&touid=lf5806388&siteid=cntaobao&status=1&charset=utf-8\"><img border=\"0\" src=\"http://amos.alicdn.com/online.aw?v=2&uid=lf5806388&site=cntaobao&s=1&charset=utf-8\" alt=\"点这里给我发消息\" /></a>\r\n");
      out.write("     \t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("     \t\t\t\t\tQ我：<a target=\"_blank\" href=\"http://wpa.qq.com/msgrd?v=3&uin=82178712&site=qq&menu=yes\"><img border=\"0\" src=\"http://wpa.qq.com/pa?p=2:82178712:47\" alt=\"点击这里给我发消息\" title=\"点击这里给我发消息\"></a>\r\n");
      out.write("     \t\t\t\t\t<hr size=\"1\" />\r\n");
      out.write("     \t\t\t\t\t手机：18767168526\r\n");
      out.write("   \t\t\t\t\t</div>\r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("        \t\r\n");
      out.write("      \t</td>\r\n");
      out.write("      \t<td background=images/line_05.gif>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \t<tr>\r\n");
      out.write("     \t<td valign=top width=4 height=4><img height=4 src=\"images/line_06.gif\" width=4></td>\r\n");
      out.write("      \t<td background=images/line_07.gif></td>\r\n");
      out.write("      \t<td valign=top width=4 height=4><img height=4 src=\"images/line_08.gif\" width=4></td>\r\n");
      out.write("   \t</tr>\r\n");
      out.write("</table><br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("<table border=0 cellpadding=0 cellspacing=0>\r\n");
      out.write("  \t<tr>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_01.gif\" width=4></td>\r\n");
      out.write("    \t<td background=images/line_02.gif height=4></td>\r\n");
      out.write("    \t<td valign=top width=4 height=4><img height=4 src=\"images/line_03.gif\" width=4></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<td background=images/line_04.gif></td>\r\n");
      out.write("      \t<td>\r\n");
      out.write("        \t\t<div id=\"left_sort\">\r\n");
      out.write("        \t\t\t<img src=\"images/sale_logo.png\" /><br><br>\r\n");
      out.write("\t\t \t\t\t<div id=\"sale_sql_more\"><a class=\"sql_more\" href=\"more\">查看更多商品</a></div>\r\n");
      out.write("\t\t \t\t</div>\r\n");
      out.write("\t\t \t\t \r\n");
      out.write("\t\t \t\t\r\n");
      out.write("        \t\r\n");
      out.write("      \t</td>\r\n");
      out.write("      \t<td background=images/line_05.gif>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("   \t<tr>\r\n");
      out.write("     \t<td valign=top width=4 height=4><img height=4 src=\"images/line_06.gif\" width=4></td>\r\n");
      out.write("      \t<td background=images/line_07.gif></td>\r\n");
      out.write("      \t<td valign=top width=4 height=4><img height=4 src=\"images/line_08.gif\" width=4></td>\r\n");
      out.write("   \t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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

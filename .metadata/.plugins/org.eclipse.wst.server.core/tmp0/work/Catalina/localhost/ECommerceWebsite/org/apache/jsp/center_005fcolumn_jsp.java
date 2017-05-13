package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class center_005fcolumn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" rev=\"stylesheet\" href=\"css/center_column.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("//选择器\r\n");
      out.write("function $a(id,tag){var re=(id&&typeof id!=\"string\")?id:document.getElementById(id);if(!tag){return re;}else{return re.getElementsByTagName(tag);}}\r\n");
      out.write("\r\n");
      out.write("//焦点滚动图 点击移动\r\n");
      out.write("function movec()\r\n");
      out.write("{\r\n");
      out.write("\tvar o=$a(\"bd1lfimg\",\"\");\r\n");
      out.write("\tvar oli=$a(\"bd1lfimg\",\"dl\");\r\n");
      out.write("    var oliw=oli[0].offsetWidth; //每次移动的宽度\t \r\n");
      out.write("\tvar ow=o.offsetWidth-2;\r\n");
      out.write("\tvar dnow=0; //当前位置\t\r\n");
      out.write("\tvar olf=oliw-(ow-oliw+10)/2;\r\n");
      out.write("\t\to[\"scrollLeft\"]=olf+(dnow*oliw);\r\n");
      out.write("\tvar rqbd=$a(\"bd1lfsj\",\"ul\")[0];\r\n");
      out.write("\tvar extime;\r\n");
      out.write("\r\n");
      out.write("\t<!--for(var i=1;i<oli.length;i++){rqbd.innerHTML+=\"<li>\"+i+\"</li>\";}-->\r\n");
      out.write("\tvar rq=$a(\"bd1lfsj\",\"li\");\r\n");
      out.write("\tfor(var i=0;i<rq.length;i++){reg(i);};\r\n");
      out.write("\toli[dnow].className=rq[dnow].className=\"show\";\r\n");
      out.write("\tvar wwww=setInterval(uu,2000);\r\n");
      out.write("\r\n");
      out.write("\tfunction reg(i){rq[i].onclick=function(){oli[dnow].className=rq[dnow].className=\"\";dnow=i;oli[dnow].className=rq[dnow].className=\"show\";mv();}}\r\n");
      out.write("\tfunction mv(){clearInterval(extime);clearInterval(wwww);extime=setInterval(bc,15);wwww=setInterval(uu,5000);}\r\n");
      out.write("\tfunction bc()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar ns=((dnow*oliw+olf)-o[\"scrollLeft\"]);\r\n");
      out.write("\t\tvar v=ns>0?Math.ceil(ns/10):Math.floor(ns/10);\r\n");
      out.write("\t\to[\"scrollLeft\"]+=v;if(v==0){clearInterval(extime);oli[dnow].className=rq[dnow].className=\"show\";v=null;}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction uu()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(dnow<oli.length-2)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\toli[dnow].className=rq[dnow].className=\"\";\r\n");
      out.write("\t\t\tdnow++;\r\n");
      out.write("\t\t\toli[dnow].className=rq[dnow].className=\"show\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{oli[dnow].className=rq[dnow].className=\"\";dnow=0;oli[dnow].className=rq[dnow].className=\"show\";}\r\n");
      out.write("\t\tmv();\r\n");
      out.write("\t}\r\n");
      out.write("\to.onmouseover=function(){clearInterval(extime);clearInterval(wwww);}\r\n");
      out.write("\to.onmouseout=function(){extime=setInterval(bc,15);wwww=setInterval(uu,5000);}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-------- content start --------->\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- ===================== header end ===================== -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!--------main begin--------->\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-----------图片切换  begin----------->\r\n");
      out.write("\t\t<div class=\"sub_box\">\r\n");
      out.write("\t\t\t<div id=\"p-select\" class=\"sub_nav\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"sub_no\" id=\"bd1lfsj\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"show\">1</li><li class=\"\">2</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"bd1lfimg\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<dl class=\"show\"></dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<dl class=\"\">\r\n");
      out.write("\t\t\t\t\t\t<dt><a href=\"#\"><img src=\"images/asw.jpg\" alt=\"爱尚网扇品\"></a></dt>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<dl class=\"\">\r\n");
      out.write("\t\t\t\t\t\t<dt><a href=\"#\"><img src=\"images/summer.jpg\" alt=\"清爽夏日\"></a></dt>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script type=\"text/javascript\">movec();</script>\r\n");
      out.write("\t\t<!-----------图片切换  end----------->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--------main end--------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"divBorder\">\r\n");
      out.write("\t<div id=\"select_title\">\r\n");
      out.write("\t\t<h3>&nbsp;&nbsp;最新商品<img src=\"images/new.gif\" /></h3>\r\n");
      out.write("\t\t<hr size=1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=1\"><img width=\"205\" height=\"154\" src=\"Picture/1.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=1\">品名：油漆边双色龙骨扇_粉色 </a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥18</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">86</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=2\"><img width=\"205\" height=\"154\" src=\"Picture/2.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=2\">品名：油漆边双色龙骨扇_红色  </a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥18</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">5</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=3\"><img width=\"205\" height=\"154\" src=\"Picture/3.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=3\">品名：油漆边双色龙骨扇_蓝色          </a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥17</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">9</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=4\"><img width=\"205\" height=\"154\" src=\"Picture/4.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=4\">品名：油漆边双色龙骨扇_紫色  </a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥16</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">19</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=5\"><img width=\"205\" height=\"154\" src=\"Picture/5.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=5\">品名：短梢手绘折扇_梅花  </a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥18</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">29</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div id=\"select_product\">\n");
      out.write("\t\t<div id=\"select_img\"><a href=\"item?id=6\"><img width=\"205\" height=\"154\" src=\"Picture/6.jpg\"></a></div>\n");
      out.write("\t\t\t<div id=\"select_about\"><a class=\"a\" href=\"item?id=6\">品名：短梢手绘折扇_桃花</a><br> \n");
      out.write("\t\t\t促销价：<span style=\"color:#FF6600;font-weight:bold;\">￥18</span>元<br>\n");
      out.write("\t\t\t已售出：<span style=\"font-weight:bold;\">86</span>&nbsp;笔\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\t\r\n");
      out.write("</div>");
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

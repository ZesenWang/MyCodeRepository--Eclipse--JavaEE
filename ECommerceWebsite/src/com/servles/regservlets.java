package com.servles;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dataBase.DataProcess;

/**
 * Servlet implementation class regservlets
 */
public class regservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regservlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//接收数据
		request.setCharacterEncoding("utf-8");
		String strName1=request.getParameter("userName");
		String strPwd1=request.getParameter("pwd");
		String strPwd2=request.getParameter("pwd1");
		String ra=request.getParameter("sex");
		String it[]=request.getParameterValues("interest");
		
		//验证数据
		
		if(strName1==null||strName1.equals(""))
		{
			
			request.setAttribute("mess", "用户名为空");

			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		DataProcess dataProcess=new DataProcess();
		String s="select *from userinfo where username='"+strName1+"'";
		Vector<Vector<String>> r=dataProcess.getData(s);
		if(r.size()>0)
		{
			
			request.setAttribute("mess", "用户名重复");

			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		if(strPwd1==null||strPwd1.equals(""))
		{
			
			request.setAttribute("mess", "密码为空");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		if(strPwd2==null||strPwd2.equals(""))
		{
			
			request.setAttribute("mess", "请确认密码");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		if(strPwd1.equals(strPwd2)== false)
		{
			
			request.setAttribute("mess", "密码不一致！");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		if(ra==null)
		{
			
			request.setAttribute("mess", "请选择性别");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		if(it==null)
		{
			
			request.setAttribute("mess", "请选择兴趣");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
	
	
	//处理数据
			String str=new String();
			if(it!=null){
				for(int k=0;k<it.length;k++){ 
					str=str+it[k]+" ";
				}
			}
			if(!it.equals(""))str.substring(0, str.length()-1);
			
			String sql1="insert into userinfo (username,password,sex,interest) values"+"('"+strName1+"', '"+strPwd1+"','"+ra+"','"+str+"')";
			dataProcess.update(sql1);
			String sql="select *from userinfo where username='"+strName1+"'and password='"+strPwd1+"'";
			Vector<Vector<String>> rows=dataProcess.getData(sql);
			
			//登陆成功
			if(rows.size()>0){
				
				HttpSession session=request.getSession();
				session.setAttribute("userName", strName1);
				response.sendRedirect("login.jsp");
				return;
			}
			//注册失败
			request.setAttribute("mess", "注册失败");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
		}


}

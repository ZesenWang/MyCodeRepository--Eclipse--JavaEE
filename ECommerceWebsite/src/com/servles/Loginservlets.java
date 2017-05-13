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
 * Servlet implementation class Loginservlets
 */
public class Loginservlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlets() {
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
		String strName=request.getParameter("useName");
		String strPwd=request.getParameter("pwd");
		//验证数据
		
		if(strName==null||strName.equals("")||strPwd==null||strPwd.equals(""))
		{
			
			request.setAttribute("mess", "不能为空");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		//处理数据
		String sql="select *from userinfo where username='"+strName+"'and password='"+strPwd+"'";
		DataProcess dataProcess=new DataProcess();
		Vector<Vector<String>> rows=dataProcess.getData(sql);
		
		//登陆成功
		if(rows.size()>0){
			
			HttpSession session=request.getSession();
			session.setAttribute("useName", strName);
			response.sendRedirect("index.jsp");
			return;
		}
		//登录失败
		request.setAttribute("mess", "该用户不存在，登录失败");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}
	

}

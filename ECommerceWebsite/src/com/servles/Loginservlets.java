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
		//��������
		String strName=request.getParameter("useName");
		String strPwd=request.getParameter("pwd");
		//��֤����
		
		if(strName==null||strName.equals("")||strPwd==null||strPwd.equals(""))
		{
			
			request.setAttribute("mess", "����Ϊ��");
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		//��������
		String sql="select *from userinfo where username='"+strName+"'and password='"+strPwd+"'";
		DataProcess dataProcess=new DataProcess();
		Vector<Vector<String>> rows=dataProcess.getData(sql);
		
		//��½�ɹ�
		if(rows.size()>0){
			
			HttpSession session=request.getSession();
			session.setAttribute("useName", strName);
			response.sendRedirect("index.jsp");
			return;
		}
		//��¼ʧ��
		request.setAttribute("mess", "���û������ڣ���¼ʧ��");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}
	

}

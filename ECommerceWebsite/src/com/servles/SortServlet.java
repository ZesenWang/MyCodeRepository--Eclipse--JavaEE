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
 * Servlet implementation class SortServlet
 */
public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SortServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String sort = request.getParameter("id");
		HttpSession session = request.getSession();
		Vector<Vector<String>> product;
		
		if((!sort.equals("up"))&&(!sort.equals("down"))){
			DataProcess processor = new DataProcess();
			String sql = "SELECT id,name,price,img,sale FROM product WHERE sort="+sort;
			
			Vector<Vector<String>> result = processor.getData(sql);
			int currentPage = 0;
			session.setAttribute("result", result);
			session.setAttribute("currentPage", currentPage);
			
			product = getTargetProductInfo(currentPage, session);
			request.setAttribute("product", product);
			RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
			dispatcher.forward(request,response);
		}else if(sort.equals("up")){
			int currentPage = (int) session.getAttribute("currentPage");
			currentPage--;
			if(isCurrentPageExist(currentPage, session)){
				product = getTargetProductInfo(currentPage, session);
			}else{
				currentPage++;
				product = getTargetProductInfo(currentPage, session);
			}
			session.setAttribute("currentPage", currentPage);
			request.setAttribute("product", product);
			RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
			dispatcher.forward(request,response);
		}else if(sort.equals("down")){
			int currentPage = (int) session.getAttribute("currentPage");
			currentPage++;
			if(isCurrentPageExist(currentPage, session)){
				product = getTargetProductInfo(currentPage, session);
			}else{
				currentPage--;
				product = getTargetProductInfo(currentPage, session);
			}
			session.setAttribute("currentPage", currentPage);
			request.setAttribute("product", product);
			RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
			dispatcher.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private Vector<Vector<String>> getTargetProductInfo(int currentPage, HttpSession session){
		Vector<Vector<String>> result = (Vector) session.getAttribute("result");
		Vector<Vector<String>> product = new Vector<Vector<String>>();
		
		int limit = result.size() > ++currentPage * 9 ? currentPage * 9 : result.size();
		for(int i = --currentPage * 9; i < limit;i++){
			product.add(result.get(i));
		}
		return product;	
	}
	private boolean isCurrentPageExist(int currentPage, HttpSession session){
		if(currentPage < 0)
			return false;
		Vector product = (Vector) session.getAttribute("result");
		//默认一页显示9个商品
		return product.size() > currentPage * 9;
	}
}

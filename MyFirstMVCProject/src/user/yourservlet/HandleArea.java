package user.yourservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.yourbean.Area;

/**
 * Servlet implementation class HandleArea
 */
public class HandleArea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleArea() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Area dataBean = new Area();
		request.setAttribute("data", dataBean);
		
			double a = Double.parseDouble(request.getParameter("a"));
			double b = Double.parseDouble(request.getParameter("b"));
			double c = Double.parseDouble(request.getParameter("c"));
			dataBean.setA(a);
			dataBean.setB(b);
			dataBean.setC(c);
			double s = -1;
			s = (a+b)*c/2.0;
			dataBean.setArea(s);
			dataBean.setMess("ÌÝÐÎÃæ»ý");
		RequestDispatcher dispatcher = request.getRequestDispatcher("showResult.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

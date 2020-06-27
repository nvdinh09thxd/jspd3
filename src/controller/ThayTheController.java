package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThayTheController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ThayTheController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String chuoigoc = request.getParameter("chuoigoc");
		String tugoc = request.getParameter("tugoc");
		String tuthaythe = request.getParameter("tuthaythe");
		if (chuoigoc == null || tugoc == null || tuthaythe == null) {//Nếu chạy từ file servlet thì chuyển hướng sang file jsp
			response.sendRedirect(request.getContextPath() + "/baitap/BT4/BT4.jsp");
		} else {
			String chuoithaythe = chuoigoc.replace(tugoc, tuthaythe);
			request.setAttribute("chuoigoc", chuoigoc);
			request.setAttribute("tugoc", tugoc);
			request.setAttribute("tuthaythe", tuthaythe);
			request.setAttribute("chuoithaythe", chuoithaythe);
			RequestDispatcher rd = request.getRequestDispatcher("/baitap/BT4/BT4.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

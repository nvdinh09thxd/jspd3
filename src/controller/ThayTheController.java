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
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT4/BT4.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String chuoigoc = request.getParameter("chuoigoc");
		String tugoc = request.getParameter("tugoc");
		String tuthaythe = request.getParameter("tuthaythe");
		request.setAttribute("chuoigoc", chuoigoc);
		request.setAttribute("tugoc", tugoc);
		request.setAttribute("tuthaythe", tuthaythe);
		if (chuoigoc == "" || tugoc == "" || tuthaythe == "") {
			RequestDispatcher rd = request.getRequestDispatcher("/baitap/BT4/BT4.jsp?err=0");
			rd.forward(request, response);
			return;
		} else {
			String chuoithaythe = chuoigoc.replace(tugoc, tuthaythe);
			request.setAttribute("chuoithaythe", chuoithaythe);
			RequestDispatcher rd = request.getRequestDispatcher("/baitap/BT4/BT4.jsp");
			rd.forward(request, response);
		}
	}

}

package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InCauChaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InCauChaoController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT2/BT2.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String hoten = request.getParameter("hoten");
		request.setAttribute("hoten", hoten);
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT2/BT2.jsp");
		rd.forward(request, response);
	}
}

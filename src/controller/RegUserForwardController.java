package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg-user-forward")
public class RegUserForwardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegUserForwardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/baihoclop/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String hoten = request.getParameter("hoten");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		request.setAttribute("hoten", hoten);
		request.setAttribute("tuoi", Integer.toString(tuoi));
		RequestDispatcher rd = request.getRequestDispatcher("/baihoclop/info.jsp");
		rd.forward(request, response);
	}

}

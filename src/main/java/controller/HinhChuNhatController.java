package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HinhChuNhatController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HinhChuNhatController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("baitap/BT1/BT1a.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		float chieuDai = Float.parseFloat(request.getParameter("chieudai"));
		float chieuRong = Float.parseFloat(request.getParameter("chieurong"));
		float chuVi = (chieuDai + chieuRong) * 2;
		float dienTich = chieuDai * chieuRong;
		out.println("Chiều dài: " + chieuDai + " -- Chiều rộng: " + chieuRong);
		out.println("<br />Chu vi: " + chuVi + " == Diện tích: " + dienTich);
	}

}

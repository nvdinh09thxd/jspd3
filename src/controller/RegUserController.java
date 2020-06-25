package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg-user")
public class RegUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegUserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String hoten = request.getParameter("hoten");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		String chieucao = request.getParameter("chieucao");
		out.print("Họ tên: " + hoten + "<br />");
		out.print("Tuổi: " + tuoi + "<br />");
		out.print("Chiều cao: " + chieucao + "<br />");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String hoten = request.getParameter("hoten");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		String chieucao = request.getParameter("chieucao");
		out.print("Họ tên: " + hoten + "<br />");
		out.print("Tuổi: " + tuoi + "<br />");
		out.print("Chiều cao: " + chieucao + "<br />");
	}

}

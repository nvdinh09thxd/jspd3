package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InfoController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().println("This is doGET<br />");
		getParam(request, response);
		response.getWriter().println("Họ tên: ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.getWriter().println("This is doPOST<br />");
		getParam(request, response);
	}

	public void getParam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String hoten = request.getParameter("hoten");
		int tuoi = 0;
		try {
			tuoi = Integer.valueOf(request.getParameter("tuoi"));
		} catch (Exception e) {}
		 String chieucao = request.getParameter("chieucao");
		out.println("Họ tên: " + hoten + "<br />");
		out.println("Tuổi: " + tuoi + "<br />");
		out.println("Chiều cao: " + chieucao + "<br />");
	}

}

package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SoNgauNhienController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SoNgauNhienController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random rand = new Random();
		int soNgauNhien = rand.nextInt(81) + 20;
		request.setAttribute("songaunhien", soNgauNhien);
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT5/random.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
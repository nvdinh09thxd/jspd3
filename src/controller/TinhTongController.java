package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TinhTongController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TinhTongController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String daySo = request.getParameter("dayso");
		String arDaySo[] = daySo.split(",");
		int tong = 0;
		for (int i = 0; i < arDaySo.length; i++) {
			if (isNumber(arDaySo[i]))
				tong += Integer.parseInt(arDaySo[i]);
		}
		out.println("Tổng của dãy số là: " + tong);
	}

	public boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}

package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HinhTronController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final double PI = 3.14;

	public HinhTronController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String banKinh = request.getParameter("bankinh");
		String dienTich = request.getParameter("dientich");
		double dblBanKinh;
		double dblDienTich;
		if (banKinh != "") {
			dblBanKinh = (double) Math.round(Double.parseDouble(banKinh) * 100) / 100;
			dblDienTich = dblBanKinh * dblBanKinh * PI;
			dblDienTich = (double) Math.round(dblDienTich * 100) / 100;
			request.setAttribute("bankinh", Double.toString(dblBanKinh));
			request.setAttribute("dientich", Double.toString(dblDienTich));
		} else {
			dblDienTich = (double) Math.round(Double.parseDouble(dienTich) * 100) / 100;
			dblBanKinh = Math.sqrt(dblDienTich / PI);
			dblBanKinh = (double) Math.round(dblBanKinh * 100) / 100;
			request.setAttribute("bankinh", Double.toString(dblBanKinh));
			request.setAttribute("dientich", Double.toString(dblDienTich));
		}
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT3/hinhtron.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
}

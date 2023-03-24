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
		RequestDispatcher rd = request.getRequestDispatcher("baitap/BT3/hinhtron.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String banKinh = request.getParameter("bankinh");
		String dienTich = request.getParameter("dientich");
		if ((banKinh == "" && dienTich == "") || (banKinh != "" && dienTich != "")) {
			request.setAttribute("bankinh", banKinh);
			request.setAttribute("dientich", dienTich);
			RequestDispatcher rd = request.getRequestDispatcher("baitap/BT3/hinhtron.jsp?err=2");
			rd.forward(request, response);
			return;
		}
		try {
			double dblBanKinh;
			double dblDienTich;
			if (banKinh != "") {
				dblBanKinh = (double) Math.round(Double.parseDouble(banKinh) * 100) / 100;// làm tròn 2 chữ số thập phân
				dblDienTich = dblBanKinh * dblBanKinh * PI;
				dblDienTich = (double) Math.round(dblDienTich * 100) / 100;// làm tròn 2 chữ số thập phân
			} else {
				dblDienTich = (double) Math.round(Double.parseDouble(dienTich) * 100) / 100;// làm tròn 2 chữ số thập
																							// phân
				dblBanKinh = Math.sqrt(dblDienTich / PI);
				dblBanKinh = (double) Math.round(dblBanKinh * 100) / 100;// làm tròn 2 chữ số thập phân
			}

			request.setAttribute("bankinh", Double.toString(dblBanKinh));
			request.setAttribute("dientich", Double.toString(dblDienTich));
			RequestDispatcher rd = request.getRequestDispatcher("baitap/BT3/hinhtron.jsp");
			rd.forward(request, response);
		} catch (NumberFormatException e) {
			request.setAttribute("bankinh", banKinh);
			request.setAttribute("dientich", dienTich);
			RequestDispatcher rd = request.getRequestDispatcher("baitap/BT3/hinhtron.jsp?err=1");
			rd.forward(request, response);
		}
	}
}

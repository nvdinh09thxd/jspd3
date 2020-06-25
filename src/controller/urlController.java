package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class urlController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public urlController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().print("this is doget<br />");
		String ten = request.getParameter("hoten");
		int tuoi = 0;
		try {
			tuoi = Integer.valueOf(request.getParameter("tuoi"));
		} catch (Exception e) {}

		/**
		 * nếu tuổi lớn hơn 100 chuyển hướng sang trang index.jsp, nếu tuổi bé hơn 100
		 * thì chuyển tiếp sang trang admin.jsp, đồng thời in ra tên, tuổi
		 */

		request.setAttribute("ten", ten);
		request.setAttribute("tuoi", tuoi);

		if (tuoi > 100) {
			//chuyển hướng
			response.sendRedirect(request.getContextPath() + "/main/index.jsp");
			return;
		} else {
			// chuyển tiếp (forward)
			RequestDispatcher rd = request.getRequestDispatcher("/main/admin.jsp");
			rd.forward(request, response);
//			Không in được dòng chữ này
			PrintWriter out = response.getWriter();
			out.println("This is doPOST<br />");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().print("this is dopost");
	}

}

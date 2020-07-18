package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegUserController")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterUserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//chuyển tiếp sang trang register.jsp
		RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		//Lấy các tham số từ form
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String address = request.getParameter("address");
		
		//setAttribute cho các tham số
		request.setAttribute("name", name);
		request.setAttribute("address", address);
		
		//Kiểm tra validate cho các trường
		if ("".equals(name)) {
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp?err=1");
			rd.forward(request, response);
		} else if ("".equals(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp?err=2");
			rd.forward(request, response);
		} else if ("".equals(address)) {
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp?err=3");
			rd.forward(request, response);
		} else if (!pass.equals(repass)) {
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp?err=4");
			rd.forward(request, response);
		} else if (!pass.startsWith("VNE")) {
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register.jsp?err=5");
			rd.forward(request, response);
		} else {
			request.setAttribute("pass", pass);
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/index.jsp");
			rd.forward(request, response);
		}
	}

}

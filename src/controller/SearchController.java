package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		int id = Integer.parseInt(request.getParameter("id"));
		switch (id) {
		case 1:
			response.sendRedirect(
					"https://www.google.com/search?sxsrf=ALeKk00FSEOaqESywSXXxmvaAyT6CSvnWw%3A1593005781440&source=hp&ei=1VbzXtOQGbfez7sPzv2jiA4&q=H%E1%BB%8Dc+java&oq=H%E1%BB%8Dc+java&gs_lcp=CgZwc3ktYWIQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BQgAELEDOgQIIxAnOgUIABCDAVDSuSBY5dMgYMHWIGgCcAB4AIABaogBzwWSAQM5LjGYAQCgAQGqAQdnd3Mtd2l6&sclient=psy-ab&ved=0ahUKEwiTz-f9yJrqAhU373MBHc7-COEQ4dUDCAc&uact=5");
			break;
		case 2:
			response.sendRedirect(
					"https://www.google.com/search?sxsrf=ALeKk02003PK1gYdkcujvyHCvnK3eprMCg%3A1593006318012&ei=7ljzXrAf-9bPuw_-5KiYBA&q=H%E1%BB%8Dc+PHP&oq=H%E1%BB%8Dc+PHP&gs_lcp=CgZwc3ktYWIQAzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADICCAA6BAgAEEc6BAgjECc6BQgAELEDOgQIABBDOgUIABCDAVDKhANYmJkDYJSdA2gAcAF4AIABVogBqQSSAQE3mAEAoAEBqgEHZ3dzLXdpeg&sclient=psy-ab&ved=0ahUKEwiwztb9yprqAhV763MBHX4yCkMQ4dUDCAw&uact=5");
			break;
		default:
			response.sendRedirect("https://www.google.com/");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
	}

}

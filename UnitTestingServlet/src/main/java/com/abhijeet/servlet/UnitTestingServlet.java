package com.abhijeet.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class UnitTestingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void saveToSession(HttpServletRequest request) {
		String testparam = request.getParameter("testparam");
		request.getSession().setAttribute("testAttribute", testparam);
	}
}
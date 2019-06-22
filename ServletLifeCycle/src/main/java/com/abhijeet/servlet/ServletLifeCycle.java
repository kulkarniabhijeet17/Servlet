package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config;

	private StringBuffer sb;

	public void init(ServletConfig config) throws ServletException {
		sb = new StringBuffer();
		sb.append("in init(config) method of HttpServlet->");

		this.config = config;
		init();
	}

	public void init() {
		sb.append("in init method of HttpServlet->");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		sb.append("in service method of HttpServlet->");

		doGet(req, res);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		sb.append("in doGet method of HttpServlet->");

		res.setContentType("text/html");
		res.getWriter().println("<html><body><h1>" + sb.toString() + "</h1></body></html>");

		sb.delete(0, sb.length());
	}

	public void destroy() {
		System.out.println("destroyed");
	}
}
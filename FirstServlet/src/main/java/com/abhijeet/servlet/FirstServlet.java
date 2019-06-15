package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside init() method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside service() method");
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy() method");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Inside getServletConfig() method");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("Inside getServletInfo() method");
		return null;
	}
}
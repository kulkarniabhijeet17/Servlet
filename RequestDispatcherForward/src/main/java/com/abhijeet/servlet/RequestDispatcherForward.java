package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher;
		requestDispatcher = request.getRequestDispatcher("/examples/servlet/views/hello.jsp");

		requestDispatcher.forward(request, response);
	}
}
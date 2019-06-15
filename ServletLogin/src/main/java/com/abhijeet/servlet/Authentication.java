package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Authentication extends HttpServlet {
	static final long serialVersionUID = 1L;

	public Authentication() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String passwd = request.getParameter("password");
		String cPass = "@bhi";
		if (cPass.equals(passwd)) {
			HttpSession httpSession = request.getSession();
			System.out.println("Session id = " + httpSession.getId());
			httpSession.setAttribute("username", "Abhijeet");
			// s.isNew();
			RequestDispatcher disp = request.getRequestDispatcher("welcome.jsp");
			disp.forward(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}
}
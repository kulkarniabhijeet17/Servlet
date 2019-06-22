package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("name", "User's Session");

		Cookie user = new Cookie("user", "Jennifer");
		user.setMaxAge(3600);
		resp.addCookie(user);

		RequestDispatcher dispatch = req.getRequestDispatcher("/jsp/second.jsp");
		dispatch.forward(req, resp);
	}
}
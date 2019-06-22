package com.abhijeet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("reqAttr", "this is request Attribute");
		HttpSession sess = req.getSession();
		sess.setAttribute("sessAttr", "this is session Attribute");
		ServletContext cont = getServletContext();
		cont.setAttribute("contAttr", "this is context Attribute");
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("/second.do");
		reqDispatcher.forward(req, res);
	}
}
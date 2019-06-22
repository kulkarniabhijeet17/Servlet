package com.abhijeet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String reqAttr = (String) req.getAttribute("reqAttr");
		HttpSession sess = req.getSession();

		String sessAttr = (String) sess.getAttribute("sessAttr");
		ServletContext cont = getServletContext();
		String contAttr = (String) cont.getAttribute("contAttr");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>SecondServlet</title></head>");
		out.print("<body><h1>The request Scope Attribute value is : " + reqAttr + "</h1><br>");
		out.print("<h1>The session Scope Attribute value is : " + sessAttr + "</h1><br>");
		out.print("<h1>The session Scope Attribute value is : " + contAttr + "</h1><br>");
		out.print("</body></html>");
	}
}
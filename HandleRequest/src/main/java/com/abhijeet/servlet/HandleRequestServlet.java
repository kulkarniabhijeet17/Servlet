package com.abhijeet.servlet;

import java.io.*;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HandleRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.println("<html><head><title>HandleRequestServlet</title></head>");
		out.println("<BODY>\n" + "<H1 ALIGN=CENTER>" + "Http Request Contents" + "</H1>\n" + "<B>Request Method: </B>"
				+ req.getMethod() + "<BR>\n" + "<B>Request URI: </B>" + req.getRequestURI() + "<BR>\n"
				+ "<B>Request Protocol: </B>" + req.getProtocol() + "<BR><BR>\n" + "<TABLE BORDER=1 ALIGN=CENTER>\n"
				+ "<TR>\n" + "<TH>Header Name<TH>Header Value");

		Enumeration headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.println("<TR><TD>" + headerName);
			out.println("	<TD>" + req.getHeader(headerName));
		}

		out.println("</TABLE><br><br>");
		out.print("********************Config and Context Params********************<br><br>");
		out.println("Config paramater Value:" + getServletConfig().getInitParameter("ConfigParam") + "<br>");
		out.println("Context paramater Value: " + getServletContext().getInitParameter("ContextParam"));
		out.println("</BODY></HTML>");
	}
}
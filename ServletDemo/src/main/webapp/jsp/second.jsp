<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Second Page</title>
</head>
<body>
	<% String sessionText = (String) pageContext.getSession().getAttribute("name"); out.println("The session attribute's value: <b>" + sessionText); out.println("</b><br>The User cookie is: <b>"); Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("user"))
				out.println(cookies[i].getValue());
			}}
	out.println("</b>");
	%>
</body>
</html>
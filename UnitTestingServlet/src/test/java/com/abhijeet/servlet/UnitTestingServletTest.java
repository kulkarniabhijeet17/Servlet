package com.abhijeet.servlet;

import junit.framework.*;
import org.apache.cactus.*;

// Start Server and Open a browser and type- http://localhost:8085/test/ServletTestRunner?suite=UnitTestingServletTest
public class UnitTestingServletTest extends ServletTestCase {
	public UnitTestingServletTest(String theName) {
		super(theName);
	}

	public static Test suite() {
		return new TestSuite(UnitTestingServletTest.class);
	}

	public void beginSaveToSessionOK(WebRequest webRequest) {
		webRequest.addParameter("testparam", "it works!");
	}

	public void testSaveToSessionOK() {
		UnitTestingServlet servlet = new UnitTestingServlet();
		servlet.saveToSession(request);
		assertEquals("it works!", session.getAttribute("testAttribute"));
	}
}
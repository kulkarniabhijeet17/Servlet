package com.abhijeet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class HelloWorldFilter
 */
@WebFilter("/HelloWorldFilter")
public class HelloWorldFilter implements Filter {
	public void doFilter(final ServletRequest request, final ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Entering Filter");
		request.setAttribute("hello", "Hello World!");
		chain.doFilter(request, response);
		System.out.println("Exiting Filter");
	}

	@Override
	public void destroy() {

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
}
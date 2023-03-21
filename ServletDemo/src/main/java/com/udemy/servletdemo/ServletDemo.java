package com.udemy.servletdemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletDemo extends HttpServlet {

	private String output;
	
	public void init() throws ServletException {
		
		output = "Advanced Java Programming";
		
	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println(output);
	}
	
	public void destroy() {

		System.out.println("Over");
	}
	
}




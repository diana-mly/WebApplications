package com.form.FirstForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstForm extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		resp.setContentType("text/html");
		out.println("Hello World");
		
		
		

		RequestDispatcher rd = req.getRequestDispatcher("form.html");
		rd.include(req, resp);
		((HttpServletResponse) resp).sendRedirect("form.html");
		
		
		out.close();
	}
}

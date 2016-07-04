package com.form.FirstForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstForm extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
				
		String name = req.getParameter("name");
	    String pass = req.getParameter("pass");
	    
	    //System.out.println("Name:" + name);
	    //System.out.println("Password:" + pass);
	    
	    PrintWriter writer = resp.getWriter();
	    

	    RequestDispatcher rd = req.getRequestDispatcher("firstform.htm");
	    rd.include(req, resp);
	    //((HttpServletResponse) resp).sendRedirect("formresult.htm");
	    
	    
	    
	    
	    String htmlRespone = "";
        htmlRespone += "<h2>Your username is: " + name + "<br/>";
        htmlRespone += "Your password is: " + pass + "</h2>";    
         
        writer.println(htmlRespone);
		
	}
}

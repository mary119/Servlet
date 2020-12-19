package com.xworkz.servletcontext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/weather")
public class Weather extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	  /* ServletConfig config = getServletConfig();
	   String sale=	config.getInitParameter("sale");*/
	   
	   ServletContext context=getServletContext();
	   String temp= context.getInitParameter("temperature");
		//String cool=context.getInitParameter("cool");
		
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
	     writer.print(temp);
		//writer.print("temperature");
	
	}

}

package com.xworkz.servlet.electonicpd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/elect")
public class ElectronicFinal extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		String name = req.getParameter("nm");



		   ServletContext context= getServletContext();
		   String OfferMessage=	context.getInitParameter("OfferMessage");
		   String OfferPrice=context.getInitParameter("OfferPrice");
		   
	    	PrintWriter writer = resp.getWriter();
	    	writer.print(OfferMessage + " " + OfferPrice);
		    writer.print("Thank you for ordering" + name);
	}


}



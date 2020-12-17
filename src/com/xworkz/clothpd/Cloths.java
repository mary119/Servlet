package com.xworkz.clothpd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cl")
public class Cloths extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	ServletContext context = getServletContext();
	String offermsg= context.getInitParameter("OfferMessage");
	String offers = context.getInitParameter("OfferPrice");
	
	PrintWriter writer= resp.getWriter();
	writer.println("<html>" + "<h1>" + offermsg + offers +"</h1>" +
	         "<form action='cloth'>" + "<body bgcolor='DarkOliveGreen'>" +
			"Name :<input type='text' name='nm'>" + "Id :<input type='text' name='id'>" +
	         "NoOfCloths:<input type='text' name='nc'>" + 
			"Price:<input type='text' name='pp'>"+
	         "<input type='submit' value ='SUBMIT'>" + "</form>" + "</body>" + "</html>");
	
			
	
	}

}

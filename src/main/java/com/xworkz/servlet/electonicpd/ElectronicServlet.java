package com.xworkz.servlet.electonicpd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ep")
public class ElectronicServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	   ServletContext context= getServletContext();
	   String OfferMessage=	context.getInitParameter("OfferMessage");
	   String OfferPrice=context.getInitParameter("OfferPrice");
	   
	   PrintWriter writer= resp.getWriter();
	   writer.println("<html>" +
	   "<h1>" + OfferMessage + OfferPrice + "</h1>"
	   + "<form action= 'elect'>"  + "<body bgcolor='darkolivegreen'>" 
	   + "Name :<input type='text' name='nm'> " + "Id:<input type='text' name='id'>"
	   + "NoOfProducts :<input typ='tex' name='nop'>" + "Price : <input type='text' name='pr'>"
	   + "<input type='submit' value='SUBMIT'>" + "</form>" + "</body>" + "</html>" );
	   
	}
	
}



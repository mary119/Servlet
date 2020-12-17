package com.xworkz.bookpd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bp")
public class BookServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	ServletContext context= getServletContext();
	String offermsg= context.getInitParameter("OfferMessage");
	String offers = context.getInitParameter("OfferPrice");
	
	PrintWriter  writer = resp.getWriter();
	//writer.println(offermsg +"   "+offers);
	writer.println("<html>"  + "<h1>" + offermsg + offers + "</h1>" 
			+ "<form action= 'read'>" + "<body bgcolor='cyan'>"
	        + "Name : <input type='text' nam e='nm'>" + "ID: <input type='text' name='id'>"
	        +  "NoOfBooks : <input type='text' name='nob'>"
	        + "Price : <input type='text' name='prb'>"
			+ "<input type = 'submit' value='SUBMIT'>" +  "</form>" +"</body>"+ "</html>");
	
	}
}

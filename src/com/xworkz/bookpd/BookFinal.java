package com.xworkz.bookpd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class BookFinal extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String NoOfBooks = req.getParameter("nob");
	
	
	ServletContext context = getServletContext();
	String offermsg= context.getInitParameter("OfferMessage");
	String offers = context.getInitParameter("OfferPrice");
	
	PrintWriter writer = resp.getWriter();
 	writer.print(offermsg + " " + offers);
    writer.print("Thank you for ordering" + NoOfBooks);
	}
}

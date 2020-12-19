package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sess")
public class FirstSession extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      resp.setContentType("text/html");
      String name=req.getParameter("nm");
      
      HttpSession httpsn= req.getSession();//getting ref of httpsession 
      httpsn.setMaxInactiveInterval(1000);//setting age for session
      httpsn.setAttribute("name", name);
      
      PrintWriter writer= resp.getWriter();
      writer.print("<body bg color='lightblue'>");
      writer.print("<form action = 'ss'>");
      writer.print("<input type='submit' type='NextServlet'>");
      writer.print("</form>");
      writer.print("</body>");
      writer.close();
	}

}

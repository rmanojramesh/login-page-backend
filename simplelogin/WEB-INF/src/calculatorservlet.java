package com.login;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

public class calculatorservlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	String req = request.getParameter("request");
	if(req.equals("lastpage"))
	{
		returnback(request,response);
	}
	else
	{
	response.sendRedirect("calculator.jsp");
	}
	}
	protected void returnback(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	response.sendRedirect("welcomepage.jsp");
	}

}
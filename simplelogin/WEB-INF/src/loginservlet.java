package com.login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import com.login.database.logindb;

//@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		logindb db = new logindb();
		if(db.check(username,password))
		{	HttpSession session = request.getSession();
			session.setAttribute("username",username);
			response.sendRedirect("welcomepage.jsp");
		}
		else
		{
			response.sendRedirect("loginpage.jsp");
		}
	}
}
package com.login;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

public class logoutservlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
	
	HttpSession session = request.getSession();
	session.removeAttribute("username");
	session.invalidate();
	response.sendRedirect("loginpage.jsp");
	}
}
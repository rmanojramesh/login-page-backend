<%@ page language = "java" contentType = "text/html; charset=UTF-8"
   pageEncoding = "UTF-8"%>
<style>
p{
	text-align: right;
	font-size = 10px;
  }
</style>
<html>
<header>
<p>hello ${username}</p></header>
<head>Welcome to the page after login</head>
<body>

<% 
response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
if(session.getAttribute("username")==null)
{	
	response.sendRedirect("loginpage.jsp");
}
%>
<form action = "logout">
<input type = "submit" value = "Logout">
</form>
<form action = "calci" >
<input type ="submit" value = "calculator">
</form>
</body>
</html>
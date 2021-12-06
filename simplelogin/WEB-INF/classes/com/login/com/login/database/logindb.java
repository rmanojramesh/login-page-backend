package com.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class logindb{
String sql = "select * from logincreds where username = ? and password = ?";
String url = "jdbc:mysql://localhost:3306/myDatabase";
String username_sql = "root";
String password_sql = "";
public boolean checkcreds(String username,String password)
{	
	try{
	Class.forName("com.mysql.jdbc.Driver"	);
	Connection con = DriverManager.getConnection(url,username_sql,password_sql);
	PreparedStatement st = con.prepareStatement(sql);
	st.setString(1,username);
	st.setString(2,password);
	ResultSet rs = st.executeQuery();
	if(rs.next())
	{
		return true;
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	return false;
}
}
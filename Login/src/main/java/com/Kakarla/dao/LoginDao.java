package com.Kakarla.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	
	public boolean check(String UserName, String Password) 
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj","root","Kakarla$08012001");
		String query ="select * from Login where UserName=? and Password=?";
		PreparedStatement st =con.prepareStatement(query);
		st.setString(1,UserName);
		st.setString(2,Password);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			return true;
		}
		
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		return false;
	}

}

package com.Kakarla;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Kakarla.dao.LoginDao;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   String UserName= request.getParameter("UserName");
	   String Password = request.getParameter("Password");
	   
	   LoginDao dao =new LoginDao();
	   
	   if(dao.check(UserName, Password)) {
		   HttpSession session = request.getSession();
		   session.setAttribute("User",UserName );
		   response.sendRedirect("Welcome.jsp");
	   }
	   else {
		   response.sendRedirect("Login.jsp");
	   }
	   
		
	}


}



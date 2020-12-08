package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserValues uservalues=new UserValues();
	@Override
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String uname=request.getParameter("userName");
		String pwd=request.getParameter("password");
		String uadd=request.getParameter("address");
		
		UserData ud=new UserData();
		ud.setFirstName(fname);
		ud.setLastName(lname);
		ud.setUserName(uname);
		ud.setPassword(pwd);
		ud.setAddress(uadd);
		
		try {
			uservalues.registerUser(ud);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("index.html");
		dispatcher.forward(request, response);
		
		
		
		
	}

	

}

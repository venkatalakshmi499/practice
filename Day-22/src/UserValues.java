package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserValues {
public int registerUser(UserData ud) throws ClassNotFoundException
{
	String values="INSERT INTO USER "+
      "(FirstName , LastName , UserName , upassword  ,address) values"+"(?,?,?,?,?);";
		int result=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection connection=DriverManager
				.getConnection("jdbc:mysql://localhost:3306/hcldb", "root", "Venky@499");
				PreparedStatement ps=connection.prepareStatement(values))
				{
			ps.setString(1,ud.getFirstName());
			ps.setString(2,ud.getLastName());
			ps.setString(3,ud.getUserName());
		    ps.setString(4,ud.getPassword());
			ps.setString(5,ud.getAddress());
			
			System.out.println(ps);
			result=ps.executeUpdate();
			
				}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
				
}
}

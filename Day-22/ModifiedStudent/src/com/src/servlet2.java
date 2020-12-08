package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String FirstName=request.getParameter("fname");
		String LastName=request.getParameter("lname");
		String UserName=request.getParameter("uname");
		String upassword=request.getParameter("uadd");
		String address =request.getParameter("pwd");
		
		
		
		String url="jdbc:mysql://localhost:3306/hcldb";
		String user="root";
		String password="Venky@499";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
			int rowsinserted=st.executeUpdate("insert into user1 values('"+FirstName+"','"+LastName+"','"+UserName+"','"+upassword+"','"+address+"')");
			if(rowsinserted>0)
			{
				out.print("yor are registered"+FirstName);
			}
			else
			{
				out.print("invalid");
			}
			ResultSet rs=st.executeQuery("select * from user1");
			 while(rs.next())
			 {
				   String fname1=rs.getString(FirstName);
				   String lname1=rs.getString(LastName);
				   String uname1=rs.getString(UserName);
				   String pwd1=rs.getString(upassword);
				   String uadd1=rs.getString(address);
				   out.println(fname1+" | "+lname1+" | "+uname1+" | "+uadd1);
				   
				   
			 }
			 out.println("</body></html>");
				st.close();
				con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

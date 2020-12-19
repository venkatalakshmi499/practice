<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
body {
	background-image:url('data:image/jpeg;base64,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');
	background-repeat: no-repeat;
    background-size: cover;
}
tr{
 list-stle-type:none;
 margin:0;
 padding:0;
 overflow:hidden;
 background-color:#333;
}
td{
float:left;
}
td a{
display:inline-block;
color:white;
text-align:center;
padding:14px 16px;
text-decoration:none;
}
td a:hover{
background-color:#111;
}
</style>
 
</head>
<body>
<h3 align="center">Welcome To AirLine Reservations</h3>
        <form action="">
        <table align="center">
        
				<tr>
                <td><a href="newUser">UserRegister</a>
                </td>
                <td><a href="./adminlogin">AdminLogin</a>
                </td>
                <td><a href="./FlightsList">BookFlight</a>
                </td>
                <td><a href="./home">LogOut</a>
                </td>
            </tr>
            
            </table>
            
        
</form>

</body>
</html>
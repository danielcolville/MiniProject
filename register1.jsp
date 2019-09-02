<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<%
Object st=request.getAttribute("error");
boolean err=false;
if(st!=null ) {
	err=(boolean) st;
}
if(err) {
	out.print("Error registering: all fields must be filled<br>");
}
RequestDispatcher rd1=request.getRequestDispatcher("header.jsp");
rd1.include(request,response);
%>
Enter Information below to create an account

</h1>
<form action="RegVerify" method="post">
<table style="width:50%">
<tr>
<td>Username</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Tag/Screen Name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

</table>
<input type="submit" value="Submit">
</form>
</body>
</html>
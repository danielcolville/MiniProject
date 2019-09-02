<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object st=request.getAttribute("error");
boolean err=false;
if(st!=null ) {
	err=(boolean) st;
}
if(err) {
	out.print("<h2>Error logging in</h2><br>");
}
RequestDispatcher rd1=request.getRequestDispatcher("header.jsp");
rd1.include(request,response);
%>
<form action="LoginServ" method="post">
<table style"width:50%">
<tr><td>Username</td>
<td><input type="text" name="username"></td></tr>

<tr><td>Password</td>
<td><input type="password" name="password"></td></tr>


</table>
<input type="submit" value="Login" />
</form>
</body>
</html>
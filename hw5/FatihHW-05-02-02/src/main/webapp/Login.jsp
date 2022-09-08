<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.fatih.user.*"%>
<%
String username = "";
String password = "";
String message = "";
if(request.getParameter("login")!=null){
	   username=request.getParameter("username");
	   password=request.getParameter("password");
	   UserManager userManager=new UserManager();
	   User user=userManager.findByUserName(username);
	   if(username.equals(user.getUserName()) && password.equals(user.getUserPassword())){
		   session.setAttribute("username", username);
		   response.sendRedirect("Home.jsp");
	   }
	   else{
		   message="Yanlış!";
	   }
	
}




%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Login.jsp" method="POST">
		User name: <input type="text" name="username" ><br /> <br />
		Password: <input type="text" name="password" ><br /> <br />
		<input type="submit" value="Login" name="login"><br />
		<a href="Register.jsp" >Register</a>
		<br />
<%=message%>


</form>

</body>
</html>
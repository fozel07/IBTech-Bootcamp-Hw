<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.fatih.user.*" %>
    
    
    
<%
String username = "";
String password = "";
String message = "";
if(request.getParameter("Signin")!=null){
	   username=request.getParameter("username");
	   password=request.getParameter("password");
	   UserManager userManager=new UserManager();
	   User user=userManager.findByUserName(username);
	  
	   if(user!=null && username.equals(user.getUserName())){
		   message="Bu kullanıcı adı zaten mevcut.";
	   }
	   else{
		   User new_user=new User(username,password);
		   userManager.create(new_user);
		   session.setAttribute("username", username);
		   response.sendRedirect("Home.jsp");
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
<form action="Register.jsp" method="POST">
		User name: <input type="text" name="username" ><br /> <br />
		Password: <input type="text" name="password" ><br /> <br />
		<input type="submit" value="Sign in" name="Signin"><br />
		<br />
<%=message%>


</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
if (session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp");
	
}


%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br> 
Merhaba <%=session.getAttribute("username")%>		
<br> 
<a href="Logout.jsp">Çıkış Yap</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.fatih.RectangleHW.Rectangle" %>
    
<%
int width = 0;
int length = 0;
int area = 0;
int perimeter = 0;	
if(request.getParameter("calculate")!=null){
	 width = Integer.parseInt(request.getParameter("width"));
	 length = Integer.parseInt(request.getParameter("length"));
	Rectangle rectangle = new Rectangle(width, length);
	 area = rectangle.getArea();
	 perimeter = rectangle.getPerimeter();
}


%>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Rectangle.jsp" method="post">
		Genişlik: <input type="text" name="width" ><br /> <br />
		Uzunluk: <input type="text" name="length" ><br /> <br />
		<input type="submit" value="Hesapla" name="calculate"><br />
		<br />
	Alan =<%=area%>
	<br /> 
	Çevre = <%=perimeter%>
</form>
</body>
</html>
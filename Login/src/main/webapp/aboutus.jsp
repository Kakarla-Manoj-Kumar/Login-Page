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

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
if(session.getAttribute("User")==null){
	response.sendRedirect("Login.jsp");
}

%>
<h1>About Us</h1>
<h5>Developer Name : Kakarla Manoj Kumar</h5>
<h5>Developer E-Mail : manojkumark8481@gmail.com </h5>
<a href= " https://github.com/Kakarla-Manoj-Kumar">GitHub Profile</a>
</body>
</html>
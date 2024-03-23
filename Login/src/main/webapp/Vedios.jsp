<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vedios</h1>
<%

if(session.getAttribute("User")==null){
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma","no-chache");
	response.setHeader("Expires","0");
	response.sendRedirect("Login.jsp");
}
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/4XTsAAHW_Tc?si=oBdHomyL0n3JwiBT" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>
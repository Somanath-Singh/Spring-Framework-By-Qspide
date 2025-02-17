<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: red; text-align: center;">Register Successfully</h1>

 <h2>Welcome,<%= session.getAttribute("session").toString() %></h2>
    <a href="<%= session.removeAttribute("session")%>">Logout</a>

</body>
</html>
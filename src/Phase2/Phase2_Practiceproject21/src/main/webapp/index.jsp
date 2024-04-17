<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Test JSP Implicit Objects</title>
</head>
<body>
    <h1>Test JSP Implicit Objects</h1>
    <p>Current Date and Time: <%= new java.util.Date() %></p>
    <p>Client's IP Address: <%= request.getRemoteAddr() %></p>
    <p>User Agent: <%= request.getHeader("User-Agent") %></p>
</body>
</html>
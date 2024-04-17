<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Error Handling</title>
</head>
<body>
    <h1>Error Handling</h1>
    <p>Status Code: <%= statusCode %></p>
    <p>Exception Type: <%= exception != null ? exception.getClass().getName() : "N/A" %></p>
    <p>Message: <%= exception != null ? exception.getMessage() : "N/A" %></p>
</body>
</html>
    
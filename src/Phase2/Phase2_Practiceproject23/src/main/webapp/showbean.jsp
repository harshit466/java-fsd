<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Show Bean Example</title>
</head>
<body>
    <h1>Show Bean Example</h1>
    <jsp:useBean id="product" class="com.example.ProductBean" scope="session"/>
    <jsp:setProperty name="product" property="name" value="Laptop"/>
    <jsp:setProperty name="product" property="price" value="1000"/>
    <p>Product Name: <jsp:getProperty name="product" property="name"/></p>
    <p>Product Price: $<jsp:getProperty name="product" property="price"/></p>
</body>
</html>

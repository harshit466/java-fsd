<!-- login.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if ("your_username".equals(username) && "your_password".equals(password)) {
        // Set session attribute if login is successful
        session.setAttribute("username", username);
        response.sendRedirect("dashboard.jsp");
    } else {
        // Redirect back to index.jsp if login fails
        response.sendRedirect("index.jsp");
    }
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.entities.Booking" %>
<%@ page import="com.entities.RegisterServlet" %>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmation</title>
</head>
<body>
    <h2>Booking Confirmation</h2>
   
    <% 
    Booking booking = (Booking) session.getAttribute("booking");
    %>
    
    <%-- Display the booking details --%>
    <p>Thank you for booking!</p>
    <p>Flight ID: <%= booking.getFlightId() %></p>
    <p>Full Name: <%= booking.getFullName() %></p>
    <p>Email: <%= booking.getEmail() %></p>
    <p>Phone Number: <%= booking.getPhoneNumber() %></p>
</body>
</html>
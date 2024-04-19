<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.entities.Booking" %>
<%@ page import="com.entities.RegisterServlet" %>
<%@ page import="com.entities.SearchFlightServlet" %>
<%@ page import="com.entities.Flight" %>
<%@ page import="com.entities.FlightService" %>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Confirmation</title>
</head>
<body>
    <h2>Payment Confirmation</h2>
   
    <% 
    Booking booking = (Booking) session.getAttribute("booking");
    String str1 = (String)session.getAttribute("s");
    String str2 = (String)session.getAttribute("d");
    String str3 = (String)session.getAttribute("date");
    Integer str4 =(Integer)session.getAttribute("n");
    Double str5=(Double)session.getAttribute("p");
    Double t=str4*str5;               
    %>
    
    <%-- Display the booking details --%>
    <p>Confirm your Payment</p>
    <p>Flight ID: <%= booking.getFlightId() %></p>
    <p>Flight Source: <%= str1 %></p>
    <p>Flight Destination: <%= str2 %></p>
    <p>Date: <%= str3 %></p>
    <p>Persons: <%= str4 %></p>
    <p>Price per person: <%= str5 %></p>
    <p>Total Price: <%= t %></p>
    <a href="confirmation.jsp">Confirm Payment</a>
    
</body>
</html>
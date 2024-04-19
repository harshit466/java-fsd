<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Flight Booking Form</title>
</head>
<body>
    <h2>Flight Booking</h2>
    <form action="RegisterServlet" method="post">
        <label for="flightId">Flight ID:</label>
        <input type="text" id="flightId" name="flightId" value="<%= request.getParameter("flightId") %>"><br><br>
        
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName"><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email"><br><br>
        
        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>

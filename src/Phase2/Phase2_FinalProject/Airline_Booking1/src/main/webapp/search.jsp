<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Flights</title>
</head>
<body>
    <h1>Search Flights</h1>
    <form action="SearchFlightServlet" method="post">
        <label for="source">Source:</label>
        <input type="text" id="source" name="source" required><br><br>
        
        <label for="destination">Destination:</label>
        <input type="text" id="destination" name="destination" required><br><br>
        
        <label for="dateOfTravel">Date of Travel:</label>
        <input type="date" id="dateOfTravel" name="dateOfTravel" required><br><br>
        
        <label for="NumberofPersons">Number of Persons:</label>
        <input type="text" id="text" name="NumberofPersons" required><br><br>
        
        <input type="submit" value="Search Flights">
    </form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.entities.Flight" %>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
    <title>Available Flights</title>
</head>
<body>
    <h1>Available Flights</h1>
    <table border="1">
        <tr>
            <th>Flight ID</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Arrival Date</th>
            <th>Price</th>
            <th>Select</th> <!-- New column for select button -->
        </tr>
        <% 
            Enumeration<String> attributeNames = request.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String attributeName = attributeNames.nextElement();
                if (attributeName.startsWith("flight")) {
                    Flight flight = (Flight) request.getAttribute(attributeName);
        %>
            <tr>
                <td><%= flight.getId() %></td>
                <td><%= flight.getSource() %></td>
                <td><%= flight.getDestination() %></td>
                <td><%= flight.getDate() %></td>
                <td><%= flight.getPrice() %></td>
                <td><form action="FlightBooking.jsp" method="post">
                        <input type="hidden" name="flightId" value="<%= flight.getId() %>">
                        <input type="submit" value="Select">
                    </form>
                </td>
                
            </tr>
            
        <% 
                }
            }
        %>
    </table>
    <% if (!request.getAttributeNames().hasMoreElements()) { %>
        <p>No flights available for the selected criteria.</p>
    <% } %>
    
</body>
</html>

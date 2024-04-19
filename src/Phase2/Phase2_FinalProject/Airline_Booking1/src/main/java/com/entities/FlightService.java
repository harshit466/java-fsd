package com.entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import com.servlets.dbcon.DbConnection;
import java.sql.*;
import java.sql.Date;

public class FlightService {
    public static List<Flight> searchFlights(String source, String destination, String dateOfTravel) {
        List<Flight> flights = new ArrayList<>();

        try {
            // Connect to database
        	Connection conn = DbConnection.getConnection();
      
            // Prepare and execute query
            String query = "SELECT * FROM Flight WHERE source = ? AND destination = ?AND date = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, source);
            statement.setString(2, destination);
            statement.setDate(3, Date.valueOf(dateOfTravel));
            ResultSet resultSet = statement.executeQuery();

            // Process the results
            while (resultSet.next()) {
                Flight flight = new Flight();
                flight.setId(resultSet.getInt("id"));
                flight.setSource(resultSet.getString("source"));
                flight.setDestination(resultSet.getString("destination"));
                flight.setDate(resultSet.getDate("date"));
                flight.setPrice(resultSet.getDouble("price"));
                flights.add(flight);
            }

            // Close connections
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flights;
    }
}
package com.entities;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import com.servlets.dbcon.DbConnection;
import java.sql.*;
import java.sql.Date;

public class BookingService {
    public static void bookFlight(Booking booking) {
        try {
            // Connect to database
            // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        	Connection conn = DbConnection.getConnection();
            // Prepare and execute query
            String query = "INSERT INTO Booking (flight_id, fullName, email, phoneNumber) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, booking.getFlightId());
            statement.setString(2, booking.getFullName());
            statement.setString(3, booking.getEmail());
            statement.setString(4, booking.getPhoneNumber());
            statement.executeUpdate();

            // Close connections
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
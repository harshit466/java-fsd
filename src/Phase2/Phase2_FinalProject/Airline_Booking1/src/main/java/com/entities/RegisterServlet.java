package com.entities;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int flightId = Integer.parseInt(request.getParameter("flightId"));
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");

        // Create a Booking object
        Booking booking = new Booking();
        booking.setFlightId(flightId);
        booking.setFullName(fullName);
        booking.setEmail(email);
        booking.setPhoneNumber(phoneNumber);

        // Call a service or DAO to save the booking details
        BookingService.bookFlight(booking);

        // Set booking in request attribute
       // request.setAttribute("booking", booking);
        HttpSession session = request.getSession();
        session.setAttribute("booking", booking);

        // Forward the request to the confirmation page
        RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
        rd.forward(request, response);
    }
}
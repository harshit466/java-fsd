package com.entities;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class SearchFlightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String dateOfTravel = request.getParameter("dateOfTravel");
        String nu = request.getParameter("NumberofPersons");
        int num;
        num=Integer.parseInt(nu);
        HttpSession session = request.getSession();
        session.setAttribute("s", source);
        session.setAttribute("d", destination);
        session.setAttribute("date", dateOfTravel);
        session.setAttribute("n",num);
        
        // Call a service to retrieve available flights based on the provided details
        List<Flight> flights = FlightService.searchFlights(source, destination, dateOfTravel);
              
        if(!flights.isEmpty()) 
        {
        Double price;
        price= flights.get(0).getPrice();
        session.setAttribute("p",price);
        }
        
        // Set flights in request attribute
        for (Flight flight : flights) {
            request.setAttribute("flight" + flight.getId(), flight);
        }

        // Forward the request to the flights display page
        RequestDispatcher rd = request.getRequestDispatcher("flights.jsp");
        rd.forward(request, response);
        
    }
}
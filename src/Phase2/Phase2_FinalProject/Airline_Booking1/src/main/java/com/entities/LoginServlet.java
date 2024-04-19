package com.entities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        if (username.equals("Harshit")&&password.equals("Harshit123@")) {

            // Redirect to the dashboard page
            response.sendRedirect("search.jsp");
        } else {
            // If invalid, redirect back to the login page with an error message
            response.sendRedirect("invalid.jsp");
        }
    }

   
}
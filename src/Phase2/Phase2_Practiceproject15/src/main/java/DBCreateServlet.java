import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBCreateServlet")
public class DBCreateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dbname = request.getParameter("dbname");

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            // Create the database
            stmt.executeUpdate("CREATE DATABASE " + dbname);
            response.getWriter().println("Database created successfully: " + dbname);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

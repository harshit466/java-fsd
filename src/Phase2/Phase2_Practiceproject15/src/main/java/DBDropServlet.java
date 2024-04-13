import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBDropServlet")
public class DBDropServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dbname = request.getParameter("dbname");

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            // Drop the database
            stmt.executeUpdate("DROP DATABASE " + dbname);
            response.getWriter().println("Database dropped successfully: " + dbname);

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

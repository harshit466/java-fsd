import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoJDBC")
public class DemoJDBC extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Initializing JDBC</h2>");

        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            out.println("<p>JDBC initialized successfully</p>");
        } catch (SQLException e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    out.println("<p>JDBC connection closed</p>");
                } catch (SQLException e) {
                    out.println("<p>Error closing JDBC connection: " + e.getMessage() + "</p>");
                }
            }
        }

        out.println("</body></html>");
    }
}

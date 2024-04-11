import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");

        if (username != null) {
            response.setContentType("text/html");
            response.getWriter().println("<html><head><title>Dashboard</title></head><body>");
            response.getWriter().println("<h1>Welcome, " + username + "!</h1>");
            response.getWriter().println("<a href='LogoutServlet'>Logout</a>");
            response.getWriter().println("</body></html>");
        } else {
            response.getWriter().println("Session not found.");
        }
    }
}

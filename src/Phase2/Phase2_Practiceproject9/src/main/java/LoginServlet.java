import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check username and password (in a real scenario, this should be validated against a database)
        boolean isValidUser = username.equals("admin") && password.equals("password");

        if (isValidUser) {
            // Create a new session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            response.getWriter().println("Login successful with HTTPSession.");
        } else {
            response.getWriter().println("Invalid username or password.");
        }
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check username and password (in a real scenario, this should be validated against a database)
        boolean isValidUser = username.equals("admin") && password.equals("password");

        if (isValidUser) {
            // Create a session cookie
            Cookie cookie = new Cookie("user", username);
            cookie.setMaxAge(30 * 60); // Cookie expires in 30 minutes
            response.addCookie(cookie);

            response.getWriter().println("Login successful with cookie.");
        } else {
            response.getWriter().println("Invalid username or password.");
        }
    }
}

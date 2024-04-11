import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hiddenField = request.getParameter("hiddenField");

        // Check username and password (in a real scenario, this should be validated against a database)
        boolean isValidUser = username.equals("admin") && password.equals("password");

        if (isValidUser && hiddenField.equals("hiddenValue")) {
            // Here, you can handle the session using a session cookie or other session management techniques
            response.getWriter().println("Login successful with hidden form field.");
        } else {
            response.getWriter().println("Invalid username or password.");
        }
    }
}

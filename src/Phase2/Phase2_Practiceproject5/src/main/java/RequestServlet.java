import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestType = request.getParameter("type");

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Request Handling</title></head><body>");
        response.getWriter().println("<h1>Request Type: " + requestType + "</h1>");
        response.getWriter().println("</body></html>");
    }
}

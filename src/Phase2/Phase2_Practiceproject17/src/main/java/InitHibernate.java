import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitHibernate extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HibernateUtil.getSessionFactory(); // Initialize Hibernate
            response.getWriter().println("Hibernate initialized successfully.");
        } catch (Exception e) {
            response.getWriter().println("Error initializing Hibernate: " + e.getMessage());
        } finally {
            HibernateUtil.shutdown(); // Close Hibernate
        }
    }
}

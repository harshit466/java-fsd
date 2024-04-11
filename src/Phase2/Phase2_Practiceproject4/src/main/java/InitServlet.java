import javax.servlet.*;
import java.io.*;

public class InitServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet initialization started");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Servlet service method called");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destruction started");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO products (id, name, price) VALUES (?, ?, ?)");
            pstmt.setString(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, price);
            pstmt.executeUpdate();
            conn.close();

            PrintWriter out = response.getWriter();
            out.println("Product added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

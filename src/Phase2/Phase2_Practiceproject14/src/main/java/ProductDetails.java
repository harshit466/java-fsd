import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
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
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            Connection conn = DBConnection.getConnection();
            CallableStatement cstmt = conn.prepareCall("{call add_product(?, ?, ?)}");
            cstmt.setInt(1, id);
            cstmt.setString(2, name);
            cstmt.setDouble(3, price);
            cstmt.execute();
            conn.close();

            response.getWriter().println("Product added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package servlet;

import add_delete_waiter.AddWaiter;
import add_delete_waiter.DeleteWaiter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "/deleteWaiterServlet")
public class DeleteWaiterServlet extends HttpServlet {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private DeleteWaiter deleteWaiter = new DeleteWaiter();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");

        String first_name = request.getParameter("name_delete");
        String last_name = request.getParameter("second_name_delete");


        deleteWaiter.delete(con, first_name, last_name);
        response.sendRedirect("admin_staff.jsp");


    }
}

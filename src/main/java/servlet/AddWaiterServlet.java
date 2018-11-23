package servlet;

//import add_delete_waiter.AddWaiter;

import add_delete_waiter.AddWaiter;
import db.C3P0DataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "/addWaiter")
public class AddWaiterServlet extends HttpServlet {
    private AddWaiter addWaiter = new AddWaiter();
    private Connection con;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        con = C3P0DataSource.getInstance().getConnection();
        response.setContentType("text/html");

        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String age1 = request.getParameter("age");
        Integer age = Integer.parseInt(age1);
        String dateString = request.getParameter("employment_date");
        String position = request.getParameter("position");

        addWaiter.add(con, first_name, last_name, age, dateString, position);
        response.sendRedirect("admin_staff.jsp");
    }
}

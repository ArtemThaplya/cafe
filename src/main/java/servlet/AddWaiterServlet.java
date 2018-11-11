package servlet;

import add_delete_waiter.AddWaiter;
import add_delete_waiter.Waiter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "/addWaiter")
public class AddWaiterServlet extends HttpServlet {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private static Statement stmt;
    private static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");
        String second_name = request.getParameter("second_name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String dateString =  request.getParameter("employment_date");
        Date employment_date = null;
        try {
            employment_date = ft.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String position = request.getParameter("position");
        AddWaiter addWaiter = new AddWaiter();
        addWaiter.add(stmt, name, second_name, age, employment_date, position);

    }
}

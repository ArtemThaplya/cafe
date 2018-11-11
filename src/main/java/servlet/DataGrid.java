package servlet;

import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "DataGrid", urlPatterns = "/servlet/DataGrid")
public class DataGrid extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("application/json");
//        DisplayingTable displayingTable = new DisplayingTable();
//        PrintWriter writer = response.getWriter();
//        writer.println(displayingTable.printTable());






//        try {
//            out.print(printTable().toString());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }


    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private static Statement stmt;

//    public JSONObject printTable() throws ClassNotFoundException, SQLException {
//        String str = "";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        con = DriverManager.getConnection(url, user, password);
//        stmt = con.createStatement();
//        PreparedStatement prst = con.prepareStatement("SELECT id_waiter, first_name, last_name, age, employment_date, position FROM staff");
//        ResultSet rs = prst.executeQuery();
//        JSONObject json = new JSONObject();
//        while (rs.next()) {
//            json.put("id_waiter",rs.getInt(1));
//            json.put("first_name",rs.getString(2));
//            json.put("last_name",rs.getInt(3));
//            json.put("age",rs.getInt(4));
//            json.put("employment_date",rs.getInt(5));
//            json.put("position",rs.getInt(6));
//        }
//            return json;
//    }
}
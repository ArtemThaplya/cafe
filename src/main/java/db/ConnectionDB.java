package db;

import javax.xml.transform.Result;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private PersonnelManagement personnelManagement = new PersonnelManagement();
    private static Connection con;
    private static Statement stmt;
//    private static ResultSet rs;
    private static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    public void getConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
//            rs = personnelManagement.add(rs, stmt, "Ddfgs","Svd",26, ft.parse("2016-04-23"));
//            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
//                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



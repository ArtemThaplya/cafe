package add_delete_waiter.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayingTable {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private static Statement stmt;

    void printTable(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();



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

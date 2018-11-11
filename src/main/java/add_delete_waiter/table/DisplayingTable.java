package add_delete_waiter.table;

import java.sql.*;

public class DisplayingTable {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private static Statement stmt;

    public String printTable() {
        String str = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            PreparedStatement prst = con.prepareStatement("SELECT id_waiter, first_name, last_name, age, employment_date, position FROM staff LIMIT 6");
            ResultSet rs = prst.executeQuery();
            str = "{\"total\":6,\"rows\":[";

            while (rs.next()) {
                str += "{";
                str += "\"id_waiter\":\"" + rs.getInt(1) + "\",";
                str += "\"first_name\":\"" + rs.getString(2) + "\",";
                str += "\"last_name\":\"" + rs.getString(3) + "\",";
                str += "\"age\":\"" + rs.getInt(4) + "\",";
                str += "\"employment_date\":\"" + rs.getDate(5) + "\",";
                str += "\"position\":\"" + rs.getString(6) + "\"";
                str += "}";
                if (!rs.isLast()) {
                    str += ",";
                }
            }
            str += "]}";

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//        } finally {
////            try {
//////                con.close();
//////                stmt.close();
//////                rs.close();
////            }
//        }
        }
            return str;
    }
}

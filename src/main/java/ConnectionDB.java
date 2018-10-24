import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConnectionDB {
    private static final String url = "jdbc:h2:file:C:\\Users\\Артемка\\IdeaProjects\\cafe\\src";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
    private PersonnelManagement personnelManagement = new PersonnelManagement();

    void getConnectionDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            personnelManagement.add(rs, stmt, "Ddfgs","Svd",26, ft.parse("2016-04-23"));
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

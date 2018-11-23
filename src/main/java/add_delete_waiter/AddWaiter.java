package add_delete_waiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddWaiter implements AddW {
    private static PreparedStatement stmt;

    public void add(Connection con, String first_name, String last_name, int age, String dateString, String position) {
        try {
            stmt = con.prepareStatement("INSERT INTO staff (first_name, last_name, age, employment_date, position) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, first_name);
            stmt.setString(2, last_name);
            stmt.setInt(3, age);
            stmt.setDate(4, java.sql.Date.valueOf(dateString));
            stmt.setString(5, position);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

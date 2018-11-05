package add_delete_waiter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AddWaiter implements AddW {
    public void add(Statement stmt, String firstName, String lastName, int age, Date employmentDate) {
        try {
            stmt.executeUpdate("INSERT INTO staff (first_name, last_name, age, employment_date) VALUES ("+firstName+", "+ lastName +", "+ age +", "+ employmentDate +")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

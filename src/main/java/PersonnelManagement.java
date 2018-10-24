import add_delete_waiter.AddWaiter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class PersonnelManagement implements AddWaiter {

    public void add(ResultSet rs, Statement stmt, String firstName, String lastName, int age, Date employmentDate) {
        try {
            rs = stmt.executeQuery("SELECT * FROM waiter");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package add_delete_waiter;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteWaiter implements DeleteW {
    public void delete(Statement stmt, String firstName, String lastName) {
        try {
            stmt.executeUpdate("DELETE FROM staff WHERE (first_name = "+ firstName +") AND (last_name = "+ lastName +")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

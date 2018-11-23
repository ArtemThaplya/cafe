package add_delete_waiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteWaiter implements DeleteW {
    private static PreparedStatement stmt;

    public void delete(Connection con, String first_name, String last_name) {
        try {
            stmt = con.prepareStatement("DELETE FROM staff WHERE  (first_name = ?) AND (last_name = ?)");
            stmt.setString(1, first_name);
            stmt.setString(2, last_name);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//first_name = "+ first_name +") AND (last_name = "+ last_name +")"
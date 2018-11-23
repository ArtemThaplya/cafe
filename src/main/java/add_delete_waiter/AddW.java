package add_delete_waiter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public interface AddW {
    void add(Connection con, String name, String lastName, int age, String dateString, String position);
}

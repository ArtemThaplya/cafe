package add_delete_waiter;

import java.sql.Connection;
import java.sql.Statement;

public interface DeleteW {
    void delete(Connection con, String firstName, String lastName);
}

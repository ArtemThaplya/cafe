package add_delete_waiter;

import java.sql.Statement;

public interface DeleteW {
    void delete(Statement stmt, String firstName, String lastName);
}

package add_delete_waiter;

import java.sql.Statement;

public interface DeleteWaiter {
    String delete(Statement stmt, String firstName, String lastName);
}

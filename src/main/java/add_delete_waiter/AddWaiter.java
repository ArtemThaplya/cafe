package add_delete_waiter;

import java.sql.Statement;

public interface AddWaiter {
    String  add(Statement stmt, String firstName, String lastName, int age, String employmentDate);
}

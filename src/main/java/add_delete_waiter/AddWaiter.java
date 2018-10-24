package add_delete_waiter;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public interface AddWaiter {
    void add(ResultSet rs, Statement stmt, String firstName, String lastName, int age, Date employmentDate);
}

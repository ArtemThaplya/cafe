package add_delete_waiter;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public interface AddW {
    void add(Statement stmt, String name, String lastName, int age, Date parse);
}

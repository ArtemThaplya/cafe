package db;

import add_delete_waiter.AddWaiter;
import add_delete_waiter.DeleteWaiter;

import java.sql.SQLException;
import java.sql.Statement;

public class PersonnelManagement implements AddWaiter, DeleteWaiter {

    public String  add(Statement stmt, String firstName, String lastName, int age, String employmentDate) {
        try {
            stmt.executeUpdate("INSERT INTO staff (first_name, last_name, age, employment_date) VALUES ("+firstName+", "+ lastName +", "+ age +", "+ employmentDate +")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String delete(Statement stmt, String firstName, String lastName) {
        try {
            stmt.executeUpdate("DELETE FROM staff WHERE (first_name = "+ firstName +") AND (last_name = "+ lastName +")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}

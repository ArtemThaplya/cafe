import add_delete_waiter.table.DisplayingTable;
import db.ConnectionDB;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ConnectionDB connectionDB = new ConnectionDB();
        connectionDB.getConnectionDB();

        DisplayingTable displayingTable = new DisplayingTable();
        displayingTable.printTable();

    }
}

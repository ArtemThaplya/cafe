import add_delete_waiter.table.DisplayingTable;
import db.C3P0DataSource;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        C3P0DataSource connectionDB = new C3P0DataSource();
//        connectionDB.getConnectionDB();

        DisplayingTable displayingTable = new DisplayingTable();
        displayingTable.printTable();

    }
}

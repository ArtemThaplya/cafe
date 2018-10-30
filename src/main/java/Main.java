import db.ConnectionDB;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Server tcpServer = Server.createPgServer("-baseDir .");
//        tcpServer.start();
//        //tcp://192.168.1.102:9092
//        System.out.println(tcpServer.getURL());
//        System.out.println(tcpServer.getStatus());
        ConnectionDB connectionDB = new ConnectionDB();
        connectionDB.getConnectionDB();

    }
}

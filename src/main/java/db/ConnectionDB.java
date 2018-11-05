package db;

import add_delete_waiter.WaiterConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://www.db4free.net:3306/persone";
    private static final String user = "persone_my_sql";
    private static final String password = "12345678";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    public void getConnectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            createContainer();
//            waiterContainer.addWaiter(rs, stmt, "Ddfgs","Svd",26, ft.parse("2016-04-23"));
//            System.out.println(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
//                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void createContainer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        WaiterConstructor waiterConstructor = null;
        try {
            waiterConstructor = (WaiterConstructor) applicationContext.getBean("waiterConstructor", "Ddfgs","Svd",26, ft.parse("2016-04-23"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        waiterConstructor.actionAdd();
        waiterConstructor.actionDelete();
    }
}



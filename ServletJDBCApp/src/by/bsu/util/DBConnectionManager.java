package by.bsu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Asus on 29.10.2016.
 */
public class DBConnectionManager {
    private final static String HOST_NAME = "127.0.0.1";
    private final static String DB_NAME = "taxipark";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "root";

    public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
        return getMySQLConnection(HOST_NAME, DB_NAME, USER_NAME, PASSWORD);
    }

    private static Connection getMySQLConnection(String hostName, String db_name, String userName, String password)
        throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://" + HOST_NAME + ":3306/" + DB_NAME;
        Connection conn = DriverManager.getConnection(url, userName, password);
        return conn;
    }
}

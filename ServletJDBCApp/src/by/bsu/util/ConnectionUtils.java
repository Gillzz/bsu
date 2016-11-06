package by.bsu.util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Asus on 30.10.2016.
 */
public class ConnectionUtils {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return DBConnectionManager.getMySQLConnection();
    }

    public static void close(Connection conn) {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void rollBack(Connection conn) {
        try {
            if (conn != null) {
                conn.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package by.bsu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Igor on 15.10.2016.
 */
public class ConnectionManager {
    private static Connection con;
    private static String url;

    public static Connection getConnection()
    {
        try
        {
            String url = "jdbc:mysql://localhost:8081/users";
            Class.forName("com.mysql.jdbc.driver");
            try
            {
                con = DriverManager.getConnection(url, "root", "root");

            }
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return con;
    }
}

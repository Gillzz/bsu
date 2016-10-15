package by.bsu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Igor on 15.10.2016.
 */
public class UserDAO {
    private static Connection currentCon = null;
    private static ResultSet rs = null;
    public static UserBean login(UserBean bean) {
        Statement stmt = null;
        String username = bean.getUsername();
        String password = bean.getPassword();
        String searchQuery = "select * from users where username='" + username + "' AND password='" + password + "'";
        System.out.println("Your user name is " + username);
        System.out.println("Your password is " + password);
        System.out.println("Query: " + searchQuery);

        try
        {
            currentCon = ConnectionManager.getConnection();
            stmt=currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();
            if (!more)
            {
                System.out.println("Sorry, you are not a registered user! Please sign up first");
                bean.setValid(false);
            }
            else if (more)
            {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");

                System.out.println("Welcome " + firstName);
                bean.setFirstName(firstName);
                bean.setLastName(lastName);
                bean.setValid(true);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Log In failed: Exception has occurred! " + ex);
        }
        finally
        {
            if (rs != null)	{
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                currentCon = null;
            }
        }
        return bean;
    }
}

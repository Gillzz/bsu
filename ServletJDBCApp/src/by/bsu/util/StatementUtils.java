package by.bsu.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Asus on 30.10.2016.
 */
public class StatementUtils {
    public static void close(PreparedStatement psmt) {
        try {
            if (psmt != null) {
                psmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

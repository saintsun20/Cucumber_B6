package _JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent {
    private static Connection connection;
    public static Statement statement;

    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://demo.mersys.io:33906/sakila";
        String username = "admin";
        String password = "Techno24Study.%=";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String userName = "root";
    private final static String password = "root";
    private final static String connectionURL = "jdbc:mysql://localhost:3306/mydb";

    public  Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL, userName, password);
            System.out.println("We`re connected");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection failed");
        }
        return connection;
    }
}

package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util util = new Util();
        util.getConnection();
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dmitry", "Voroncov", (byte) 40);
        userService.saveUser("Igor", "Petrov", (byte) 30);
        userService.saveUser("Vitaliy", "Kycheraviy", (byte) 50);
        userService.saveUser("Boris", "Britva", (byte) 55);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

//        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.createUsersTable();
//        userDaoJDBC.saveUser("Dmitry", "Voroncov", (byte) 40);
//        userDaoJDBC.saveUser("Igor", "Petrov", (byte) 30);
//        userDaoJDBC.saveUser("Vitaliy", "Kycheraviy", (byte) 50);
//        userDaoJDBC.saveUser("Boris", "Britva", (byte) 55);
//        userDaoJDBC.getAllUsers();
//        userDaoJDBC.cleanUsersTable();
//        userDaoJDBC.dropUsersTable();
    }
}

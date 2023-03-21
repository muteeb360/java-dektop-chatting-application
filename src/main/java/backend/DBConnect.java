/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author jhonr
 */
public class DBConnect {

    static Connection connection = null;

    public static void DBConnect() {
        String username = "muteeb";
        String password = "1234";
        String hostname="localhost";
        String instance="SNAPPY";
        String db= "user_details";
        String url ="jdbc:sqlserver://"+hostname+":1433"+";instance="+instance+";databaseName="+db;


        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
        }
    }

    public static Connection hireConn() {
        return connection;
    }
}

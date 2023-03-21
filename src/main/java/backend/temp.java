/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backend;

import java.sql.*;

/**
 *
 * @author jhonr
 */
public class temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby:Contacts;create=true;";

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("embedded database connection establised!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contacts");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("connection failed!");
            e.printStackTrace();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import static backend.CheckUser.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

/**
 *
 * @author jhonr
 */

public class AddContactsToDatabase {
    static String url = "jdbc:derby:Contacts;create=true;";
    static Connection conn=null;
    int check = 0;

    public AddContactsToDatabase(){
        check=0;
    }
    public static void makeConnection() {
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("embedded database connection establised!");
                    } catch (SQLException e) {
            System.out.println("connection failed!");
        }
    }
    public void AddContacts(String name, String phone, JLabel l) {
        check=0;
        int i= checkContact(phone,l);
        if(i!=1){
                           l.setText("");
            try {
                String stmt = "INSERT INTO contacts (name, phone) VALUES (?,?)";
                PreparedStatement stm = conn.prepareStatement(stmt);
                stm.setString(1, name);
                stm.setString(2, phone);
                stm.executeUpdate();
                System.out.println("Contact added!");
            } catch (SQLException e) {
                System.out.println("Contact Adding Failed!");
                e.printStackTrace();
            }

        }
    }
    public int checkContact(String phone,JLabel l) {
        try (
                 PreparedStatement st = conn.prepareStatement("SELECT Sr FROM contacts WHERE phone = ?")) {
            
            st.setString(1, phone);
            ResultSet result = st.executeQuery();
            result.next();
            int count = result.getInt(1);

            if (count > 0) {
                l.setText("User Already exists");
                check=1;

            }else{
                check=0;
 
            }

        } catch (SQLException e) {
        }
        return check;
    }
}

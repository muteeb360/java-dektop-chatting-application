/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Timestamp;
import backend.DBConnect;
import ui.signup;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;

/**
 *
 * @author jhonr
 */
public class BackendSignup {

    static String name;
    static boolean status = true;
    static String username;
    static String bio;
    static String email;
    static BufferedImage image;
    static Timestamp date;
    static String phone;
    static Connection conn = DBConnect.hireConn();

    public static void addUser() throws IOException {
        name = signup.name_textfield.getText();
        username = signup.username_textfield.getText();
        bio = signup.bio_textarea.getText();
        email = signup.email_textfield.getText();
        image = signup.image;
        phone = signup.phone_textfield.getText();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();

        InputStream is = new ByteArrayInputStream(baos.toByteArray());

        try ( PreparedStatement st = conn.prepareStatement("INSERT INTO details (picture, name, username, email, bio, phone, status) VALUES (?,?,?,?,?,?,?)")) {

            st.setBinaryStream(1, is);
            st.setString(2, name);
            st.setString(3, username);
            st.setString(4, email);
            st.setString(5, bio);
            st.setString(6, phone);
            st.setBoolean(7, status);

            st.executeUpdate();
            System.out.println("User added successfully!");

        } catch (SQLException e) {
     System.out.println("User adding failure!");
    }
    }
}

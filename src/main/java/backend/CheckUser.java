/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.sql.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ui.emailvalidator;
import ui.login;
import ui.pages;
import static ui.signup.email_textfield;
import static ui.signup.validator_label;
import static ui.signup.validator_label_phone;
import static ui.signup.validator_label_username;

/**
 *
 * @author jhonr
 */
public class CheckUser {

    static int state1 = 0;
    int state = 0;
    int ustate = 0;
    int pstate = 0;
    static Connection conn = DBConnect.hireConn();

    public CheckUser() {
        state = 0;
        ustate = 0;
        pstate = 0;
    }

    public void checkUser(String e, String u, String p) throws IOException {
        state = 0;
        ustate = 0;
        pstate = 0;
        int i, j, k;
        i = checkEmail(e);
        j = checkUsername(u);
        k = checkPhone(p);
        if (i == 0) {
            validator_label.setText("");
        }
        if (j == 0) {
            validator_label_username.setText("");
        }
        if (k == 0) {
            validator_label_phone.setText("");
        }
        System.out.println(" i: " + i + " j: " + j + " k: " + k);
        if (emailvalidator.isValid(email_textfield.getText()) && i == 0 && j == 0 && k == 0) {
            BackendSignup.addUser();
            otp.sendOtp(email_textfield.getText());
            pages.change("verification", "signup");
        }
    }

    public int checkEmail(String email) {
        state = 0;
        try (
                 PreparedStatement st = conn.prepareStatement("SELECT Sr FROM details WHERE email = ?")) {

            st.setString(1, email);
            ResultSet result = st.executeQuery();
            result.next();
            int count = result.getInt(1);

            if (count > 0) {
                validator_label.setText("Email already used");
                state = 1;

            } else {

                state = 0;
            }

        } catch (SQLException e) {
        }
        return state;
    }

    public int checkUsername(String username) {
        ustate = 0;
        try ( PreparedStatement st = conn.prepareStatement("SELECT Sr FROM details WHERE username = ?")) {

            st.setString(1, username);
            ResultSet result = st.executeQuery();
            result.next();
            int count = result.getInt(1);

            if (count > 0) {
                validator_label_username.setText("username already taken");
                ustate = 1;
            } else {

                ustate = 0;
            }

        } catch (SQLException e) {

        }
        return ustate;
    }

    public int checkPhone(String phone) {
        pstate = 0;
        try ( PreparedStatement st = conn.prepareStatement("SELECT Sr FROM details WHERE phone = ?")) {

            st.setString(1, phone);
            ResultSet result = st.executeQuery();
            result.next();
            int count = result.getInt(1);
            if (count > 1) {
                validator_label_phone.setText("Phone number already used");
                pstate = 1;
            } else {

                pstate = 0;
            }

        } catch (SQLException e) {

        }
        return pstate;
    }

    //dynamic polymorphism for log in page email authentication
    public static int checkEmail(String email, String who) {
        state1 = 0;
        try (
                 PreparedStatement st = conn.prepareStatement("SELECT Sr FROM details WHERE email = ?")) {

            st.setString(1, email);
            ResultSet result = st.executeQuery();
            result.next();
            int count = result.getInt(1);

            if (count > 0) {
                state1 = 1;
                login.validator_label.setText("");

            } else {
                state1 = 0;

            }

        } catch (SQLException e) {
        }
        return state1;
    }
}

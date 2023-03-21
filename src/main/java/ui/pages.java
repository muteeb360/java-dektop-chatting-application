/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.text.ParseException;
import javax.swing.*;

public final class pages extends javax.swing.JFrame {

    public static javax.swing.JPanel main_panel;
    static JFrame f;

    /**
     * Creates new form login
     * @throws java.lang.Exception
     */
    public pages(){
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents(){

        main_panel = new javax.swing.JPanel();
        f = new JFrame();

        f.setTitle("Chat Mate");
        f.setLocation(500, 100);
        f.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        f.setBackground(new java.awt.Color(57, 55, 92));
        f.setMaximumSize(new java.awt.Dimension(1000, 770));
        f.setPreferredSize(new java.awt.Dimension(1000, 770));
        f.setResizable(false);

        main_panel.setPreferredSize(new java.awt.Dimension(1000, 700));
        
        main_panel.setLayout(new java.awt.CardLayout());

      main_panel.add(login.rtn_loginpanel(), "login");

      main_panel.add(verification.rtn_verificationpanel(), "verification");

      main_panel.add(signup.rtn_signuppanel(), "signup");
 //      main_panel.add(home.rtn_basepanel(), "home");
        f.add(main_panel, java.awt.BorderLayout.CENTER);

        f.pack();
        f.setVisible(true);
    }// </editor-fold> 

    public static void change(String cardname, String asker){
        if (!"home".equals(cardname)) {
            verification.asker_page = asker;
            CardLayout cl = (CardLayout) (pages.main_panel.getLayout());
            cl.show(pages.main_panel, cardname);
        } else {
            f.setVisible(false);
            new home().setVisible(true);
        }
    }
}

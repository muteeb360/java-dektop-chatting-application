/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.Cursor;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import ui.emailvalidator;
import backend.otp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import backend.BackendSignup;
import backend.CheckUser;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static ui.login.email_textfield;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author jhonr
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author jhonr
 */
public class signup extends javax.swing.JFrame {
    //Variables declaration - do not modify                     

    private javax.swing.JLabel bio_label;
    public static javax.swing.JTextArea bio_textarea;
    private javax.swing.JButton choose_btn;
    private javax.swing.JLabel email_label;
    public static javax.swing.JTextField email_textfield;
    private javax.swing.JLabel filename_label;
    private javax.swing.JLabel profile_label;
    private javax.swing.JButton signup_btn;
    private javax.swing.JLabel signup_label;
    private static javax.swing.JPanel signup_panel;
    public static javax.swing.JLabel validator_label;
    public static JTextField username_textfield;
    private JLabel username_label;
    public static javax.swing.JLabel validator_label_username;
    private javax.swing.JLabel name_label;
    public static javax.swing.JTextField name_textfield;
    public static BufferedImage image;
    private javax.swing.JLabel phone_label;
    public static javax.swing.JFormattedTextField phone_textfield;
    public static javax.swing.JLabel validator_label_phone;

    // End of variables declaration 
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        signup_panel = new javax.swing.JPanel();
        email_label = new javax.swing.JLabel();
        signup_label = new javax.swing.JLabel();
        profile_label = new javax.swing.JLabel();
        bio_label = new javax.swing.JLabel();
        email_textfield = new javax.swing.JTextField();
        bio_textarea = new javax.swing.JTextArea();
        signup_btn = new javax.swing.JButton();
        choose_btn = new javax.swing.JButton();
        filename_label = new javax.swing.JLabel();
        validator_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        username_textfield = new javax.swing.JTextField();
        validator_label_username = new javax.swing.JLabel();
        validator_label_phone = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        MaskFormatter phoneMaskFormatter;
        try {
            phoneMaskFormatter = new MaskFormatter("+##-##########");
            phone_textfield = new JFormattedTextField(phoneMaskFormatter);
        } catch (ParseException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }

        phone_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 770));
        setMinimumSize(new java.awt.Dimension(1000, 770));
        setResizable(false);

        signup_panel.setBackground(new java.awt.Color(57, 55, 92));

        email_label.setBackground(new java.awt.Color(57, 55, 92));
        email_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("E-mail :");

        signup_label.setBackground(new java.awt.Color(57, 55, 92));
        signup_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        signup_label.setForeground(new java.awt.Color(255, 255, 255));
        signup_label.setText("Sign Up");

        profile_label.setBackground(new java.awt.Color(57, 55, 92));
        profile_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        profile_label.setForeground(new java.awt.Color(255, 255, 255));
        profile_label.setText("Profile picture :");

        bio_label.setBackground(new java.awt.Color(57, 55, 92));
        bio_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        bio_label.setForeground(new java.awt.Color(255, 255, 255));
        bio_label.setText("Bio:");

        email_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        email_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfieldActionPerformed(evt);
            }
        });

        signup_btn.setBackground(new java.awt.Color(99, 126, 107));
        signup_btn.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        signup_btn.setForeground(new java.awt.Color(255, 255, 255));
        signup_btn.setText("Sign Up");
        signup_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    signup_btnMouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        signup_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    signup_btnActionPerformed(evt);
                } catch (IOException ex) {
                    Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        choose_btn.setBackground(new java.awt.Color(204, 204, 255));
        choose_btn.setText("Choose");
        choose_btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        choose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_btnActionPerformed(evt);
            }
        });

        filename_label.setBackground(new java.awt.Color(57, 55, 92));
        filename_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        filename_label.setForeground(new java.awt.Color(255, 0, 0));

        validator_label.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        validator_label.setForeground(new java.awt.Color(255, 0, 0));

        validator_label_phone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        validator_label_phone.setForeground(new java.awt.Color(255, 0, 0));

        username_label.setBackground(new java.awt.Color(57, 55, 92));
        username_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username:");

        username_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        username_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textfieldActionPerformed(evt);
            }
        });

        validator_label_username.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        validator_label_username.setForeground(new java.awt.Color(255, 0, 0));

        name_label.setBackground(new java.awt.Color(57, 55, 92));
        name_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setText("Name:");

        name_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        name_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textfieldActionPerformed(evt);
            }
        });
        bio_textarea.setColumns(20);
        bio_textarea.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        bio_textarea.setRows(5);

        phone_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        phone_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_textfieldActionPerformed(evt);
            }
        });

        phone_label.setBackground(new java.awt.Color(57, 55, 92));
        phone_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        phone_label.setForeground(new java.awt.Color(255, 255, 255));
        phone_label.setText("Phone:");

        javax.swing.GroupLayout signup_panelLayout = new javax.swing.GroupLayout(signup_panel);
        signup_panel.setLayout(signup_panelLayout);
        signup_panelLayout.setHorizontalGroup(
                signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signup_panelLayout.createSequentialGroup()
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(signup_panelLayout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(profile_label)
                                                .addGap(67, 67, 67)
                                                .addComponent(filename_label, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(signup_panelLayout.createSequentialGroup()
                                                .addGap(400, 400, 400)
                                                .addComponent(signup_label))
                                        .addGroup(signup_panelLayout.createSequentialGroup()
                                                .addGap(430, 430, 430)
                                                .addComponent(signup_btn))
                                        .addGroup(signup_panelLayout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(choose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(signup_panelLayout.createSequentialGroup()
                                                                        .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(email_label)
                                                                                .addComponent(bio_label)
                                                                                .addComponent(username_label))
                                                                        .addGap(82, 82, 82)
                                                                        .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(email_textfield)
                                                                                .addComponent(username_textfield)
                                                                                .addComponent(bio_textarea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                                                                                .addComponent(validator_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(validator_label_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(signup_panelLayout.createSequentialGroup()
                                                                        .addComponent(name_label)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(46, 46, 46)
                                                                        .addComponent(phone_label)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(validator_label_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(133, Short.MAX_VALUE))
        );
        signup_panelLayout.setVerticalGroup(
                signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signup_panelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(signup_label)
                                .addGap(51, 51, 51)
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(profile_label)
                                        .addComponent(filename_label)
                                        .addComponent(choose_btn))
                                .addGap(36, 36, 36)
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(name_label)
                                        .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phone_label)
                                        .addComponent(phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(validator_label_phone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(username_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(username_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validator_label_username)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(email_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validator_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bio_textarea, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bio_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(signup_btn)
                                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signup_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(signup_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void email_textfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void signup_btnActionPerformed(java.awt.event.ActionEvent evt) throws IOException {

    }

    private void signup_btnMouseClicked(java.awt.event.MouseEvent evt) throws Exception {
        CheckUser cu = new CheckUser();
        cu.checkUser(email_textfield.getText(),username_textfield.getText(),phone_textfield.getText());
    }

    private void username_textfieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void name_textfieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void phone_textfieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void choose_btnActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                String fileName = selectedFile.getName();
                filename_label.setText(fileName);
                image = ImageIO.read(selectedFile);
                System.out.println("Image Loaded Successfully");
            } catch (IOException ex) {
                Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static JPanel rtn_signuppanel() {
        signup s = new signup();
        s.initComponents();
        return signup_panel;
    }

}

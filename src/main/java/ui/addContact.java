/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import backend.AddContactsToDatabase;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import static ui.signup.phone_textfield;

/**
 *
 * @author jhonr
 */
public class addContact extends javax.swing.JFrame {
        // Variables declaration - do not modify                     
        private javax.swing.JButton add_button;
    private javax.swing.JLabel add_contact_label;
    private javax.swing.JPanel add_contact_panel;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel validator_label_contact;
    private javax.swing.JFormattedTextField phone_textfield;
    private static boolean isFrameOpen = false;
    boolean view;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(boolean a) {

        add_contact_panel = new javax.swing.JPanel();
        add_contact_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        validator_label_contact = new javax.swing.JLabel();
        MaskFormatter phoneMaskFormatter;
        try {
            phoneMaskFormatter = new MaskFormatter("+##-##########");
            phone_textfield = new JFormattedTextField(phoneMaskFormatter);
        } catch (ParseException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }

        name_label = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AddContact");
        setBackground(new java.awt.Color(55, 57, 92));
        setPreferredSize(new java.awt.Dimension(843, 461));
        setResizable(false);
        setLocation(600, 300);

        add_contact_panel.setBackground(new java.awt.Color(55, 57, 92));

        add_contact_label.setBackground(new java.awt.Color(57, 55, 92));
        add_contact_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        add_contact_label.setForeground(new java.awt.Color(255, 255, 255));
        add_contact_label.setText("Add Contact");

        phone_label.setBackground(new java.awt.Color(57, 55, 92));
        phone_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        phone_label.setForeground(new java.awt.Color(255, 255, 255));
        phone_label.setText("Phone No. :");

        phone_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N

        name_label.setBackground(new java.awt.Color(57, 55, 92));
        name_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        name_label.setText("Name :");

        name_textfield.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N


        add_button.setBackground(new java.awt.Color(99, 126, 107));
        add_button.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("Add");
        add_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_buttonMouseClicked(evt);
            }
        });
        add_button.addActionListener(this::add_buttonActionPerformed);
validator_label_contact.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        validator_label_contact.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout add_contact_panelLayout = new javax.swing.GroupLayout(add_contact_panel);
        add_contact_panel.setLayout(add_contact_panelLayout);
        add_contact_panelLayout.setHorizontalGroup(
            add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_contact_panelLayout.createSequentialGroup()
                .addGroup(add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_contact_panelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(add_contact_label))
                    .addGroup(add_contact_panelLayout.createSequentialGroup()
                        .addGroup(add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_contact_panelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(add_contact_panelLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_textfield)
                            .addComponent(phone_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(validator_label_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_contact_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(add_button)
                .addGap(310, 310, 310))
        );
        add_contact_panelLayout.setVerticalGroup(
            add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_contact_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(add_contact_label)
                .addGap(61, 61, 61)
                .addGroup(add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(add_contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(validator_label_contact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(add_button)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(add_contact_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_contact_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setVisible(view);
    }// </editor-fold>  
    
    //for setting up only 1 frame instead of many as button is pressed
    public void openFrame() {
        if (!isFrameOpen) {
            view = true;
            initComponents(view);
            isFrameOpen = true;
        } else {
            view=false;
            initComponents(view);
        }
    }
    @Override
    public void dispose() {
        isFrameOpen = false;
        super.dispose();
    }
    // TODO add your handling code here:

    

    private void add_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                        
                AddContactsToDatabase addContactsToDatabase = new AddContactsToDatabase();
        addContactsToDatabase.AddContacts(name_textfield.getText(),phone_textfield.getText(),validator_label_contact);
    }                                       

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }
    // TODO add your handling code here:
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new addContact().setVisible(true);
//            }
//        });
//    }


           
}


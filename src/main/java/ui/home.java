/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ui;

import backend.AddContactsToDatabase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;


/**
 *
 * @author jhonr
 */
public class home extends javax.swing.JFrame {
    public static javax.swing.JPanel base_panel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Status;
    private javax.swing.JPanel conversationPanel;
    private javax.swing.JTextField messageTextfield;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sendBtn;
    private javax.swing.JPanel sendingPanel;
    private javax.swing.JPanel showMessagePanel;
    private javax.swing.JPanel sidePanel;
    Box vertical= Box.createVerticalBox();
    JScrollPane scrollPane;
    JScrollPane scrollPane1;
        private javax.swing.JButton add_button;
    private javax.swing.JPanel search_panel;
    
    /**
     * Creates new form home
     */
    public home() {
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
        //creating connection with contacts database
        AddContactsToDatabase.makeConnection();
        
//DEFINING ALL COMPONENTS
        base_panel = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        sendingPanel = new javax.swing.JPanel();
        messageTextfield = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();
        showMessagePanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        conversationPanel = new javax.swing.JPanel();
                search_panel = new javax.swing.JPanel();
        add_button = new javax.swing.JButton();

        //SETTING UP THE FRAME
        setTitle("Chat Mate");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setLocation(500, 100);

        //MAIN PANEL
        MainPanel.setBackground(new java.awt.Color(153, 255, 153));
        MainPanel.setPreferredSize(new java.awt.Dimension(713, 64));
        MainPanel.setLayout(new java.awt.BorderLayout());

        HeaderPanel.setBackground(new java.awt.Color(95, 92, 142));
        HeaderPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        HeaderPanel.setForeground(new java.awt.Color(204, 204, 255));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(713, 70));

//        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("1.png"))); // NOI18N

        Name.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");

        Status.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setText("Status");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderPanelLayout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainPanel.add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        sendingPanel.setBackground(new java.awt.Color(255, 255, 255));
        sendingPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendingPanel.setPreferredSize(new java.awt.Dimension(713, 71));
        sendingPanel.setLayout(null);

        messageTextfield.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        messageTextfield.setText("Message...");
        messageTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextfieldActionPerformed(evt);
            }
        });
        messageTextfield.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                messageTextfield.setText("");
            }
        });

        sendingPanel.add(messageTextfield);
        messageTextfield.setBounds(20, 12, 610, 50);

//        sendBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource(""))); // NOI18N
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        messageTextfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                enterKeyActionPerformed(e);
            }
        });
        sendingPanel.add(sendBtn);
        sendBtn.setBounds(640, 13, 70, 50);

        MainPanel.add(sendingPanel, java.awt.BorderLayout.PAGE_END);

        showMessagePanel.setBackground(new java.awt.Color(220, 220, 246));

        javax.swing.GroupLayout showMessagePanelLayout = new javax.swing.GroupLayout(showMessagePanel);
        showMessagePanel.setLayout(showMessagePanelLayout);
        showMessagePanelLayout.setHorizontalGroup(
            showMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        showMessagePanelLayout.setVerticalGroup(
            showMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        MainPanel.add(showMessagePanel, java.awt.BorderLayout.CENTER);
        //adding scroll panel for moving up and down across panel
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(showMessagePanel);
        scrollPane.setBackground(new java.awt.Color(204, 204, 255));
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        MainPanel.add(scrollPane, BorderLayout.CENTER);


        sidePanel.setBackground(new java.awt.Color(153, 255, 153));
        sidePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4));
        sidePanel.setLayout(new java.awt.BorderLayout());
        
        
        //search panel
        search_panel.setBackground(new java.awt.Color(55, 57, 92));

        searchField.setBackground(new java.awt.Color(63, 61, 98));
        searchField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        searchField.setForeground(new java.awt.Color(255, 255, 255));
        searchField.setText("Search");
        searchField.setToolTipText("");
        searchField.setMaximumSize(new java.awt.Dimension(285, 40));
        searchField.setMinimumSize(new java.awt.Dimension(285, 40));
        searchField.setPreferredSize(new java.awt.Dimension(285, 40));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                searchField.setText("");
            }
        });

        add_button.setBackground(new java.awt.Color(204, 204, 255));
        add_button.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        add_button.setText("+");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        
        //search panel adding the add button and search field into it
        javax.swing.GroupLayout search_panelLayout = new javax.swing.GroupLayout(search_panel);
        search_panel.setLayout(search_panelLayout);
        search_panelLayout.setHorizontalGroup(
            search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_panelLayout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        search_panelLayout.setVerticalGroup(
            search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        sidePanel.add(search_panel, java.awt.BorderLayout.PAGE_START);

        conversationPanel.setBackground(new java.awt.Color(57, 55, 92));
        conversationPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 4, true));
        conversationPanel.setLayout(new javax.swing.BoxLayout(conversationPanel, javax.swing.BoxLayout.LINE_AXIS));
        sidePanel.add(conversationPanel, java.awt.BorderLayout.CENTER);

        //adding scroll panel for moving up and down across panel
        scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(conversationPanel);
        scrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        scrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        sidePanel.add(scrollPane1, BorderLayout.CENTER);
        
        javax.swing.GroupLayout base_panelLayout = new javax.swing.GroupLayout(base_panel);
        base_panel.setLayout(base_panelLayout);
        base_panelLayout.setHorizontalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(base_panelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        base_panelLayout.setVerticalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        pack();
    }// </editor-fold>                        

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void messageTextfieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void enterKeyActionPerformed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            String message = messageTextfield.getText();
            if(!message.isEmpty()){
                JPanel p2= formatLabel(message);
            
                showMessagePanel.setLayout(new BorderLayout());
                JPanel right = new JPanel(new BorderLayout());
    
                right.add(p2, BorderLayout.LINE_END);
                vertical.add(right);
                vertical.add(Box.createVerticalStrut(15));
                showMessagePanel.add(vertical, BorderLayout.PAGE_START);
    
                repaint();
                invalidate();
                validate();
                messageTextfield.setText("");
                scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());
          }
          }
    }
    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) { 
        boolean messageSent=false;
        if (messageSent) {
            return;
        }
        messageSent = true;
        String message = messageTextfield.getText().trim();
        if(!message.isEmpty()){

            JPanel p2= formatLabel(message);
            
            showMessagePanel.setLayout(new BorderLayout());
            JPanel right = new JPanel(new BorderLayout());

            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));
            showMessagePanel.add(vertical, BorderLayout.PAGE_START);

            repaint();
            invalidate();
            validate();
            messageTextfield.setText("");
            scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());
        }
        messageSent = false;                                       
        
    }   
    public static JPanel formatLabel(String out) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + " </p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(133, 159, 254));
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(15, 15, 15, 50));

        panel.add(output);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));

        panel.add(time);

        return panel;
    } 
        private void add_buttonActionPerformed(ActionEvent evt) {
        addContact addFrame = new addContact();
        addFrame.openFrame();
    }
    public static JPanel rtn_basepanel(){
        home h = new home();
        h.initComponents();
        return base_panel;
    } 
}
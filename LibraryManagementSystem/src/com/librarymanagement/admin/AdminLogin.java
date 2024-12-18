package com.librarymanagement.admin;

import javax.swing.JOptionPane;
import java.sql.*;

public class AdminLogin extends javax.swing.JFrame {
    private static DBConnection db;
    protected static AdminMenu adminMenu;
    private String username;
    private String password;
    int xMouse;
    int yMouse;
    java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
    
    public AdminLogin() {
        AdminCred cred = new AdminCred();
        cred.saveCredentials();
        db = new DBConnection();
        db.connect();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userFld = new javax.swing.JTextField();
        showPass = new javax.swing.JCheckBox();
        passFld = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        moveFrame = new javax.swing.JLabel();
        emptyUser = new javax.swing.JLabel();
        emptyPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\exit.png")); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(228, 228, 228));
        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Management");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\Library-bro.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(23, 107, 135));
        kGradientPanel1.setkStartColor(new java.awt.Color(57, 167, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(228, 228, 228));
        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Library");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        backBtn.setBackground(new java.awt.Color(228, 228, 228));
        backBtn.setFont(new java.awt.Font("Times New Roman Cyr", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\left-arrow.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jPanel2.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 440));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 360, 440));

        jLabel6.setBackground(new java.awt.Color(234, 234, 234));
        jLabel6.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 107, 135));
        jLabel6.setText("Admin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(23, 107, 135));
        jLabel7.setText("Login");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\4167276_18771_1_-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(23, 107, 135));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(23, 107, 135));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        userFld.setBackground(new java.awt.Color(255, 255, 255));
        userFld.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        userFld.setForeground(new java.awt.Color(57, 57, 57));
        userFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel1.add(userFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, 30));

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 12)); // NOI18N
        showPass.setForeground(new java.awt.Color(23, 107, 135));
        showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\hide.png")); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 20, -1));

        passFld.setBackground(new java.awt.Color(255, 255, 255));
        passFld.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        passFld.setForeground(new java.awt.Color(57, 57, 57));
        passFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel1.add(passFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 210, 30));

        loginBtn.setBackground(new java.awt.Color(23, 107, 135));
        loginBtn.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 260, 40));

        moveFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moveFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveFrameMouseDragged(evt);
            }
        });
        moveFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveFrameMousePressed(evt);
            }
        });
        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 20));

        emptyUser.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 10)); // NOI18N
        emptyUser.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(emptyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 20));

        emptyPass.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 10)); // NOI18N
        emptyPass.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(emptyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\programmer.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\password.png")); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(720, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        ChooseAcc choose = new ChooseAcc();
        this.dispose();
        choose.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        username = userFld.getText();
        password = passFld.getText();

        emptyUser.setText(username.isEmpty() ? "Username field is empty" : "");
        emptyPass.setText(password.isEmpty() ? "Password field is empty" : "");

        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                login();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    public void login() throws Exception{
        Statement s = db.con.createStatement();
        String x = "SELECT * FROM AdminCredentials WHERE Username='"+ username +"'AND Password='"+ password + "'";
            
        db.rs = s.executeQuery(x);
            
        if(db.rs.next()) {
            JOptionPane.showMessageDialog(null, "Logged in successfully");
            this.dispose();
            AdminMenu admin = new AdminMenu();
            admin.setVisible(true);
            return;
        }
    }
    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        if(showPass.isSelected()) {
            passFld.setEchoChar((char)0);
            showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\show.png"));
        } else {
           passFld.setEchoChar('*');
           showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\hide.png"));
        }
    }//GEN-LAST:event_showPassMouseClicked
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel emptyPass;
    private javax.swing.JLabel emptyUser;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel moveFrame;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JTextField userFld;
    // End of variables declaration//GEN-END:variables
}

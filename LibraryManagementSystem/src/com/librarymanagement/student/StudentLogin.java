package com.librarymanagement.student;

import com.librarymanagement.admin.ChooseAcc;
import com.librarymanagement.admin.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentLogin extends javax.swing.JFrame {
    static StudentMenu student;
    static DBConnection db;
    protected String user;
    protected String pass;
    int xMouse;
    int yMouse;
    java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
    
    public StudentLogin() {
        initComponents();
        student = new StudentMenu();
        db = new DBConnection();
        db.connect();
    }
    
    public void studID() {
        try {
            db.ps = db.con.prepareStatement("SELECT ID, firstName, middleName, lastName FROM StudentInfo WHERE Username = ?");
            db.ps.setString(1, user);
            
            db.rs = db.ps.executeQuery();
            
            if(db.rs.next()) {
                student.idFld.setText(db.rs.getString(1));
                student.studentName.setText(db.rs.getString(2) + " " + db.rs.getString(3) + " " + db.rs.getString(4));
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public void showInfo() {
        try {
            db.ps = db.con.prepareStatement("SELECT firstName,middleName,lastName,gender,age,course,address,contactNum FROM StudentInfo WHERE Username = ?");
            
            db.ps.setString(1, user);
            
            db.rs = db.ps.executeQuery();
            
            if(db.rs.next()) {
                student.fNameFld.setText(db.rs.getString(1));
                student.mNameFld.setText(db.rs.getString(2));
                student.lNameFld.setText(db.rs.getString(3));
                student.ageFld.setText(db.rs.getString(5));
                student.genderFld.setText(db.rs.getString(4));
                student.courseFld.setText(db.rs.getString(6));
                student.addressFld.setText(db.rs.getString(7));
                student.conNumFld.setText(db.rs.getString(8));
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        passFld = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        userFld = new javax.swing.JTextField();
        emptyUser = new javax.swing.JLabel();
        emptyPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        forgotPass = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        moveFrame = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(23, 107, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Roboto Mono", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(27, 152, 239));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(23, 107, 135));
        jLabel5.setText("STUDENT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(23, 107, 135));
        jLabel6.setText("LOGIN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\student.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, 110));

        jLabel7.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(23, 107, 135));
        jLabel7.setText("Username");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(23, 107, 135));
        jLabel10.setText("Password");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        showPass.setForeground(new java.awt.Color(23, 107, 135));
        showPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\hide.png")); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 20, 20));

        passFld.setBackground(new java.awt.Color(255, 255, 255));
        passFld.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        passFld.setForeground(new java.awt.Color(57, 57, 57));
        passFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(passFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 210, 30));

        loginBtn.setBackground(new java.awt.Color(23, 107, 135));
        loginBtn.setFont(new java.awt.Font("Times New Roman Cyr", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(254, 254, 254));
        loginBtn.setText("LOGIN");
        loginBtn.setAlignmentY(0.0F);
        loginBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        loginBtn.setBorderPainted(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 270, 40));

        userFld.setBackground(new java.awt.Color(255, 255, 255));
        userFld.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 12)); // NOI18N
        userFld.setForeground(new java.awt.Color(57, 57, 57));
        userFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(userFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 210, 30));

        emptyUser.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 10)); // NOI18N
        emptyUser.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(emptyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 20));

        emptyPass.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 10)); // NOI18N
        emptyPass.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(emptyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\programmer.png")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 40, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\password.png")); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 40, 30));

        forgotPass.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 10)); // NOI18N
        forgotPass.setForeground(new java.awt.Color(23, 107, 135));
        forgotPass.setText("Forgot password?");
        forgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassMouseClicked(evt);
            }
        });
        jPanel2.add(forgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 390, 440));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\Library-bro.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 250, 180));

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
        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 20));

        kGradientPanel1.setkEndColor(new java.awt.Color(57, 167, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(23, 107, 135));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Library");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Management");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        backBtn.setFont(new java.awt.Font("Times New Roman Cyr", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(254, 254, 254));
        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Davie\\Documents\\NetBeansProjects\\LibraryManagementSystem\\images\\left-arrow.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(720, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        ChooseAcc choose = new ChooseAcc();
        this.dispose();
        choose.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked
    
    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        user = userFld.getText();
        pass = passFld.getText();
        
        emptyUser.setText(user.isEmpty() ? "Username field is empty" : "");
        emptyPass.setText(pass.isEmpty() ? "Password field is empty" : "");
        
        try {
            Statement s = db.con.createStatement();
            String x = "SELECT * FROM StudentInfo WHERE Username='"+ user +"'AND Password='"+ pass + "'";
            
            db.rs = s.executeQuery(x);
            
            if(db.rs.next()) {
                JOptionPane.showMessageDialog(null, "Logged in successfully");
                this.dispose();
                student.setVisible(true);
                studID();
                showInfo();
                return;
            }
            
            JOptionPane.showMessageDialog(null, "Login Failed", "Failed", JOptionPane.ERROR_MESSAGE);

        }catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        if(showPass.isSelected()) {
            passFld.setEchoChar((char)0);
            showPass.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/show.png"));

        } else {
            passFld.setEchoChar('*');
            showPass.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/hide.png"));
        }
    }//GEN-LAST:event_showPassMouseClicked

    private void forgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassMouseClicked
        StudentForgotPassword forgotPass = new StudentForgotPassword();
        forgotPass.setVisible(true);
    }//GEN-LAST:event_forgotPassMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.JLabel emptyPass;
    private javax.swing.JLabel emptyUser;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel forgotPass;
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
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel moveFrame;
    protected javax.swing.JPasswordField passFld;
    private javax.swing.JCheckBox showPass;
    protected javax.swing.JTextField userFld;
    // End of variables declaration//GEN-END:variables
}

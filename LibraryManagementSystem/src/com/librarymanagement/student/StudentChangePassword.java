package com.librarymanagement.student;

import com.librarymanagement.admin.DBConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import keeptoo.KGradientPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class StudentChangePassword extends javax.swing.JFrame {
    static Color transparent = new Color(0, 0, 0, 0);
    static DBConnection db;
    String first_name;
    
    public StudentChangePassword() {
        initComponents();
        db = new DBConnection();
        db.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new KGradientPanel();
        backBtn = new JLabel();
        jLabel4 = new JLabel();
        newPass = new JPasswordField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        confirmPass = new JPasswordField();
        confirmBtn = new JButton();
        newEmpty = new JLabel();
        confirmEmpty = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        kGradientPanel2.setkEndColor(new Color(57, 167, 255));
        kGradientPanel2.setkStartColor(new Color(23, 107, 135));
        kGradientPanel2.setLayout(new AbsoluteLayout());

        backBtn.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        backBtn.setForeground(new Color(255, 238, 217));
        backBtn.setHorizontalAlignment(SwingConstants.CENTER);
        backBtn.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/left-arrow.png")); // NOI18N
        backBtn.setText("Back to login");
        backBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        kGradientPanel2.add(backBtn, new AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new Font("Poppins ExtraBold", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 238, 217));
        jLabel4.setText("CHANGE YOUR PASSWORD");
        jLabel4.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        jLabel4.setFocusable(false);
        kGradientPanel2.add(jLabel4, new AbsoluteConstraints(70, 30, -1, 30));

        newPass.setBackground(new Color(57, 167, 255));
        newPass.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        newPass.setForeground(new Color(255, 238, 217));
        newPass.setHorizontalAlignment(JTextField.CENTER);
        newPass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        kGradientPanel2.add(newPass, new AbsoluteConstraints(40, 100, 230, 30));

        jLabel2.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(255, 238, 217));
        jLabel2.setText("Your new password");
        kGradientPanel2.add(jLabel2, new AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new Color(255, 238, 217));
        jLabel3.setText("Confirm password");
        kGradientPanel2.add(jLabel3, new AbsoluteConstraints(40, 140, -1, -1));

        confirmPass.setBackground(new Color(57, 167, 255));
        confirmPass.setFont(new Font("Poppins Medium", 0, 12)); // NOI18N
        confirmPass.setForeground(new Color(255, 238, 217));
        confirmPass.setHorizontalAlignment(JTextField.CENTER);
        confirmPass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(255, 238, 217)));
        kGradientPanel2.add(confirmPass, new AbsoluteConstraints(40, 170, 230, 30));

        confirmBtn.setBackground(new Color(255, 238, 217));
        confirmBtn.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        confirmBtn.setForeground(new Color(23, 107, 135));
        confirmBtn.setText("Change");
        confirmBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        kGradientPanel2.add(confirmBtn, new AbsoluteConstraints(100, 230, 110, -1));

        newEmpty.setFont(new Font("Ubuntu", 1, 18)); // NOI18N
        newEmpty.setForeground(new Color(255, 0, 0));
        newEmpty.setText("*");
        kGradientPanel2.add(newEmpty, new AbsoluteConstraints(260, 71, 10, 30));

        confirmEmpty.setFont(new Font("Ubuntu", 1, 18)); // NOI18N
        confirmEmpty.setForeground(new Color(255, 0, 0));
        confirmEmpty.setText("*");
        kGradientPanel2.add(confirmEmpty, new AbsoluteConstraints(260, 150, -1, -1));

        getContentPane().add(kGradientPanel2, new AbsoluteConstraints(0, 0, 320, 300));

        setSize(new Dimension(318, 294));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String new_pass = newPass.getText();
        String confirm_pass = confirmPass.getText();

        newEmpty.setText(new_pass.isEmpty() ? "*" : "");
        confirmEmpty.setText(confirm_pass.isEmpty() ? "*" : "");

        try {
            if(!new_pass.isEmpty() && !confirm_pass.isEmpty()) {
                if(new_pass.equals(confirm_pass)) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Confirm update?", "Message", JOptionPane.OK_CANCEL_OPTION);

                    if(confirm == JOptionPane.OK_OPTION) {
                        db.ps = db.con.prepareStatement("UPDATE StudentInfo SET password = ? WHERE firstName = ?");
                        db.ps.setString(1, confirm_pass);
                        db.ps.setString(2, first_name );
                        int check = db.ps.executeUpdate();

                        if(check == 1) {
                            JOptionPane.showMessageDialog(null, "Password changed, Thank you!");
                            newPass.setText("");
                            confirmPass.setText("");
                            return;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password mismatch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(Exception e) {
            System.out.println("Error : " +e.getMessage());
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void backBtnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        StudentLogin login = new StudentLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_backBtnMouseClicked

    protected void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    protected String getFirstName() {
        return this.first_name;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel backBtn;
    private JButton confirmBtn;
    private JLabel confirmEmpty;
    private JPasswordField confirmPass;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private KGradientPanel kGradientPanel2;
    private JLabel newEmpty;
    private JPasswordField newPass;
    // End of variables declaration//GEN-END:variables
}

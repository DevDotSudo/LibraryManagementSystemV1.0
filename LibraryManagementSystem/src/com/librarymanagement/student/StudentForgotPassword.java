package com.librarymanagement.student;

import com.librarymanagement.admin.DBConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import keeptoo.KGradientPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class StudentForgotPassword extends javax.swing.JFrame {
    Color transparent = new Color(0, 0, 0, 0);
    static DBConnection db;
    static StudentChangePassword change;
    int xMouse;
    int yMouse;
    
    public StudentForgotPassword() {
        initComponents();
        db = new DBConnection();
        db.connect();
        change = new StudentChangePassword();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new KGradientPanel();
        fNameFld = new JTextField();
        jLabel1 = new JLabel();
        moveFrame = new JPanel();
        dispose = new JLabel();
        mNameFld = new JTextField();
        lNameFld = new JTextField();
        yearAndSectionFld = new JTextField();
        ageFld = new JTextField();
        contactNumFld = new JTextField();
        confirmBtn = new JButton();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        emptyFname = new JLabel();
        emptyMname = new JLabel();
        emptyLname = new JLabel();
        emptyYearSection = new JLabel();
        emptyAge = new JLabel();
        emptyConNum = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        kGradientPanel1.setBackground(new Color(57, 167, 255));
        kGradientPanel1.setkEndColor(new Color(23, 107, 135));
        kGradientPanel1.setkGradientFocus(800);
        kGradientPanel1.setkStartColor(new Color(57, 167, 255));
        kGradientPanel1.setLayout(new AbsoluteLayout());

        fNameFld.setBackground(new Color(57, 167, 255));
        fNameFld.setFont(new Font("Roboto", 0, 12)); // NOI18N
        fNameFld.setForeground(new Color(255, 238, 217));
        fNameFld.setHorizontalAlignment(JTextField.CENTER);
        fNameFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(fNameFld, new AbsoluteConstraints(20, 120, 140, 40));

        jLabel1.setFont(new Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel1.setForeground(new Color(255, 238, 217));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("PLEASE CONFIRM YOUR IDENTITY");
        jLabel1.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(255, 238, 217)));
        kGradientPanel1.add(jLabel1, new AbsoluteConstraints(130, 50, -1, -1));

        moveFrame.setBackground(transparent);
        moveFrame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                moveFrameMouseDragged(evt);
            }
        });
        moveFrame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                moveFrameMousePressed(evt);
            }
        });
        moveFrame.setLayout(new AbsoluteLayout());

        dispose.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit-white.png")); // NOI18N
        dispose.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                disposeMouseClicked(evt);
            }
        });
        moveFrame.add(dispose, new AbsoluteConstraints(450, 0, -1, -1));

        kGradientPanel1.add(moveFrame, new AbsoluteConstraints(0, 0, 480, 30));

        mNameFld.setBackground(new Color(57, 167, 255));
        mNameFld.setForeground(new Color(255, 238, 217));
        mNameFld.setHorizontalAlignment(JTextField.CENTER);
        mNameFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(mNameFld, new AbsoluteConstraints(170, 120, 140, 40));

        lNameFld.setBackground(new Color(57, 167, 255));
        lNameFld.setForeground(new Color(255, 238, 217));
        lNameFld.setHorizontalAlignment(JTextField.CENTER);
        lNameFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(lNameFld, new AbsoluteConstraints(320, 120, 140, 40));

        yearAndSectionFld.setBackground(new Color(57, 167, 255));
        yearAndSectionFld.setForeground(new Color(255, 238, 217));
        yearAndSectionFld.setHorizontalAlignment(JTextField.CENTER);
        yearAndSectionFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(yearAndSectionFld, new AbsoluteConstraints(20, 200, 140, 40));

        ageFld.setBackground(new Color(57, 167, 255));
        ageFld.setForeground(new Color(255, 238, 217));
        ageFld.setHorizontalAlignment(JTextField.CENTER);
        ageFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(ageFld, new AbsoluteConstraints(170, 200, 140, 40));

        contactNumFld.setBackground(new Color(57, 167, 255));
        contactNumFld.setForeground(new Color(255, 238, 217));
        contactNumFld.setHorizontalAlignment(JTextField.CENTER);
        contactNumFld.setBorder(new LineBorder(new Color(255, 238, 217), 2, true));
        kGradientPanel1.add(contactNumFld, new AbsoluteConstraints(320, 200, 140, 40));

        confirmBtn.setBackground(new Color(255, 238, 217));
        confirmBtn.setFont(new Font("Poppins Medium", 1, 14)); // NOI18N
        confirmBtn.setForeground(new Color(57, 167, 255));
        confirmBtn.setText("Confirm");
        confirmBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        confirmBtn.setFocusable(false);
        confirmBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(confirmBtn, new AbsoluteConstraints(120, 270, 240, 40));

        jLabel2.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new Color(255, 238, 217));
        jLabel2.setText("First Name");
        kGradientPanel1.add(jLabel2, new AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new Color(255, 238, 217));
        jLabel3.setText("Middle Name");
        kGradientPanel1.add(jLabel3, new AbsoluteConstraints(170, 100, -1, -1));

        jLabel4.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new Color(255, 238, 217));
        jLabel4.setText("Last Name");
        kGradientPanel1.add(jLabel4, new AbsoluteConstraints(320, 100, -1, -1));

        jLabel5.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new Color(255, 238, 217));
        jLabel5.setText("Year & Section");
        kGradientPanel1.add(jLabel5, new AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new Color(255, 238, 217));
        jLabel6.setText("Age");
        kGradientPanel1.add(jLabel6, new AbsoluteConstraints(170, 180, -1, -1));

        jLabel7.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new Color(255, 238, 217));
        jLabel7.setText("Contact Number");
        kGradientPanel1.add(jLabel7, new AbsoluteConstraints(320, 180, -1, -1));

        emptyFname.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyFname.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyFname, new AbsoluteConstraints(150, 100, 10, 20));

        emptyMname.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyMname.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyMname, new AbsoluteConstraints(300, 100, 10, -1));

        emptyLname.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyLname.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyLname, new AbsoluteConstraints(450, 100, 10, -1));

        emptyYearSection.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyYearSection.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyYearSection, new AbsoluteConstraints(150, 180, 10, -1));

        emptyAge.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyAge.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyAge, new AbsoluteConstraints(300, 180, 10, -1));

        emptyConNum.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        emptyConNum.setForeground(new Color(255, 0, 0));
        kGradientPanel1.add(emptyConNum, new AbsoluteConstraints(450, 180, 10, -1));

        getContentPane().add(kGradientPanel1, new AbsoluteConstraints(0, 0, 480, 340));

        setSize(new Dimension(480, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void disposeMouseClicked(MouseEvent evt) {//GEN-FIRST:event_disposeMouseClicked
        this.dispose();
    }//GEN-LAST:event_disposeMouseClicked

    private void moveFrameMousePressed(MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged
    
    private void confirmBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String firstName = fNameFld.getText();
        String middleName = mNameFld.getText();
        String lastName = lNameFld.getText();
        String yearAndSection = yearAndSectionFld.getText();
        String age = ageFld.getText();
        String contactNum = contactNumFld.getText();
        int confirm;
        
        emptyFname.setText(firstName.isEmpty() ? "*" : "");
        emptyMname.setText(middleName.isEmpty() ? "*" : "");
        emptyLname.setText(lastName.isEmpty() ? "*" : "");
        emptyYearSection.setText(yearAndSection.isEmpty() ? "*" : "");
        emptyAge.setText(age.isEmpty() ? "*" : "");
        emptyConNum.setText(contactNum.isEmpty() ? "*" : "");

        try {
            if(!firstName.isEmpty() && !middleName.isEmpty() && !lastName.isEmpty() 
                    && !yearAndSection.isEmpty() && !age.isEmpty() && !contactNum.isEmpty()) {
                
                db.ps = db.con.prepareStatement("SELECT * FROM StudentInfo WHERE firstName = ?");
                db.ps.setString(1, firstName);
            
                db.rs = db.ps.executeQuery();
                
                if(db.rs.next()) {
                    String your_fName = db.rs.getString(2);
                    String your_mName = db.rs.getString(3);
                    String your_lName = db.rs.getString(4);
                    String your_yearAndSection = db.rs.getString(7);
                    String your_age = db.rs.getString(6);
                    String your_contactNum = db.rs.getString(9);
                        
                    if(firstName.equals(your_fName) && middleName.equals(your_mName) 
                            && lastName.equals(your_lName) && yearAndSection.equals(your_yearAndSection) 
                            && age.equals(your_age) && contactNum.equals(your_contactNum)) {
                        JOptionPane.showMessageDialog(null, "Confirmed identity, you can now change your password, Thank you!", "Message", JOptionPane.PLAIN_MESSAGE);
                        
                        
                        StudentChangePassword change = new StudentChangePassword();
                        change.setFirstName(firstName);
                        this.dispose();
                        change.setVisible(true);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't confirm your identity", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } 
        }
        catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_confirmBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField ageFld;
    private JButton confirmBtn;
    private JTextField contactNumFld;
    private JLabel dispose;
    private JLabel emptyAge;
    private JLabel emptyConNum;
    private JLabel emptyFname;
    private JLabel emptyLname;
    private JLabel emptyMname;
    private JLabel emptyYearSection;
    protected JTextField fNameFld;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private KGradientPanel kGradientPanel1;
    private JTextField lNameFld;
    private JTextField mNameFld;
    private JPanel moveFrame;
    private JTextField yearAndSectionFld;
    // End of variables declaration//GEN-END:variables
}

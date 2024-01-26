package com.librarymanagement.student;

import com.librarymanagement.admin.DBConnection;
import com.librarymanagement.admin.TimeDisplay;
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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Cict_Return extends javax.swing.JFrame {
    static DBConnection db;
    static TimeDisplay time;
    int xMouse;
    int yMouse;
    
    public Cict_Return() {
        initComponents();
        time = new TimeDisplay();
        db = new DBConnection();
        db.connect();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanel();
        idReturnFld = new JTextField();
        titleReturnFld = new JTextField();
        authorsReturnFld = new JTextField();
        pagesReturnFld = new JTextField();
        returnBtn = new JButton();
        fullName = new JTextField();
        moveFrame = new JPanel();
        disposeLbl = new JLabel();
        jLabel1 = new JLabel();
        course_yearFld = new JTextField();
        idNumFld = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel2.setBackground(new Color(255, 238, 217));
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new AbsoluteLayout());

        idReturnFld.setBackground(new Color(255, 238, 217));
        idReturnFld.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        idReturnFld.setHorizontalAlignment(JTextField.CENTER);
        idReturnFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book ID", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(idReturnFld, new AbsoluteConstraints(20, 70, 170, 50));

        titleReturnFld.setBackground(new Color(255, 238, 217));
        titleReturnFld.setHorizontalAlignment(JTextField.CENTER);
        titleReturnFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Title", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(titleReturnFld, new AbsoluteConstraints(210, 70, 170, 50));

        authorsReturnFld.setBackground(new Color(255, 238, 217));
        authorsReturnFld.setHorizontalAlignment(JTextField.CENTER);
        authorsReturnFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Author", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(authorsReturnFld, new AbsoluteConstraints(20, 140, 170, 50));

        pagesReturnFld.setBackground(new Color(255, 238, 217));
        pagesReturnFld.setHorizontalAlignment(JTextField.CENTER);
        pagesReturnFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Pages", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(pagesReturnFld, new AbsoluteConstraints(210, 140, 170, 50));

        returnBtn.setBackground(new Color(57, 167, 255));
        returnBtn.setFont(new Font("Poppins SemiBold", 0, 14)); // NOI18N
        returnBtn.setForeground(new Color(255, 238, 217));
        returnBtn.setText("Return Book");
        returnBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        returnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel2.add(returnBtn, new AbsoluteConstraints(100, 400, 210, 50));

        fullName.setBackground(new Color(255, 238, 217));
        fullName.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        fullName.setHorizontalAlignment(JTextField.CENTER);
        fullName.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Full Name", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(fullName, new AbsoluteConstraints(70, 210, 270, 50));

        moveFrame.setBackground(new Color(57, 167, 255));
        moveFrame.setBorder(BorderFactory.createEtchedBorder());
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

        disposeLbl.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        disposeLbl.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                disposeLblMouseClicked(evt);
            }
        });
        moveFrame.add(disposeLbl, new AbsoluteConstraints(380, 0, -1, -1));

        jPanel2.add(moveFrame, new AbsoluteConstraints(0, 0, 410, 30));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(57, 167, 255)), "Return CICT Book", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(jLabel1, new AbsoluteConstraints(10, 40, 390, 20));

        course_yearFld.setBackground(new Color(255, 238, 217));
        course_yearFld.setHorizontalAlignment(JTextField.CENTER);
        course_yearFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Course & Year", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(course_yearFld, new AbsoluteConstraints(70, 330, 270, 50));

        idNumFld.setBackground(new Color(255, 238, 217));
        idNumFld.setHorizontalAlignment(JTextField.CENTER);
        idNumFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "ID Number", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel2.add(idNumFld, new AbsoluteConstraints(70, 270, 270, 50));

        getContentPane().add(jPanel2, new AbsoluteConstraints(0, 0, 410, 480));

        setSize(new Dimension(410, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        String idR = idReturnFld.getText();
        String fullR = fullName.getText();
        String idNum = idNumFld.getText();
        String titleR = titleReturnFld.getText();
        String authorsR = authorsReturnFld.getText();
        String pagesR = pagesReturnFld.getText();
        String course_year = course_yearFld.getText();
        
        try {
            if(idR.isEmpty() || fullR.isEmpty() || idNum.isEmpty() || titleR.isEmpty() 
                    || authorsR.isEmpty()  || pagesR.isEmpty() || course_year.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all fields", "Message", JOptionPane.ERROR_MESSAGE);
            } else {
                int pagesReturn = Integer.parseInt(pagesR);
                
                db.ps = db.con.prepareStatement("DELETE FROM BorrowedBooks_Admin WHERE Book_ID = ? AND Book_Title = ? AND Book_Author = ? AND Book_Pages = ? AND Student_FullName = ? AND Student_ID = ? AND CourseAndYear = ?");
                    db.ps.setString(1, idR);
                    db.ps.setString(2, titleR);
                    db.ps.setString(3, authorsR);
                    db.ps.setInt(4, pagesReturn);
                    db.ps.setString(5, fullR);
                    db.ps.setString(6, idNum);
                    db.ps.setString(7, course_year);

                int check = db.ps.executeUpdate();

                if(check == 1){
                    db.ps = db.con.prepareStatement("INSERT INTO Cict_Books (Book_ID,Book_Title,Book_Author,Book_pages) VALUES(?,?,?,?)");
                            db.ps.setString(1, idR);
                            db.ps.setString(2, titleR);
                            db.ps.setString(3, authorsR);
                            db.ps.setInt(4, pagesReturn);

                    int check2 = db.ps.executeUpdate();

                    if(check2 == 1){
                        db.ps = db.con.prepareStatement("INSERT INTO ReturnedBooks_Admin (Book_ID,Book_Title,Book_Author,Book_Pages,Student_FullName,Student_ID,CourseAndYear, Time_Returned) VALUES(?,?,?,?,?,?,?,?)");
                                db.ps.setString(1, idR);
                                db.ps.setString(2, titleR);
                                db.ps.setString(3, authorsR);
                                db.ps.setInt(4, pagesReturn);
                                db.ps.setString(5, fullR);
                                db.ps.setString(6, idNum);
                                db.ps.setString(7, course_year);
                                db.ps.setString(8, time.getDateTime());
                        int check3 = db.ps.executeUpdate();

                        if(check3 == 1){
                            JOptionPane.showMessageDialog(null,"Book returned, Thank you!","Message",JOptionPane.PLAIN_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Please fill the fields correctly!","Message",JOptionPane.ERROR_MESSAGE);
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Please fill the fields correctly!","Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please fill the fields correctly!","Message",JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
        catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for book pages", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void disposeLblMouseClicked(MouseEvent evt) {//GEN-FIRST:event_disposeLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_disposeLblMouseClicked

    private void moveFrameMousePressed(MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField authorsReturnFld;
    private JTextField course_yearFld;
    private JLabel disposeLbl;
    private JTextField fullName;
    private JTextField idNumFld;
    private JTextField idReturnFld;
    private JLabel jLabel1;
    private JPanel jPanel2;
    private JPanel moveFrame;
    private JTextField pagesReturnFld;
    private JButton returnBtn;
    private JTextField titleReturnFld;
    // End of variables declaration//GEN-END:variables
}

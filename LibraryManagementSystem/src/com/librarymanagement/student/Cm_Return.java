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
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Cm_Return extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse;
    int yMouse;
    public Cm_Return() {
        initComponents();
        db = new DBConnection();
        db.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        moveFrame = new JPanel();
        exit = new JLabel();
        jLabel2 = new JLabel();
        bookID = new JTextField();
        fullName = new JTextField();
        bookTitle = new JTextField();
        bookAuthor = new JTextField();
        bookPages = new JTextField();
        returnBtn = new JButton();
        course_yearFld = new JTextField();
        idNumFld = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new Color(255, 238, 217));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new AbsoluteLayout());

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

        exit.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        moveFrame.add(exit, new AbsoluteConstraints(380, 0, -1, -1));

        jPanel1.add(moveFrame, new AbsoluteConstraints(0, 0, 410, 30));

        jLabel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(57, 167, 255)), "Return CM Books", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins SemiBold", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(jLabel2, new AbsoluteConstraints(10, 40, 390, -1));

        bookID.setBackground(new Color(255, 238, 217));
        bookID.setHorizontalAlignment(JTextField.CENTER);
        bookID.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book ID", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(bookID, new AbsoluteConstraints(20, 70, 170, 50));

        fullName.setBackground(new Color(255, 238, 217));
        fullName.setHorizontalAlignment(JTextField.CENTER);
        fullName.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Full Name", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(fullName, new AbsoluteConstraints(70, 210, 270, 50));

        bookTitle.setBackground(new Color(255, 238, 217));
        bookTitle.setHorizontalAlignment(JTextField.CENTER);
        bookTitle.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Title", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(bookTitle, new AbsoluteConstraints(210, 70, 170, 50));

        bookAuthor.setBackground(new Color(255, 238, 217));
        bookAuthor.setHorizontalAlignment(JTextField.CENTER);
        bookAuthor.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Author", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(bookAuthor, new AbsoluteConstraints(20, 140, 170, 50));

        bookPages.setBackground(new Color(255, 238, 217));
        bookPages.setHorizontalAlignment(JTextField.CENTER);
        bookPages.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Book Pages", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(bookPages, new AbsoluteConstraints(210, 140, 170, 50));

        returnBtn.setBackground(new Color(57, 167, 255));
        returnBtn.setFont(new Font("Poppins SemiBold", 0, 14)); // NOI18N
        returnBtn.setForeground(new Color(255, 238, 217));
        returnBtn.setText("Return Book");
        returnBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        returnBtn.setFocusable(false);
        returnBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnBtn, new AbsoluteConstraints(100, 400, 210, 50));

        course_yearFld.setBackground(new Color(255, 238, 217));
        course_yearFld.setHorizontalAlignment(JTextField.CENTER);
        course_yearFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "Course & Year", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(course_yearFld, new AbsoluteConstraints(70, 330, 270, 50));

        idNumFld.setBackground(new Color(255, 238, 217));
        idNumFld.setHorizontalAlignment(JTextField.CENTER);
        idNumFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(57, 167, 255)), "ID Number", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins Medium", 0, 14), new Color(57, 167, 255))); // NOI18N
        jPanel1.add(idNumFld, new AbsoluteConstraints(70, 270, 270, 50));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 410, 480));

        setSize(new Dimension(410, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        String idR = bookID.getText();
        String fullR = fullName.getText();
        String idNum = idNumFld.getText();
        String titleR = bookTitle.getText();
        String authorsR = bookAuthor.getText();
        String pagesR = bookPages.getText();
        String course_year = course_yearFld.getText();
        
        try {
            if(idR.isEmpty() || fullR.isEmpty() || idNum.isEmpty() || titleR.isEmpty() 
                    || authorsR.isEmpty()  || pagesR.isEmpty() || course_year.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all fields", "Message", JOptionPane.ERROR_MESSAGE);
            }
            
            else {
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
                    db.ps = db.con.prepareStatement("INSERT INTO Chm_Books (Book_ID,Book_Title,Book_Author,Book_pages) VALUES(?,?,?,?)");
                    db.ps.setString(1, idR);
                    db.ps.setString(2, titleR);
                    db.ps.setString(3, authorsR);
                    db.ps.setInt(4, pagesReturn);

                    int check2 = db.ps.executeUpdate();

                    if(check2 == 1){
                        db.ps = db.con.prepareStatement("INSERT INTO ReturnedBooks_Admin (Book_ID,Book_Title,Book_Author,Book_Pages,Student_FullName,Student_ID,CourseAndYear) VALUES(?,?,?,?,?,?,?)");
                        db.ps.setString(1, idR);
                        db.ps.setString(2, titleR);
                        db.ps.setString(3, authorsR);
                        db.ps.setInt(4, pagesReturn);
                        db.ps.setString(5, fullR);
                        db.ps.setString(6, idNum);
                        db.ps.setString(7, course_year);

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

    private void exitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

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
    private JTextField bookAuthor;
    private JTextField bookID;
    private JTextField bookPages;
    private JTextField bookTitle;
    private JTextField course_yearFld;
    private JLabel exit;
    private JTextField fullName;
    private JTextField idNumFld;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel moveFrame;
    private JButton returnBtn;
    // End of variables declaration//GEN-END:variables
}

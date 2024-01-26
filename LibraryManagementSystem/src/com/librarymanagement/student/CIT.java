package com.librarymanagement.student;

import com.librarymanagement.admin.DBConnection;
import static com.librarymanagement.student.CM.db;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CIT extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse;
    int yMouse;
    
    public CIT() {
        initComponents();
        db = new DBConnection();
        db.connect();
        showBooks();
    }
    
    public void showBooks() {
        try {
            DefaultTableModel det = (DefaultTableModel) citBooksTable.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM Cit_Books");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        citBooksTable = new javax.swing.JTable();
        searchFld = new javax.swing.JTextField();
        bookIDFld = new javax.swing.JTextField();
        fullNameFld = new javax.swing.JTextField();
        studIDNum = new javax.swing.JTextField();
        course_yearFld = new javax.swing.JTextField();
        borrowBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(57, 167, 255));
        moveFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
        moveFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit-white.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        moveFrame.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        jPanel3.setBackground(new java.awt.Color(255, 238, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "Borrow CIT Books", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 238, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 0, new java.awt.Color(57, 167, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        citBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Book Author", "Book Pages"
            }
        ));
        jScrollPane1.setViewportView(citBooksTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 550, 200));

        searchFld.setBackground(new java.awt.Color(255, 238, 217));
        searchFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255)), "Search Book", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(57, 167, 255))); // NOI18N
        searchFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel4.add(searchFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 210, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 270));

        bookIDFld.setBackground(new java.awt.Color(255, 238, 217));
        bookIDFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bookIDFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookIDFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255)), "Book ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.add(bookIDFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 50));

        fullNameFld.setBackground(new java.awt.Color(255, 238, 217));
        fullNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255)), "Your Full Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.add(fullNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 160, 50));

        studIDNum.setBackground(new java.awt.Color(255, 238, 217));
        studIDNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studIDNum.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255)), "Your ID #", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.add(studIDNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, 50));

        course_yearFld.setBackground(new java.awt.Color(255, 238, 217));
        course_yearFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        course_yearFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255)), "Course & Year", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 14), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.add(course_yearFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 130, 50));

        borrowBtn.setBackground(new java.awt.Color(57, 167, 255));
        borrowBtn.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        borrowBtn.setForeground(new java.awt.Color(255, 238, 217));
        borrowBtn.setText("Borrow Book");
        borrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnActionPerformed(evt);
            }
        });
        jPanel3.add(borrowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 170, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        setSize(new java.awt.Dimension(630, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void borrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnActionPerformed
        String book_id = bookIDFld.getText();
        String fullname = fullNameFld.getText();
        String studID = studIDNum.getText();
        String course_year = course_yearFld.getText();
        String book_title = null;
        String book_author = null;
        int book_pages = 0;
        
        try {
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM Cit_Books WHERE Book_ID = '"+book_id+"'");
            
            while(db.rs.next()) {
                book_title = db.rs.getString(2);
                book_author = db.rs.getString(3);
                book_pages = db.rs.getInt(4);
            }

            db.ps = db.con.prepareStatement("DELETE FROM Cit_Books WHERE Book_ID = ?");
            db.ps.setString(1, book_id);
            
            int check = db.ps.executeUpdate();
            
            if(check == 1) {
                db.ps = db.con.prepareStatement("INSERT INTO BorrowedBooks_Admin(Book_ID, Book_Title, Book_Author, Book_Pages, Student_FullName, Student_ID, CourseAndYear) VALUES(?,?,?,?,?,?,?)");
                db.ps.setString(1, book_id);
                db.ps.setString(2, book_title);
                db.ps.setString(3, book_author);
                db.ps.setInt(4, book_pages);
                db.ps.setString(5, fullname);
                db.ps.setString(6, studID);
                db.ps.setString(7, course_year);
                
                int check2 = db.ps.executeUpdate();
                
                                
                if(check2 == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Borrowed!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Can't borrow this book!", "Message", JOptionPane.ERROR_MESSAGE);
                }
                showBooks();
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_borrowBtnActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void searchFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) citBooksTable.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        citBooksTable.setRowSorter(sor);
          
        String model = searchFld.getText();
        if(model.length() == 0)
        {
            sor.setRowFilter(null);
        }
        else{
            sor.setRowFilter(RowFilter.regexFilter(model));
        }
    }//GEN-LAST:event_searchFldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIDFld;
    private javax.swing.JButton borrowBtn;
    private javax.swing.JTable citBooksTable;
    private javax.swing.JTextField course_yearFld;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField fullNameFld;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTextField searchFld;
    private javax.swing.JTextField studIDNum;
    // End of variables declaration//GEN-END:variables
}

package com.librarymanagement.admin;

import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class CM extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse;
    int yMouse;
    public CM() {
        db = new DBConnection();
        db.connect();
        initComponents();
        showBooks();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bookIDFld = new javax.swing.JTextField();
        bookTitleFld = new javax.swing.JTextField();
        bookAuthorFld = new javax.swing.JTextField();
        bookPagesFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        booksList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
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

        exit.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        moveFrame.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 30));

        jPanel2.setBackground(new java.awt.Color(255, 238, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "CHM BOOKS MANAGER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookIDFld.setBackground(new java.awt.Color(255, 238, 217));
        bookIDFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bookIDFld.setForeground(new java.awt.Color(11, 36, 71));
        bookIDFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookIDFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(bookIDFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 50));

        bookTitleFld.setBackground(new java.awt.Color(255, 238, 217));
        bookTitleFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bookTitleFld.setForeground(new java.awt.Color(11, 36, 71));
        bookTitleFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookTitleFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Title", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(bookTitleFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 50));

        bookAuthorFld.setBackground(new java.awt.Color(255, 238, 217));
        bookAuthorFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bookAuthorFld.setForeground(new java.awt.Color(11, 36, 71));
        bookAuthorFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookAuthorFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Author", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(bookAuthorFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 180, 50));

        bookPagesFld.setBackground(new java.awt.Color(255, 238, 217));
        bookPagesFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        bookPagesFld.setForeground(new java.awt.Color(11, 36, 71));
        bookPagesFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bookPagesFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Book Pages", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel2.add(bookPagesFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 180, 50));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 107, 135));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(23, 107, 135)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 840, 10));

        booksList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Books ID", "Books Title", "Books Author", "Books Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booksList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booksList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 820, 190));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 107, 135));
        jLabel2.setText("List of Books");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        addBtn.setBackground(new java.awt.Color(23, 107, 135));
        addBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 238, 217));
        addBtn.setText("Add Book");
        addBtn.setBorder(null);
        addBtn.setFocusable(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 170, 50));

        updateBtn.setBackground(new java.awt.Color(23, 107, 135));
        updateBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 238, 217));
        updateBtn.setText("Update Book");
        updateBtn.setBorder(null);
        updateBtn.setFocusable(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 170, 50));

        deleteBtn.setBackground(new java.awt.Color(23, 107, 135));
        deleteBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 238, 217));
        deleteBtn.setText("Delete Book");
        deleteBtn.setBorder(null);
        deleteBtn.setFocusable(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 170, 50));

        searchFld.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(23, 107, 135)));
        searchFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel2.add(searchFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 220, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(23, 107, 135));
        jLabel3.setText("Search Book :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 860, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

        setSize(new java.awt.Dimension(880, 491));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showBooks() {
        try {
            DefaultTableModel det = (DefaultTableModel) booksList.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM Cm_Books");
            
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
    
    void clearFlds() {
        bookIDFld.setText("");
        bookTitleFld.setText("");
        bookAuthorFld.setText("");
        bookPagesFld.setText("");
    }
    
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String book_id = bookIDFld.getText();
        String book_title = bookTitleFld.getText();
        String book_author = bookAuthorFld.getText();
        String book_page = bookPagesFld.getText();
        
        try {
            if(book_id.isEmpty() || book_title.isEmpty() || book_author.isEmpty() || book_page.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There is an empty fields", "Message", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else {
                int book_pages = Integer.parseInt(book_page);
                
                db.ps = db.con.prepareStatement("INSERT INTO Cm_Books (Book_ID, Book_Title, Book_Author, Book_Pages) VALUES(?,?,?,?)");
            
                db.ps.setString(1, book_id);
                db.ps.setString(2, book_title);
                db.ps.setString(3, book_author);
                db.ps.setInt(4, book_pages);

                int check = db.ps.executeUpdate();

                if(check == 1) {
                    JOptionPane.showMessageDialog(null, "Book Added!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Failed to add book!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                showBooks();
                clearFlds();
            }
        }
        catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for book pages", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) booksList.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        booksList.setRowSorter(sor);
          
        String model = searchFld.getText();
        if(model.length() == 0)
        {
            sor.setRowFilter(null);
        }
        else{
            sor.setRowFilter(RowFilter.regexFilter(model));
        }
    }//GEN-LAST:event_searchFldKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String book_id = bookIDFld.getText();
        String book_title = bookTitleFld.getText();
        String book_author = bookAuthorFld.getText();
        String book_page = bookPagesFld.getText();
        int confirm;
        
        try{
            if(book_id.isEmpty() || book_title.isEmpty() || book_author.isEmpty() || book_page.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There is an empty fields", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else {
                long delete = Long.parseLong(bookIDFld.getText());
                
                confirm = JOptionPane.showConfirmDialog(null, "Delete this book?", "Message", JOptionPane.OK_CANCEL_OPTION);

                if(confirm == JOptionPane.OK_OPTION) {
                    db.ps = db.con.prepareStatement("DELETE FROM Cm_Books WHERE Book_ID = ?");
                    db.ps.setLong(1,delete);
                }
                else {
                    clearFlds();
                    return;
                }
                    int del = db.ps.executeUpdate();
                    if(del == 1)
                {
                    JOptionPane.showMessageDialog(null, "Successfully deleted!!","Message",JOptionPane.PLAIN_MESSAGE);
                    clearFlds();

                }
                else
                {
                  JOptionPane.showMessageDialog(null,"Not deleted!!","Message",JOptionPane.ERROR_MESSAGE);
                }
                showBooks();
            }
        }
        catch(NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for book pages", "Message", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
           System.out.println("ERROR occured!!" + e.getMessage()); 
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String book_id = bookIDFld.getText();
        String book_title = bookTitleFld.getText();
        String book_author = bookAuthorFld.getText();
        String book_page = bookPagesFld.getText();
        int confirm;

        try
        {
            if(book_id.isEmpty() || book_title.isEmpty() || book_author.isEmpty() || book_page.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There is an empty fields", "Message", JOptionPane.ERROR_MESSAGE);
            }
            
            else {
                int book_pages = Integer.parseInt(book_page);
                
                confirm = JOptionPane.showConfirmDialog(null, "Update this book?", "Message", JOptionPane.OK_CANCEL_OPTION);
           
                if(confirm == JOptionPane.OK_OPTION) {
                db.ps = db.con.prepareStatement("UPDATE Cm_Books SET Book_Title = ?, Book_Author = ?, Book_Pages = ? WHERE Book_ID = ?");
                db.ps.setString(1, book_title);
                db.ps.setString(2, book_author);
                db.ps.setInt(3, book_pages);
                db.ps.setString(4, book_id);
                }
                else {
                    clearFlds();
                    return;
                }

                int update = db.ps.executeUpdate();

                if(update == 1)
                {
                    JOptionPane.showMessageDialog(null, "Book Updated!","Message",JOptionPane.PLAIN_MESSAGE);
                    clearFlds();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Failed to update book!","Message",JOptionPane.ERROR_MESSAGE);
                }
                showBooks();
            }
        }catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for Book pages", "Message", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
          System.out.println("Error : " + e.getMessage()); 
       }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void booksListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksListMouseClicked
        DefaultTableModel d = (DefaultTableModel) booksList.getModel();
        
        String id = d.getValueAt(booksList.getSelectedRow(),0).toString();
        String title = d.getValueAt(booksList.getSelectedRow(), 1).toString();
        String authors = d.getValueAt(booksList.getSelectedRow(),2).toString();
        String pages = d.getValueAt(booksList.getSelectedRow(), 3).toString();
        
        bookIDFld.setText(id);
        bookTitleFld.setText(title);
        bookAuthorFld.setText(authors);
        bookPagesFld.setText(pages);
    }//GEN-LAST:event_booksListMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bookAuthorFld;
    private javax.swing.JTextField bookIDFld;
    private javax.swing.JTextField bookPagesFld;
    private javax.swing.JTextField bookTitleFld;
    private javax.swing.JTable booksList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTextField searchFld;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

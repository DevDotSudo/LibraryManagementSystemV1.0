package com.librarymanagement.admin;

import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class DeleteStudents extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse; 
    int yMouse;
    
    public DeleteStudents() {
        initComponents();
        db = new DBConnection();
        db.connect();
        listStudents();
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
        studentTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idDelete = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        searchFld = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
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
        moveFrame.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jPanel3.setBackground(new java.awt.Color(255, 238, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "Delete Student Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 238, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(23, 107, 135)), "List of Students", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 0, 18), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Middle Name", "Last Name", "Course & Year"
            }
        ));
        jScrollPane1.setViewportView(studentTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 730, 240));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 146, 750, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/boy.png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        idDelete.setBackground(new java.awt.Color(255, 238, 217));
        idDelete.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        idDelete.setForeground(new java.awt.Color(11, 36, 71));
        idDelete.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idDelete.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 1, true), "Enter Student ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        jPanel3.add(idDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 50));

        deleteBtn.setBackground(new java.awt.Color(23, 107, 135));
        deleteBtn.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 238, 217));
        deleteBtn.setText("Delete Account");
        deleteBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.setFocusable(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 220, 50));

        searchFld.setBackground(new java.awt.Color(255, 238, 217));
        searchFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135)), "Search Student", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins Medium", 0, 12), new java.awt.Color(23, 107, 135))); // NOI18N
        searchFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel3.add(searchFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 220, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        setSize(new java.awt.Dimension(797, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listStudents() {
        try {
            DefaultTableModel det = (DefaultTableModel) studentTable.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT ID,firstName,middleName,lastName,course FROM StudentInfo");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                vec.add(db.rs.getString(5));
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
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

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try
        {
            int delete;
            String id = idDelete.getText();
            
            if(id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter student ID", "Message", JOptionPane.ERROR_MESSAGE);
            }else {
                delete = JOptionPane.showConfirmDialog(null, "Do you want to delete this account?", "Message", JOptionPane.OK_CANCEL_OPTION);
                if(delete == JOptionPane.OK_OPTION) {
                db.ps = db.con.prepareStatement("DELETE FROM StudentInfo WHERE ID = ?");
                db.ps.setString(1, id);
            
                int check = db.ps.executeUpdate();
            
                    if(check == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Deleted Successfully","Message",JOptionPane.PLAIN_MESSAGE);
                        listStudents();
                        return;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to delete this account!","Message",JOptionPane.ERROR_MESSAGE);
                    }
                    return;
                }
            }
            listStudents();
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) studentTable.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        studentTable.setRowSorter(sor);
          
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
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField idDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTextField searchFld;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}

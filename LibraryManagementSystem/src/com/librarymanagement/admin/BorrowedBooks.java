package com.librarymanagement.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class BorrowedBooks extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse;
    int yMouse;
    public BorrowedBooks() {
        initComponents();
        db = new DBConnection();
        db.connect();
    }

    public void showBooks() {
        try {
            DefaultTableModel det = (DefaultTableModel) borrowedTable.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM BorrowedBooks_Admin");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                vec.add(db.rs.getString(5));
                vec.add(db.rs.getString(6));
                vec.add(db.rs.getString(7));
                vec.add(db.rs.getString(8));
                
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        moveFrame = new JPanel();
        exit = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        borrowedTable = new JTable();
        searchFld = new JTextField();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new Color(255, 238, 217));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new AbsoluteLayout());

        moveFrame.setBackground(new Color(23, 107, 135));
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
        moveFrame.add(exit, new AbsoluteConstraints(770, 0, -1, -1));

        jPanel1.add(moveFrame, new AbsoluteConstraints(0, 0, 800, 30));

        jPanel2.setBackground(new Color(255, 238, 217));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(23, 107, 135), 2), "List of Borrowed Books", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins SemiBold", 1, 18), new Color(23, 107, 135))); // NOI18N
        jPanel2.setLayout(new AbsoluteLayout());

        borrowedTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Book Author", "Book Pages", "Student Full Name", "Student ID #", "Course & Year", "Time Borrowed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(borrowedTable);
        if (borrowedTable.getColumnModel().getColumnCount() > 0) {
            borrowedTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new AbsoluteConstraints(18, 92, 750, 310));

        searchFld.setBackground(new Color(255, 238, 217));
        searchFld.setBorder(BorderFactory.createLineBorder(new Color(23, 107, 135)));
        searchFld.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel2.add(searchFld, new AbsoluteConstraints(560, 30, 210, 40));

        jLabel1.setFont(new Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new Color(23, 107, 135));
        jLabel1.setText("Search : ");
        jPanel2.add(jLabel1, new AbsoluteConstraints(490, 40, -1, -1));

        jPanel1.add(jPanel2, new AbsoluteConstraints(10, 40, 780, 420));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 800, 470));

        setSize(new Dimension(799, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void moveFrameMouseDragged(MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse , y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void moveFrameMousePressed(MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void searchFldKeyReleased(KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) borrowedTable.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        borrowedTable.setRowSorter(sor);
          
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
    private JTable borrowedTable;
    private JLabel exit;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JPanel moveFrame;
    private JTextField searchFld;
    // End of variables declaration//GEN-END:variables
}

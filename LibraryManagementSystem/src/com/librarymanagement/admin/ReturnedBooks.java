package com.librarymanagement.admin;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ReturnedBooks extends javax.swing.JFrame {
    static DBConnection db;
    int xMouse;
    int yMouse;
    
    public ReturnedBooks() {
        initComponents();
        db = new DBConnection();
        db.connect();
        showStudents() ;
    }
    
     public void showStudents() {
        try {
            DefaultTableModel det = (DefaultTableModel) returnedTable.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM ReturnedBooks_Admin");
            
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
        returnedTable = new JTable();
        jLabel1 = new JLabel();
        searchFld = new JTextField();
        clearBtn = new JButton();

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
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(23, 107, 135), 2), "List of Returned Books", TitledBorder.CENTER, TitledBorder.TOP, new Font("Poppins SemiBold", 1, 18), new Color(23, 107, 135))); // NOI18N
        jPanel2.setLayout(new AbsoluteLayout());

        returnedTable.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Book Author", "Book Pages", "Student Full Name", "Student ID #", "Course & Year", "Time Returned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(returnedTable);
        if (returnedTable.getColumnModel().getColumnCount() > 0) {
            returnedTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new AbsoluteConstraints(20, 90, 750, 270));

        jLabel1.setFont(new Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new Color(23, 107, 135));
        jLabel1.setText("Search :");
        jPanel2.add(jLabel1, new AbsoluteConstraints(490, 40, -1, -1));

        searchFld.setBorder(BorderFactory.createLineBorder(new Color(23, 107, 135)));
        searchFld.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel2.add(searchFld, new AbsoluteConstraints(560, 30, 210, 40));

        clearBtn.setBackground(new Color(23, 107, 135));
        clearBtn.setFont(new Font("Poppins Medium", 0, 14)); // NOI18N
        clearBtn.setForeground(new Color(255, 238, 217));
        clearBtn.setText("Clear List");
        clearBtn.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new AbsoluteConstraints(640, 370, 130, 40));

        jPanel1.add(jPanel2, new AbsoluteConstraints(10, 40, 780, 420));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 800, 470));

        setSize(new Dimension(799, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void searchFldKeyReleased(KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) returnedTable.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        returnedTable.setRowSorter(sor);
          
        String model = searchFld.getText();
        if(model.length() == 0)
        {
            sor.setRowFilter(null);
        }
        else{
            sor.setRowFilter(RowFilter.regexFilter(model));
        }
    }//GEN-LAST:event_searchFldKeyReleased

    private void clearBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Clear all list?", "Message", JOptionPane.OK_CANCEL_OPTION);
            
            if(confirm == JOptionPane.OK_OPTION) {
                db.ps = db.con.prepareStatement("DELETE FROM ReturnedBooks_Admin");
                
                int check = db.ps.executeUpdate();
            
                if(check == 1) {
                    JOptionPane.showMessageDialog(null, "Cleared successfully");
                    showStudents();
                }
                return;
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_clearBtnActionPerformed

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
    private JButton clearBtn;
    private JLabel exit;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JPanel moveFrame;
    public JTable returnedTable;
    private JTextField searchFld;
    // End of variables declaration//GEN-END:variables
}

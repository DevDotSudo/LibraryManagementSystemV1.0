package com.librarymanagement.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import keeptoo.KGradientPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class SplashScreen extends javax.swing.JFrame {
    Color transparent = new Color(0, 0, 0, 0);
    static DBConnection db;
    int xMouse;
    int yMouse;
    
    public SplashScreen() {
        initComponents();
        db = new DBConnection();
        db.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new KGradientPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        loadingLbl = new JLabel();
        progressBar = new JProgressBar();
        percentageLbl = new JLabel();
        jLabel4 = new JLabel();
        moveFrame = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

        kGradientPanel1.setBackground(transparent);
        kGradientPanel1.setkEndColor(new Color(0, 153, 204));
        kGradientPanel1.setkStartColor(new Color(57, 167, 255));
        kGradientPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("Poppins Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("LIBRARY ");
        kGradientPanel1.add(jLabel1, new AbsoluteConstraints(130, 300, -1, 40));

        jLabel2.setFont(new Font("Poppins Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("MANAGEMENT");
        kGradientPanel1.add(jLabel2, new AbsoluteConstraints(250, 300, -1, 50));

        jLabel3.setFont(new Font("Poppins Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("SYSTEM");
        kGradientPanel1.add(jLabel3, new AbsoluteConstraints(540, 310, -1, -1));

        loadingLbl.setFont(new Font("Poppins Medium", 1, 18)); // NOI18N
        loadingLbl.setForeground(new Color(255, 255, 255));
        loadingLbl.setText("Loading...");
        kGradientPanel1.add(loadingLbl, new AbsoluteConstraints(30, 420, 290, -1));

        progressBar.setBackground(transparent);
        progressBar.setForeground(new Color(255, 255, 255));
        progressBar.setBorder(null);
        progressBar.setFocusable(false);
        kGradientPanel1.add(progressBar, new AbsoluteConstraints(30, 456, 710, -1));

        percentageLbl.setFont(new Font("Poppins Medium", 1, 18)); // NOI18N
        percentageLbl.setForeground(new Color(255, 255, 255));
        percentageLbl.setHorizontalAlignment(SwingConstants.RIGHT);
        percentageLbl.setText("0%");
        kGradientPanel1.add(percentageLbl, new AbsoluteConstraints(690, 420, 50, -1));

        jLabel4.setIcon(new ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/library_loading.png")); // NOI18N
        kGradientPanel1.add(jLabel4, new AbsoluteConstraints(160, 50, -1, 240));

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
        kGradientPanel1.add(moveFrame, new AbsoluteConstraints(0, 0, 770, 30));

        getContentPane().add(kGradientPanel1, new AbsoluteConstraints(0, 0, 770, 490));

        setSize(new Dimension(769, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void moveFrameMousePressed(MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    public static void main(String args[]) {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
                
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                splash.percentageLbl.setText(i + "%");
                        
                if(i == 10) {
                    splash.loadingLbl.setText("Please wait...");
                }
                else if(i == 30) {
                    splash.loadingLbl.setText("Working on it...");
                }
                else if(i == 50) {
                    splash.loadingLbl.setText("Connecting to database...");
                }
                else if(i == 70) {
                    if (db.con != null) {
                        splash.loadingLbl.setText("Connection successfull...");
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't connect to database, Exit System.", "Database Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                        break;
                    }
                }
                else if(i == 100) {
                    splash.loadingLbl.setText("Launching application...");
                    Thread.sleep(2000);
                    ChooseAcc choose = new ChooseAcc();
                    splash.dispose();
                    choose.setVisible(true);
                }
                splash.progressBar.setValue(i);
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private KGradientPanel kGradientPanel1;
    private JLabel loadingLbl;
    private JPanel moveFrame;
    private JLabel percentageLbl;
    private JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}

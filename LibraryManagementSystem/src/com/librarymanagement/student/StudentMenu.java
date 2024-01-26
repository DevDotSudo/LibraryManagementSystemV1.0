package com.librarymanagement.student;

import com.librarymanagement.admin.ChooseAcc;
import com.librarymanagement.admin.DBConnection;
import com.librarymanagement.admin.TimeDisplay;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class StudentMenu extends javax.swing.JFrame {
    static Color transparent;
    static DBConnection db;
    static TimeDisplay time;
    int xMouse;
    int yMouse;
    
    public StudentMenu() {
        transparent = new Color(0, 0, 0, 0);
        initComponents();
        time = new TimeDisplay();
        db = new DBConnection();
        db.connect();
        showTime();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idFld = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        profileBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        borrowBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        changePassBtn = new javax.swing.JButton();
        exitSystemBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        navMenu = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cictBtn = new javax.swing.JButton();
        coedBtn = new javax.swing.JButton();
        citBtn = new javax.swing.JButton();
        chmBtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fNameFld = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mNameFld = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lNameFld = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        genderFld = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        conNumFld = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addressFld = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ageFld = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        courseFld = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        borrowedTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        cictReturnBtn = new javax.swing.JButton();
        citReturnBtn = new javax.swing.JButton();
        hmReturnBtn = new javax.swing.JButton();
        coedReturnBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        oldPassFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        newPassFld = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        confirmPassFld = new javax.swing.JPasswordField();
        savePassBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navPanel.setBackground(new java.awt.Color(57, 167, 255));
        navPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        navPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        idLabel.setForeground(new java.awt.Color(254, 254, 254));
        idLabel.setText("ID : ");
        navPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 20, -1));

        idFld.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        idFld.setForeground(new java.awt.Color(255, 238, 217));
        idFld.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idFld.setToolTipText("");
        navPanel.add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 80, 20));

        studentName.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        studentName.setForeground(new java.awt.Color(254, 254, 254));
        studentName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentName.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/profile.png")); // NOI18N
        studentName.setText("Student");
        studentName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(254, 254, 254)));
        studentName.setIconTextGap(10);
        navPanel.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 60));

        profileBtn.setBackground(transparent);
        profileBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        profileBtn.setForeground(new java.awt.Color(254, 254, 254));
        profileBtn.setText("My Profile");
        profileBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        profileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profileBtn.setFocusable(false);
        profileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileBtnActionPerformed(evt);
            }
        });
        navPanel.add(profileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 40));

        homeBtn.setBackground(transparent);
        homeBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(254, 254, 254));
        homeBtn.setText("Home");
        homeBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setFocusable(false);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        navPanel.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 40));

        borrowBtn.setBackground(transparent);
        borrowBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        borrowBtn.setForeground(new java.awt.Color(254, 254, 254));
        borrowBtn.setText("Borrowed Books");
        borrowBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        borrowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrowBtn.setFocusable(false);
        borrowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBtnActionPerformed(evt);
            }
        });
        navPanel.add(borrowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 40));

        returnBtn.setBackground(transparent);
        returnBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(254, 254, 254));
        returnBtn.setText("Return Book");
        returnBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        returnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnBtn.setFocusable(false);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        navPanel.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 40));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/isufst.png")); // NOI18N
        jLabel2.setText("ISUFST");
        navPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        changePassBtn.setBackground(transparent);
        changePassBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        changePassBtn.setForeground(new java.awt.Color(254, 254, 254));
        changePassBtn.setText("Change Password");
        changePassBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        changePassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePassBtn.setFocusable(false);
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt);
            }
        });
        navPanel.add(changePassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, 40));

        exitSystemBtn.setBackground(transparent);
        exitSystemBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        exitSystemBtn.setForeground(new java.awt.Color(254, 254, 254));
        exitSystemBtn.setText("Logout Account");
        exitSystemBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        exitSystemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitSystemBtn.setFocusable(false);
        exitSystemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitSystemBtnActionPerformed(evt);
            }
        });
        navPanel.add(exitSystemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 220, 40));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Library Management");
        navPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 130, -1));

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 238, 217));
        jLabel15.setText("Developed by: Jefferson Arabit");
        navPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 20));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 238, 217));
        jLabel17.setText("& Eric Dave Cala-or BSIT 2-E");
        navPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, -1));

        getContentPane().add(navPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(57, 167, 255));
        moveFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        moveFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        exitBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/exit.png")); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        moveFrame.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        timeLbl.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(255, 238, 217));
        moveFrame.add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 120, 30));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 880, 30));

        navMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 238, 217));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 238, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "Home - Choose Your Department", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cictBtn.setBackground(new java.awt.Color(23, 107, 135));
        cictBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/security.png")); // NOI18N
        cictBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cictBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cictBtn.setFocusable(false);
        cictBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cictBtnActionPerformed(evt);
            }
        });
        jPanel3.add(cictBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 110));

        coedBtn.setBackground(new java.awt.Color(23, 107, 135));
        coedBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/presentation.png")); // NOI18N
        coedBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        coedBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coedBtn.setFocusable(false);
        coedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coedBtnActionPerformed(evt);
            }
        });
        jPanel3.add(coedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 170, 110));

        citBtn.setBackground(new java.awt.Color(23, 107, 135));
        citBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/laser-cutting-machine.png")); // NOI18N
        citBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        citBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        citBtn.setFocusable(false);
        citBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citBtnActionPerformed(evt);
            }
        });
        jPanel3.add(citBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 100));

        chmBtn.setBackground(new java.awt.Color(23, 107, 135));
        chmBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/managers.png")); // NOI18N
        chmBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chmBtn.setFocusable(false);
        chmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chmBtnActionPerformed(evt);
            }
        });
        jPanel3.add(chmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 170, 100));

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(57, 167, 255));
        jLabel20.setText("Information Technology");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 40));

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(57, 167, 255));
        jLabel21.setText("Education");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(57, 167, 255));
        jLabel22.setText("Industrial Technology");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 160, 30));

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(57, 167, 255));
        jLabel23.setText("Hotel Management");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 580, 400));

        navMenu.addTab("Home", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 238, 217));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 238, 217));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "My Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(57, 167, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setFocusable(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("First Name : ");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fNameFld.setForeground(new java.awt.Color(254, 254, 254));
        fNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(fNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, -1));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Middle Name : ");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        mNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        mNameFld.setForeground(new java.awt.Color(254, 254, 254));
        mNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(mNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 110, -1));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Last Name : ");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lNameFld.setForeground(new java.awt.Color(254, 254, 254));
        lNameFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(lNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Gender : ");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        genderFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        genderFld.setForeground(new java.awt.Color(254, 254, 254));
        genderFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 120, -1));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Contact Number : ");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        conNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        conNumFld.setForeground(new java.awt.Color(254, 254, 254));
        conNumFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(conNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, -1));

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Address :");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        addressFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addressFld.setForeground(new java.awt.Color(254, 254, 254));
        addressFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 210, -1));

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(254, 254, 254));
        jLabel16.setText("Age  : ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        ageFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ageFld.setForeground(new java.awt.Color(254, 254, 254));
        ageFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 130, -1));

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(254, 254, 254));
        jLabel18.setText("Course : ");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        courseFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        courseFld.setForeground(new java.awt.Color(254, 254, 254));
        courseFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel6.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 560, 210));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 600, 300));

        navMenu.addTab("Your Profile", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 238, 217));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 238, 217));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "Your Borrowed Books", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowedTable.setAutoCreateRowSorter(true);
        borrowedTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Book Author", "Book Pages"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(borrowedTable);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 570, 320));

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 380));

        navMenu.addTab("Borrowed Books", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 238, 217));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 238, 217));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "Return Book", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cictReturnBtn.setBackground(new java.awt.Color(57, 167, 255));
        cictReturnBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/security.png")); // NOI18N
        cictReturnBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CICT BOOKS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        cictReturnBtn.setFocusable(false);
        cictReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cictReturnBtnActionPerformed(evt);
            }
        });
        jPanel11.add(cictReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 170, 110));

        citReturnBtn.setBackground(new java.awt.Color(57, 167, 255));
        citReturnBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/laser-cutting-machine.png")); // NOI18N
        citReturnBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CIT BOOKS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        citReturnBtn.setFocusable(false);
        citReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citReturnBtnActionPerformed(evt);
            }
        });
        jPanel11.add(citReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 170, 110));

        hmReturnBtn.setBackground(new java.awt.Color(57, 167, 255));
        hmReturnBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/managers.png")); // NOI18N
        hmReturnBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CM BOOKS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        hmReturnBtn.setFocusable(false);
        hmReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmReturnBtnActionPerformed(evt);
            }
        });
        jPanel11.add(hmReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 170, 110));

        coedReturnBtn.setBackground(new java.awt.Color(57, 167, 255));
        coedReturnBtn.setForeground(new java.awt.Color(255, 238, 217));
        coedReturnBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/presentation.png")); // NOI18N
        coedReturnBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "COED BOOKS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(255, 238, 217))); // NOI18N
        coedReturnBtn.setFocusable(false);
        coedReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coedReturnBtnActionPerformed(evt);
            }
        });
        jPanel11.add(coedReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 170, 110));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 370));

        navMenu.addTab("Return Book", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 238, 217));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 238, 217));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 2), "Change Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Poppins SemiBold", 1, 18), new java.awt.Color(57, 167, 255))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(57, 167, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Enter your old password");
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        oldPassFld.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        oldPassFld.setForeground(new java.awt.Color(44, 44, 44));
        oldPassFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        oldPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassFldActionPerformed(evt);
            }
        });
        jPanel13.add(oldPassFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 30));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Enter your new password");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        newPassFld.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        newPassFld.setForeground(new java.awt.Color(44, 44, 44));
        newPassFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel13.add(newPassFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 30));

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Confirm your new password");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, -1));

        confirmPassFld.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        confirmPassFld.setForeground(new java.awt.Color(44, 44, 44));
        confirmPassFld.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        jPanel13.add(confirmPassFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 30));

        savePassBtn.setBackground(new java.awt.Color(57, 167, 255));
        savePassBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        savePassBtn.setForeground(new java.awt.Color(254, 254, 254));
        savePassBtn.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/pass2.png")); // NOI18N
        savePassBtn.setText("Save Password");
        savePassBtn.setBorder(null);
        savePassBtn.setFocusable(false);
        savePassBtn.setIconTextGap(10);
        savePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePassBtnActionPerformed(evt);
            }
        });
        jPanel13.add(savePassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon("/home/sudo_dotdev/NetBeansProjects/LibraryManagementSystem/images/pass1.png")); // NOI18N
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 310, 180));

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Let's secure your account");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 490, 270));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 560, 350));

        navMenu.addTab("Change Password", jPanel9);

        jPanel1.add(navMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 660, 500));

        setSize(new java.awt.Dimension(869, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        moveFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    private void oldPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldPassFldActionPerformed

    private void cictBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cictBtnActionPerformed
        CICT cict = new CICT();
        cict.setVisible(true);
        cict.setUserID(this.idFld.getText());
    }//GEN-LAST:event_cictBtnActionPerformed

    private void coedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coedBtnActionPerformed
        COED coed = new COED();
        coed.setVisible(true);
    }//GEN-LAST:event_coedBtnActionPerformed

    private void citBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citBtnActionPerformed
        CIT cit = new CIT();
        cit.setVisible(true);
    }//GEN-LAST:event_citBtnActionPerformed

    private void chmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chmBtnActionPerformed
        CM chm = new CM();
        chm.setVisible(true);
    }//GEN-LAST:event_chmBtnActionPerformed

    private void exitSystemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitSystemBtnActionPerformed
        if(exitSystemBtn.isSelected()) {
            exitSystemBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        exitSystemBtn.setBackground(new java.awt.Color(57, 167, 255));

        int exit = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout Account", JOptionPane.OK_CANCEL_OPTION);

        if(exit == JOptionPane.OK_OPTION) {
            ChooseAcc choose = new ChooseAcc();
            this.dispose();
            choose.setVisible(true);
        }
    }//GEN-LAST:event_exitSystemBtnActionPerformed

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassBtnActionPerformed
        if(changePassBtn.isSelected()) {
            changePassBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        changePassBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(4);
    }//GEN-LAST:event_changePassBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        if(returnBtn.isSelected()) {
            returnBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        returnBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(3);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void borrowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBtnActionPerformed
        showBooks();
        
        if(borrowBtn.isSelected()) {
            borrowBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        borrowBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(2);
    }//GEN-LAST:event_borrowBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        
        if(homeBtn.isSelected()) {
            homeBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        homeBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void profileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileBtnActionPerformed
        if(profileBtn.isSelected()) {
            profileBtn.setBackground(new java.awt.Color(135, 196, 255));
            return;
        }
        profileBtn.setBackground(new java.awt.Color(57, 167, 255));
        navMenu.setSelectedIndex(1);
    }//GEN-LAST:event_profileBtnActionPerformed

    private void cictReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cictReturnBtnActionPerformed
        Cict_Return cict = new Cict_Return();
        cict.setVisible(true);
    }//GEN-LAST:event_cictReturnBtnActionPerformed

    private void coedReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coedReturnBtnActionPerformed
        Coed_Return coed = new Coed_Return();
        coed.setVisible(true);
    }//GEN-LAST:event_coedReturnBtnActionPerformed

    private void citReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citReturnBtnActionPerformed
        Cit_Return cit = new Cit_Return();
        cit.setVisible(true);
    }//GEN-LAST:event_citReturnBtnActionPerformed

    private void hmReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmReturnBtnActionPerformed
        Cm_Return cm = new Cm_Return();
        cm.setVisible(true);
    }//GEN-LAST:event_hmReturnBtnActionPerformed

    private void savePassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePassBtnActionPerformed
        String oldPass = oldPassFld.getText();
        String newPass = newPassFld.getText();
        String confirmPass = confirmPassFld.getText();

        try {
            db.ps = db.con.prepareStatement("SELECT * FROM StudentInfo WHERE firstName = ?");
            db.ps.setString(1, this.fNameFld.getText());
            db.rs = db.ps.executeQuery();

            if (db.rs.next()) {
            String studOldPass = db.rs.getString(11);

            if (oldPass.equals(studOldPass)) {
                if (newPass.equals(confirmPass)) {
                    db.ps = db.con.prepareStatement("UPDATE StudentInfo SET password = ? WHERE firstName = ?");
                    db.ps.setString(1, newPass);
                    db.ps.setString(2, this.fNameFld.getText());

                    int check = db.ps.executeUpdate();
                    if (check == 1) {
                        JOptionPane.showMessageDialog(null, "Password Changed!");
                        oldPassFld.setText("");
                        newPassFld.setText("");
                        confirmPassFld.setText("");
                        return;
                    }
                } else {
                JOptionPane.showMessageDialog(null, "Password mismatch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
            JOptionPane.showMessageDialog(null, "Your old password is incorrect", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        oldPassFld.setText("");
        newPassFld.setText("");
        confirmPassFld.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_savePassBtnActionPerformed

    public void showBooks() {
        try {
            DefaultTableModel det = (DefaultTableModel) borrowedTable.getModel();
            
            det.setRowCount(0);
            Statement s = db.con.createStatement();
            db.rs = s.executeQuery("SELECT * FROM BorrowedBooks_Admin WHERE Student_ID = '"+this.idFld.getText()+"'");
            
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
    
    void showTime() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    timeLbl.setText(time.getTimeNow());                    
                }catch(InterruptedException e) {
                    System.out.println("Error : " + e.getMessage());
                }
            }
        });
       timer.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel addressFld;
    protected javax.swing.JLabel ageFld;
    private javax.swing.JButton borrowBtn;
    private javax.swing.JTable borrowedTable;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton chmBtn;
    private javax.swing.JButton cictBtn;
    private javax.swing.JButton cictReturnBtn;
    private javax.swing.JButton citBtn;
    private javax.swing.JButton citReturnBtn;
    private javax.swing.JButton coedBtn;
    private javax.swing.JButton coedReturnBtn;
    protected javax.swing.JLabel conNumFld;
    private javax.swing.JPasswordField confirmPassFld;
    protected javax.swing.JLabel courseFld;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton exitSystemBtn;
    protected javax.swing.JLabel fNameFld;
    protected javax.swing.JLabel genderFld;
    private javax.swing.JButton hmReturnBtn;
    private javax.swing.JButton homeBtn;
    protected javax.swing.JLabel idFld;
    protected javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JLabel lNameFld;
    protected javax.swing.JLabel mNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JTabbedPane navMenu;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPasswordField newPassFld;
    private javax.swing.JTextField oldPassFld;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton savePassBtn;
    protected javax.swing.JLabel studentName;
    protected javax.swing.JLabel timeLbl;
    // End of variables declaration//GEN-END:variables
}

package com.librarymanagement.admin;

import java.awt.Color;
import javax.swing.JOptionPane;

public class AddStudents extends javax.swing.JFrame {

    static DBConnection db;
    int xMouse;
    int yMouse;
    Color transparent = new Color(0, 0, 0, 0);

    public AddStudents() {
        db = new DBConnection();
        db.connect();
        initComponents();
    }

    void displayEmpty() {
        String id = idNumFld.getText();
        String fName = firstNameFld.getText();
        String mName = midNameFld.getText();
        String lName = lastNameFld.getText();
        String gender = genderFld.getText();
        String ageText = ageFld.getText();
        String course = courseFld.getText();
        String address = addressFld.getText();
        String contactNumText = contactNumFld.getText();
        String username = usernameFld.getText();
        String password = passwordFld.getText();
        
        emptyFname.setText(fName.isEmpty() ? "*" : "");
        emptyMname.setText(mName.isEmpty() ? "*" : "");
        emptyLname.setText(lName.isEmpty() ? "*" : "");
        emptyGender.setText(gender.isEmpty() ? "*" : "");
        emptyAge.setText(ageText.isEmpty() ? "*" : "");
        emptyCourse.setText(course.isEmpty() ? "*" : "");
        emptyStudAdd.setText(address.isEmpty() ? "*" : "");
        emptyConNum.setText(contactNumText.isEmpty() ? "*" : "");
        emptyID.setText(id.isEmpty() ? "*" : "");
        emptyUser.setText(username.isEmpty() ? "*" : "");
        emptyPass.setText(password.isEmpty() ? "*" : "");
    }
    
    void clearFlds() {
        idNumFld.setText("");
        firstNameFld.setText("");
        midNameFld.setText("");
        lastNameFld.setText("");
        genderFld.setText("");
        ageFld.setText("");
        courseFld.setText("");
        addressFld.setText("");
        contactNumFld.setText("");
        usernameFld.setText("");
        passwordFld.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        moveFrame = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        emptyFname = new javax.swing.JLabel();
        firstNameFld = new javax.swing.JTextField();
        emptyMname = new javax.swing.JLabel();
        midNameFld = new javax.swing.JTextField();
        emptyLname = new javax.swing.JLabel();
        lastNameFld = new javax.swing.JTextField();
        emptyGender = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        emptyAge = new javax.swing.JLabel();
        ageFld = new javax.swing.JTextField();
        emptyCourse = new javax.swing.JLabel();
        courseFld = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        emptyUser = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        emptyPass = new javax.swing.JLabel();
        passwordFld = new javax.swing.JTextField();
        emptyStudAdd = new javax.swing.JLabel();
        addressFld = new javax.swing.JTextField();
        emptyConNum = new javax.swing.JLabel();
        contactNumFld = new javax.swing.JTextField();
        emptyID = new javax.swing.JLabel();
        idNumFld = new javax.swing.JTextField();
        invalidAge = new javax.swing.JLabel();
        invalidContact = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 238, 217));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(57, 167, 255), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveFrame.setBackground(new java.awt.Color(23, 107, 135));
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
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        moveFrame.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        jPanel1.add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        panel.setBackground(transparent);
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(23, 107, 135)), "Create Student Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 24), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emptyFname.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyFname.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 10, 20));

        firstNameFld.setBackground(new java.awt.Color(255, 238, 217));
        firstNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        firstNameFld.setForeground(new java.awt.Color(11, 36, 71));
        firstNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 107, 135), 2), "First Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(firstNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 50));

        emptyMname.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyMname.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 20, 20));

        midNameFld.setBackground(new java.awt.Color(255, 238, 217));
        midNameFld.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        midNameFld.setForeground(new java.awt.Color(11, 36, 71));
        midNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        midNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Middle Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(midNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, 50));

        emptyLname.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyLname.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 20, 20));

        lastNameFld.setBackground(new java.awt.Color(255, 238, 217));
        lastNameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lastNameFld.setForeground(new java.awt.Color(11, 36, 71));
        lastNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Last Name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(lastNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 50));

        emptyGender.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyGender.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, -1));

        genderFld.setBackground(new java.awt.Color(255, 238, 217));
        genderFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        genderFld.setForeground(new java.awt.Color(11, 36, 71));
        genderFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Gender", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 50));

        emptyAge.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyAge.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 20, -1));

        ageFld.setBackground(new java.awt.Color(255, 238, 217));
        ageFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        ageFld.setForeground(new java.awt.Color(11, 36, 71));
        ageFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Age", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 50));

        emptyCourse.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyCourse.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 20, -1));

        courseFld.setBackground(new java.awt.Color(255, 238, 217));
        courseFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        courseFld.setForeground(new java.awt.Color(11, 36, 71));
        courseFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        courseFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Course", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 170, 50));

        jPanel2.setBackground(new java.awt.Color(23, 107, 135));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(165, 215, 232)));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 238, 217));
        jLabel2.setText("Student Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 250, 50));

        jPanel3.setBackground(new java.awt.Color(23, 107, 135));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 2, 2, new java.awt.Color(165, 215, 232)));
        jPanel3.setForeground(new java.awt.Color(255, 238, 217));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 238, 217));
        jLabel3.setText("Student Credentials");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 50));

        createBtn.setBackground(new java.awt.Color(23, 107, 135));
        createBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 238, 217));
        createBtn.setText("Create Account");
        createBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 107, 135), 2, true));
        createBtn.setFocusable(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        panel.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 210, 50));

        emptyUser.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyUser.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 20, -1));

        usernameFld.setBackground(new java.awt.Color(255, 238, 217));
        usernameFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        usernameFld.setForeground(new java.awt.Color(11, 36, 71));
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Username", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(usernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 50));

        emptyPass.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyPass.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 20, -1));

        passwordFld.setBackground(new java.awt.Color(255, 238, 217));
        passwordFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        passwordFld.setForeground(new java.awt.Color(11, 36, 71));
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Password", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 200, 50));

        emptyStudAdd.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyStudAdd.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyStudAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 20, -1));

        addressFld.setBackground(new java.awt.Color(255, 238, 217));
        addressFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        addressFld.setForeground(new java.awt.Color(11, 36, 71));
        addressFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Student Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 50));

        emptyConNum.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyConNum.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyConNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 10, -1));

        contactNumFld.setBackground(new java.awt.Color(255, 238, 217));
        contactNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        contactNumFld.setForeground(new java.awt.Color(11, 36, 71));
        contactNumFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactNumFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "Contact Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(contactNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 50));

        emptyID.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        emptyID.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(emptyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 20, -1));

        idNumFld.setBackground(new java.awt.Color(255, 238, 217));
        idNumFld.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        idNumFld.setForeground(new java.awt.Color(11, 36, 71));
        idNumFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idNumFld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(23, 107, 135)), "ID Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 1, 14), new java.awt.Color(23, 107, 135))); // NOI18N
        panel.add(idNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 170, 50));

        invalidAge.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        invalidAge.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(invalidAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        invalidContact.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        invalidContact.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(invalidContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 590, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(613, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitBtnMouseClicked

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String id = idNumFld.getText();
        String fName = firstNameFld.getText();
        String mName = midNameFld.getText();
        String lName = lastNameFld.getText();
        String gender = genderFld.getText();
        String ageText = ageFld.getText();
        String course = courseFld.getText();
        String address = addressFld.getText();
        String contactNumText = contactNumFld.getText();
        String username = usernameFld.getText();
        String password = passwordFld.getText();
        
        displayEmpty();
        try {
            if (!fName.isEmpty() && !lName.isEmpty() && !mName.isEmpty() && !gender.isEmpty()
                    && !ageText.isEmpty() && !course.isEmpty() && !address.isEmpty()
                    && !contactNumText.isEmpty() && !id.isEmpty() && !username.isEmpty() && !password.isEmpty()) { 
                
                int age = Integer.parseInt(ageText);
                long conNum = Long.parseLong(contactNumText);

                db.ps = db.con.prepareStatement("INSERT INTO StudentInfo(ID, firstName, middleName, lastName, gender, age, course, address, contactNum, username, password) VALUES(?,?,?,?,?,?,?,?,?,?,?)");

                db.ps.setString(1, id);
                db.ps.setString(2, fName);
                db.ps.setString(3, mName);
                db.ps.setString(4, lName);
                db.ps.setString(5, gender);
                db.ps.setInt(6, age);
                db.ps.setString(7, course);
                db.ps.setString(8, address);
                db.ps.setLong(9, conNum);
                db.ps.setString(10, username);
                db.ps.setString(11, password);

                int check = db.ps.executeUpdate();

                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Created Successfully!");
                    clearFlds();
                } else {
                    JOptionPane.showMessageDialog(null, "Student not created!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for age or contact", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_createBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JTextField contactNumFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel emptyAge;
    private javax.swing.JLabel emptyConNum;
    private javax.swing.JLabel emptyCourse;
    private javax.swing.JLabel emptyFname;
    private javax.swing.JLabel emptyGender;
    private javax.swing.JLabel emptyID;
    private javax.swing.JLabel emptyLname;
    private javax.swing.JLabel emptyMname;
    private javax.swing.JLabel emptyPass;
    private javax.swing.JLabel emptyStudAdd;
    private javax.swing.JLabel emptyUser;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idNumFld;
    private javax.swing.JLabel invalidAge;
    private javax.swing.JLabel invalidContact;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameFld;
    private javax.swing.JTextField midNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}

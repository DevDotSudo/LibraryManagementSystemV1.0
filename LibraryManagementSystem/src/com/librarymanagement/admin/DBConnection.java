package com.librarymanagement.admin;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
    private final String DRIVE = "com.mysql.cj.jdbc.Driver";
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
        
    public void connect() {
        try {
            Class.forName(DRIVE);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryManagement?useSSL=false","sudo","jenn06");
            
            if(con != null) {
                System.out.println("Connected Successfully!");
            } else {
                System.out.println("Not connected");
            }
        }
        
        catch(SQLException i) {
            JOptionPane.showMessageDialog(null, "Database error : " + i.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}

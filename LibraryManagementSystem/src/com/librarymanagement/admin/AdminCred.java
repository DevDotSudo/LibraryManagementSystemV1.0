package com.librarymanagement.admin;

public class AdminCred {
    DBConnection db;
    private String userAdmin = "Admin";
    private String passAdmin = "admin123";
    
    public String getUserAdmin() {
        return this.userAdmin;
    }
    
    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }
    
    public String getPassAdmin() {
        return this.passAdmin;
    }
    
    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }
    
    public void saveCredentials() {
        db = new DBConnection();
        db.connect();
        try {
            db.ps = db.con
                    .prepareStatement("INSERT INTO AdminCredentials(Username, Password) VALUES(?,?)");
        
            db.ps.setString(1, getUserAdmin());
            db.ps.setString(2, getPassAdmin());
        
            int check = db.ps.executeUpdate();
        
            if(check == 1) {
                System.out.println("Admin Credentials Saved");
            } else {
                System.out.println("Can't Save Credentials");
            }
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

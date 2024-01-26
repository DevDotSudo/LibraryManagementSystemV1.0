package com.librarymanagement.admin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeDisplay {

    public String getDateTime() {
        LocalDateTime timeNow = LocalDateTime.now();
        
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy - HH:mm:ss");
        
        String formattedDateTime = timeNow.format(formatDateTime);
        
        return formattedDateTime;
    }
    
    public String getTimeNow() throws InterruptedException{
        String timeNow;
        
        LocalDateTime time = LocalDateTime.now();
        
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss a");
        
        timeNow = time.format(formatTime);
        
        return timeNow;
    }
}

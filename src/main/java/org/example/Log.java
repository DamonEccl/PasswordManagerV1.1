package org.example;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Log {
    public static File log = new File("src/main/resources/log.txt");

    public static void LogPass() throws IOException {
        BufferedWriter logWriter = new BufferedWriter(new FileWriter(log, true));
        logWriter.newLine();
        logWriter.write("Password was saved at " + getDate());
        logWriter.close();
    }

    public static void LoggedIn() throws IOException {
        BufferedWriter logWriter = new BufferedWriter(new FileWriter(log, true));
        logWriter.newLine();
        logWriter.write("User logged in at " + getDate());
        logWriter.close();
    }

    public static String getDate(){
        Calendar cal = Calendar.getInstance();
        Date todayDate = cal.getTime();
        String newDate = todayDate.toString();
        return newDate;

    }
}

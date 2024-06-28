package org.example;

import com.sun.glass.ui.Pixels;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Backend {

    public static String firstLine = "";

    public static boolean Setup(){
        File file = new File("src/main/resources/data.txt");

        try {
            Scanner scanner = new Scanner(file);

            try{

                firstLine = scanner.nextLine();
                return false;
            }
            catch (NoSuchElementException e){
                SignupController.onSignup();
                return true;
            }

            finally {
                scanner.close();
            }
        }
        catch (IOException e) {
            System.out.println("Thats not good... FILE NOT FOUND");
            return true;
        }
    }
    public static boolean Authenticate(String password){
        password = Encryption.encode(password);
        System.out.println(password);

        if (password.equals(firstLine)){
            return true;
        }
        return false;
    }

    public static void setPassword(String password){
        password = Encryption.encode(password);
        File file = new File("src/main/resources/data.txt");
        File log = new File("src/main/resources/log.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(password);
            fileWriter.close();
            System.out.println("Password Saved!");
            Log.LogPass();

        }
        catch (IOException e){
            System.out.println("Thats not good... FILE NOT FOUND\n Password NOT saved!");
        }
    }

}
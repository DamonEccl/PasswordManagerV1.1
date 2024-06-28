package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Backend {

    public static String firstLine = "";

    public static void Setup(){
        File file = new File("src/main/java/org/example/data.txt");

        try {
            Scanner scanner = new Scanner(file);

            try{

                firstLine = scanner.nextLine();
            }
            catch (NoSuchElementException e){
                SignupController.onSignup();
            }


            scanner.close();
        }
        catch (IOException e) {
            System.out.println("Thats not good... FILE NOT FOUND");
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
}
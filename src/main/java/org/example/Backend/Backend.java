package org.example.Backend;


import org.example.Controllers.SignupController;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Backend {


    public static String[] passKeeper;
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

    public static void Reader(){
        File file = new File("src/main/resources/passwordKeeper.fxml");
        ArrayList<String> tempKeeper = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            try{

                int i = 0;

                while(scanner.hasNext()){
                    tempKeeper.add(scanner.nextLine());
                    i++;

                }

            }
            catch (NoSuchElementException e){
                System.out.println("Error.. Problem with fxml file");
            }

            finally {
                scanner.close();
            }
        }
        catch (IOException e) {
            System.out.println("Thats not good... FILE NOT FOUND");
        }

        passKeeper = tempKeeper.toArray(String[]::new);

        New.setPassKeeper(passKeeper);
        New newItem = new New("Testing", "User", "Example");

        New.Create(newItem);





    }

    public static boolean Authenticate(String password){
        password = Encryption.Encode(password);
        System.out.println(password);

        if (password.equals(firstLine)){
            return true;
        }
        return false;
    }

    public static void setPassword(String password){
        password = Encryption.Encode(password);
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
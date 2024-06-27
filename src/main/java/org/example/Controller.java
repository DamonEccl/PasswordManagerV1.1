package org.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Controller extends Application {

    public Controller(){

    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root, 640, 400);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Error found");
            e.printStackTrace();
            System.exit(1);
        }
    }



    @FXML
    private PasswordField passwordBox;

    @FXML
    private Label incorrect;


    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (passwordBox.getLength() > 7){
            System.out.println("Works");
            incorrect.setVisible(false);
        }
        else{
            System.out.println("Failed");
            incorrect.setVisible(true);
        }
    }

    public static void main(String[] args) {
        launch(args);

    }

}
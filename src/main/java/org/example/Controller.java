package org.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Controller extends Application {



    @Override
    public void start(Stage stage) throws Exception {

            var scene = new Scene(new Pane());

            ViewSwitcher.setScene(scene);
            ViewSwitcher.switchTo(View.LOGIN);
            stage.setScene(scene);
            stage.show();


    }



    public static void main(String[] args) {
        launch(args);
        //Backend.Setup();

    }

}
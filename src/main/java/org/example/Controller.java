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

import java.io.IOException;

public class Controller extends Application {



    @Override
    public void start(Stage stage) throws Exception {

        var scene = new Scene(new Pane());
        ViewSwitcher.setScene(scene);
        ViewSwitcher.setStage(stage);
        stage.sizeToScene();

            if (!Backend.Setup()) {
                ViewSwitcher.switchTo(View.LOGIN);
            }
            else{
                ViewSwitcher.switchTo(View.SIGNUP);
            }


            stage.setTitle("Passwork Keeper");
            //stage.setResizable(false);
            stage.setScene(scene);
            stage.show();


    }



    public static void main(String[] args) throws IOException {
        launch(args);
    }

}
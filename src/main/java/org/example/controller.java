package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

import java.util.Objects;
import java.net.URL;

public class controller extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));
            Parent root = loader.load();
            ModuleLayer.Controller controller = loader.getController();

            stage.setTitle("Something");


            int width = 400;
            int height = 640;

            stage.setScene(new Scene(root, height, width));
            stage.show();
        }
        catch (Exception e) {
            System.out.println("Error found");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
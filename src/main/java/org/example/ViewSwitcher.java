package org.example;

// Credits to Almas for the file switcher logic https://www.youtube.com/watch?v=DUpQGpHsRMg&ab_channel=AlmasBaimagambetov

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewSwitcher  {

    private static Scene scene;
    private static Stage stage;

    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }

    public static void setStage(Stage stage) {
        ViewSwitcher.stage = stage;
    }

    public static void switchTo(View view) throws IOException {
        if (scene == null){
            System.out.println("No scene set");
            return;
        }

        try {
            Parent root = FXMLLoader.load(ViewSwitcher.class.getResource(view.getFileName()));
            scene.setRoot(root);
            stage.sizeToScene();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}

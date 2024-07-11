package org.example.Controllers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.example.Backend.Main;
import org.example.Misc.View;
import org.example.Misc.ViewSwitcher;

import java.io.IOException;

public class Controller extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        var scene = new Scene(new Pane());
        ViewSwitcher.setScene(scene);
        ViewSwitcher.setStage(stage);
        stage.sizeToScene();

            if (!Main.Setup()) {
                ViewSwitcher.switchTo(View.LOGIN);
            }
            else{
                ViewSwitcher.switchTo(View.SIGNUP);
            }


            stage.setTitle("Passwork Keeper");
            stage.setResizable(false);
            stage.getIcons().add(new Image("icon.png"));
            stage.setScene(scene);
            stage.show();


    }

    public static void main(String[] args) throws IOException {
        launch(args);
    }

}
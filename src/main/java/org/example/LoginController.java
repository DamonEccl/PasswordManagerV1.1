package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class LoginController {

    public static void onLogin() throws IOException {
        ViewSwitcher.switchTo(View.LOGIN);
    }

    @FXML
    private PasswordField passwordBox;

    @FXML
    private Label incorrect;


    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        if (Backend.Authenticate(passwordBox.getText())){
            System.out.println("Works");
            incorrect.setVisible(false);
            System.out.println(passwordBox.getText());
            Log.LoggedIn();
            passKeeperController.onPassKeeper();

        }
        else{
            System.out.println("Failed");
            incorrect.setVisible(true);
        }
    }
}

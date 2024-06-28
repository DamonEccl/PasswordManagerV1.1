package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {



    public static void onSignup() throws IOException {
        ViewSwitcher.switchTo(View.SIGNUP);
    }

    @FXML
    private PasswordField firstPass;

    @FXML
    private PasswordField confirm;

    @FXML
    private Label incorrect;

    @FXML
    private Label correct;

    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (firstPass.getText().equals(confirm.getText()) && firstPass.getText() != null && confirm.getText() != null ){
            correct.setVisible(true);
        }
        else{
            correct.setVisible(false);
        }
    }

}

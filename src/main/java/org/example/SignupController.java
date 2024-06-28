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
    public void handleButtonAction(ActionEvent event) throws IOException {

        String first = firstPass.getText();
        String confirmed = confirm.getText();

        System.out.println(first + " " + confirmed);

        if (!first.isEmpty() && !confirmed.isEmpty()) {
            if (first.equals(confirmed)) {
                correct.setVisible(true);
                Backend.setPassword(first);
                passKeeperController.onPassKeeper();
            } else {
                incorrect.setVisible(true);
            }
        }
    }



}

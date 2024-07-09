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
            int requirments = checkRequirements(first);
            if (requirments == 0) {
                if (first.equals(confirmed)) {
                    correct.setVisible(true);
                    Backend.setPassword(first);
                    Backend.Reader();
                    passKeeperController.onPassKeeper();
                }
                else {
                    incorrect.setText("Passwords dont match");
                    incorrect.setVisible(true);
                }
            }
            else if (requirments == 1){
                incorrect.setText("Password needs uppercase");
                incorrect.setVisible(true);
            }

            else if (requirments == 2){
                incorrect.setText("Password needs lowercase");
                incorrect.setVisible(true);
            }

            else if (requirments == 3){
                incorrect.setText("Password is not long enough");
                incorrect.setVisible(true);
            }
        }
    }

    public int checkRequirements(String password){
        if (password.equals(password.toLowerCase())){
            return 1;
        }

        else if (password.equals(password.toUpperCase())){
            return 2;
        }

        else if (password.length() < 8){
            return 3;
        }
        return 0;
    }



}

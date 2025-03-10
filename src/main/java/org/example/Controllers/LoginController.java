package org.example.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.example.Backend.Main;
import org.example.Backend.EncryptionV2;
import org.example.Backend.Log;
import org.example.Misc.View;
import org.example.Misc.ViewSwitcher;

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
        EncryptionV2.Encode("Password");
        if (Main.Authenticate(passwordBox.getText())){
            System.out.println("Works");
            incorrect.setVisible(false);
            System.out.println(passwordBox.getText());
            Log.LoggedIn();
            Main.Reader();
            passKeeperController.onPassKeeper();


        }
        else{
            System.out.println("Failed");
            incorrect.setVisible(true);
        }
    }


    private EventHandler<KeyEvent> keyAction = new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent keyEvent) {
            if (keyEvent.getCode() == KeyCode.ENTER){
                try {
                    handleButtonAction(new ActionEvent());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

}

package org.example;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {



    public static void onSignup() throws IOException {
        ViewSwitcher.switchTo(View.SIGNUP);
    }
}

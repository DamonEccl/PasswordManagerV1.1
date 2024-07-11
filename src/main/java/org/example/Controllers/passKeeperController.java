package org.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import org.example.Misc.View;
import org.example.Misc.ViewSwitcher;

import java.io.IOException;

public class passKeeperController {

    public static void onPassKeeper() throws IOException {
        ViewSwitcher.switchTo(View.MAIN);
    }

    @FXML
    private Pane addPane;



    @FXML
    public void addEvent(ActionEvent actionEvent) {
        addPane.setVisible(true);
    }
}

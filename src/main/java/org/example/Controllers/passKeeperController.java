package org.example.Controllers;

import org.example.Misc.View;
import org.example.Misc.ViewSwitcher;

import java.io.IOException;

public class passKeeperController {

    public static void onPassKeeper() throws IOException {
        ViewSwitcher.switchTo(View.MAIN);
    }


}

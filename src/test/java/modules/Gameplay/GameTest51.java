package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class GameTest51 extends Gameplay {

    public static void verify(boolean isClick) {
        if (isClick) {

            System.out.println();
            System.out.println("Module: GAMEPLAY");
            System.out.println("Test Case: 51");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfContained(DealerTable.Label.MusicIcon, "xlink:href", "on", "Enabled");

        } else {

            VerificationHandler.verifyIfContained(DealerTable.Label.MusicIcon, "xlink:href", "off", "Disabled");

            System.out.println();
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}

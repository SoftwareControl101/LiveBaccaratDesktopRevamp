package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class GameTest50 extends Gameplay {

    public static void verify(boolean isClick) {
        if (isClick) {

            System.out.println();
            System.out.println("Module: GAMEPLAY");
            System.out.println("Test Case: 50");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfContained(DealerTable.Label.VideoIcon, "xlink:href", "off", "Disabled");

        } else {

            VerificationHandler.verifyIfContained(DealerTable.Label.VideoIcon, "xlink:href", "on", "Enabled");

            System.out.println();
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}

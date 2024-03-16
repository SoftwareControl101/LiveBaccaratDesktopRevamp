package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class GameTest13 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowDealing, 5);
        VerificationHandler.verifyIfContained(DealerTable.Container.Timer, "class", "stop", "Blue Color");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

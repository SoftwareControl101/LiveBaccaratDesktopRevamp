package modules.Gameplay;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;

public class GameTest14 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowTimer, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.EditChips, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.ChipOptions, 5);
        for (Component actionButton : TestVariables.ACTION_BUTTONS)
            VerificationHandler.verifyIfContained(actionButton, "class", "disabled", "Disabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

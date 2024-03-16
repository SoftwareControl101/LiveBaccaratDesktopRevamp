package modules.Gameplay;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.Component;

public class GameTest8 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 8");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowTimer, 5);
        for (Component bettingOption : TestVariables.ALL_BET_OPTIONS)
            VerificationHandler.verifyIfNotContained(bettingOption, "class", "disabled", "Enabled");
        for (Component actionButton : TestVariables.ACTION_BUTTONS)
            VerificationHandler.verifyIfContained(actionButton, "class", "disabled", "Disabled");
        VerificationHandler.verifyIfNotContained(DealerTable.Container.Timer, "class", "red", "Green Color");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Gameplay;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;

public class GameTest24 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 24");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.PlaceYourBetsPlease, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowTimer, 5);
        VerificationHandler.verifyIfNotContained(DealerTable.Container.Timer, "class", "red", "Red Color");
        for (Component bettingOption : TestVariables.ALL_BET_OPTIONS)
            VerificationHandler.verifyIfNotContained(bettingOption, "class", "disabled", "Enabled");
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.EditChips, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.ChipOptions, 5);
        for (Component actionButton : TestVariables.ACTION_BUTTONS) VerificationHandler.verifyIfDisplayed(actionButton, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

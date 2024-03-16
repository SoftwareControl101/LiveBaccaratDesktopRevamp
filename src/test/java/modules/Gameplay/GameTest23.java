package modules.Gameplay;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.Component;

public class GameTest23 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 23");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.NoMoreBets, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowDealing, 5);
        WaitHandler.wait(3);
        for (Component bettingOption : TestVariables.ALL_BET_OPTIONS)
            VerificationHandler.verifyIfContained(bettingOption, "class", "disabled", "Disabled");
        VerificationHandler.verifyIfNotDisplayed(DealerTable.Button.EditChips, 1);
        VerificationHandler.verifyIfNotDisplayed(DealerTable.Button.ChipOptions, 1);
        for (Component actionButton : TestVariables.ACTION_BUTTONS) VerificationHandler.verifyIfNotDisplayed(actionButton, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

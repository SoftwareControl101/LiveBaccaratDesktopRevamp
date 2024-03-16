package modules.Gameplay;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Component;

public class GameTest9 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 9");
        System.out.println("Actual Results: ");

        waitUntilNewRoundStarts();

        for (byte i = 0; i < 8; i++) {
            verifyPlaceBet(TestVariables.ALL_BET_OPTIONS[i], TestVariables.ALL_BET_CHIPS[i]);
            if (i < 7) EventHandler.click(DealerTable.Button.Undo);
        }
        for (Component actionButton : TestVariables.ACTION_BUTTONS)
            VerificationHandler.verifyIfNotContained(actionButton, "class", "disabled", "Enabled");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

    private static void verifyPlaceBet(Component bettingOption, Component bettingChip) {
        EventHandler.click(bettingOption);
        CustomAssert.assertTrue(ConditionHandler.isDisplayed(bettingChip, 5),
                "** Can Place a Bet on " + bettingOption.getName(),
                "** Can Not Place a Bet on " + bettingOption.getName());
    }

}

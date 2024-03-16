package modules.Functionality;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class FuncTest49 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 49");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(ConditionHandler.isDisplayed(DealerTable.BettingChip.Player, 5),
                "** Betting Chip is Placed Again",
                "** Betting Chip is Not Placed Again");

        for (Component actionButton : TestVariables.ACTION_BUTTONS)
            VerificationHandler.verifyIfNotContained(actionButton, "class", "disabled", "Enabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

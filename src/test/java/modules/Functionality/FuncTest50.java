package modules.Functionality;

import globals.TestVariables;
import pages.DealerTable;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class FuncTest50 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 50");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(ConditionHandler.isDisplayed(DealerTable.BettingChip.Player, 1),
                "** Betting Chip is Placed Again",
                "** Betting Chip is Not Placed Again");

        CustomAssert.assertEquals((oldBet * 2), getChipValue(DealerTable.BettingChip.Player),
                "** ReBet is Doubled",
                "** ReBet is Not Doubled");

        for (Component actionButton : TestVariables.ACTION_BUTTONS)
            VerificationHandler.verifyIfNotContained(actionButton, "class", "disabled", "Enabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

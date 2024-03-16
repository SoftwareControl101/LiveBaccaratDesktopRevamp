package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class FuncTest48 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 48");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        CustomAssert.assertFalse(ConditionHandler.isDisplayed(DealerTable.Label.ConfirmNow, 1),
                "** The Popup Message is Closed",
                "** The Popup Message is Not Closed");

        CustomAssert.assertFalse(ConditionHandler.isDisplayed(DealerTable.BettingChip.Player, 1),
                "** Betting Chip is Not Placed",
                "** Betting Chip is Placed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

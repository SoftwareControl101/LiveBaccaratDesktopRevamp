package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FuncTest51 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 51");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(ConditionHandler.isDisplayed(DealerTable.BettingChip.Player, 1),
                "** ReBet is Removed",
                "** ReBet is Not Removed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest38 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 38");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(DealerTable.BettingChip.Player, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

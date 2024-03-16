package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class FuncTest37 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        double expectedBet = oldBet * 2;
        double actualBet = getChipValue(DealerTable.BettingChip.Player);

        CustomAssert.assertEquals(expectedBet, actualBet,
                "** The Placed Bet is Doubled: " + oldBet + " --> " + actualBet,
                "** The Placed Bet is Not Doubled: " + oldBet + " --> " + actualBet);
        VerificationHandler.verifyIfNotContained(DealerTable.Button.Confirm, "class", "disabled", "Enabled");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

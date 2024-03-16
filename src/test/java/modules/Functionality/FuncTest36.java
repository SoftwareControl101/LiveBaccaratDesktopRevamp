package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest36 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 36");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.BetsAccepted, 5);

        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        VerificationHandler.verifyIfContained(DealerTable.Container.PlayerBettingChip, "class", "confirm", "Dark Color");
        CustomAssert.assertEquals(getChipValue(DealerTable.BettingChip.Player), GetHandler.getDouble(DealerTable.Label.TotalBet),
                "** Betting Chip is Placed",
                "** Betting Chip is Not Placed");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

}

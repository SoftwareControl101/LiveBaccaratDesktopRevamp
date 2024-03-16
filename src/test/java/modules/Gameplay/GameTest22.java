package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class GameTest22 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 22");
        System.out.println("Actual Results: ");

        WaitHandler.wait(2);
        CustomAssert.assertEquals(0, GetHandler.getDouble(DealerTable.Label.TotalBet),
                "** Placed Bet is Rejected in Total Bet",
                "** Placed Bet is Not Rejected in Total Bet");
        VerificationHandler.verifyIfNotDisplayed(DealerTable.BettingChip.Player, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

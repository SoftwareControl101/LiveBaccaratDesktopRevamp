package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest18 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 18");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);

        double bet = getChipValue(DealerTable.BettingChip.Player);
        double totalBet = GetHandler.getDouble(DealerTable.Label.TotalBet);

        CustomAssert.assertEquals(bet, totalBet,
                "** Total Bet is Displayed According to Player's Placed Bet: " + bet + " == " + totalBet,
                "** Total Bet is Not Displayed According to Player's Placed Bet: " + bet + " != " + totalBet);

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

}

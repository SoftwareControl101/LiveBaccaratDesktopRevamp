package modules.Gameplay;

import globals.TestConditions;
import pages.DealerTable;
import utilities.objects.CustomAssert;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

public class GameTest28 extends Gameplay {

    static double balanceAfterBetting = 0.0;

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 28");
        System.out.println("Actual Results: ");

        balanceAfterBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);

        while (TestConditions.isPlayerWin(getRoundResult())) {
            placeAndConfirmAnyBettingOptions();
            balanceAfterBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        }

        CustomAssert.assertFalse(TestConditions.isWin(DealerTable.BettingOption.Player),
                "** Losing Betting Options is Not Highlighted",
                "** Losing Betting Options is Highlighted");

        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);

        CustomAssert.assertTrue(getUpdatedBalance() <= balanceAfterBetting,
                "** Balance is Correct and Not Increased by Any Amount",
                "** Balance is Not Correct and Increased by Amount");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

}

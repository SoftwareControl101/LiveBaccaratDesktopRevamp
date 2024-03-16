package modules.Functionality;

import globals.TestConditions;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest27 extends Functionality {

    public static void waitUntilBetWins() {
        while (!TestConditions.isPlayerWin(getRoundResult())) {
            placeABetOnAnyBettingOptions();
            EventHandler.click(DealerTable.Button.Confirm);
        }
        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 27");
        System.out.println("Actual Results: ");

        double newBalance = getUpdatedBalance();
        CustomAssert.assertTrue(oldBalance < newBalance,
                "** Balance is Increased: " + oldBalance + " --> " + newBalance,
                "** Balance is Not Increased: " + oldBalance + " --> " + newBalance);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

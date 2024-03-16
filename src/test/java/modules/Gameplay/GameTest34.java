package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class GameTest34 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 34");
        System.out.println("Actual Results: ");

        boolean isVerified;
        do {
            placeAndConfirmAnyBettingOptions();
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
            WaitHandler.waitVisibility(DealerTable.Container.PlayerCards, 300);
            int[] playerCards = getCardResults(DealerTable.Container.PlayerCards);
            int playerTotalPoints = GetHandler.getInt(DealerTable.Label.PlayerTotalPoints);
            int[] bankerCards = getCardResults(DealerTable.Container.BankerCards);
            int bankerTotalPoints = GetHandler.getInt(DealerTable.Label.BankerTotalPoints);
            isVerified = verifyCards(playerCards, playerTotalPoints) || verifyCards(bankerCards, bankerTotalPoints);
        } while (!isVerified);

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

    private static boolean verifyCards(int[] cards, int total) {
        if (Helper.find(10, cards) || Helper.find(11, cards) ||
                Helper.find(12, cards) || Helper.find(13, cards)) {
            CustomAssert.assertEquals(0, total,
                    "Total Value Indicator is Correct: " + 0 + " == " + total,
                    "Total Value Indicator is Incorrect: " + 0 + " != " + total);
            return true;
        }
        return false;
    }

}

package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class GameTest10 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 10");
        System.out.println("Actual Results: ");

        WaitHandler.wait(2);
        double chipValue = getChipValue(DealerTable.BettingChip.Player);
        double totalBet = GetHandler.getDouble(DealerTable.Label.TotalBet);

        VerificationHandler.verifyIfDisplayed(DealerTable.BettingChip.Player, 5);
        verifyTotalBet(chipValue, totalBet);
        VerificationHandler.verifyIfContained(DealerTable.Container.PlayerBettingChip, "class", "confirm", "Confirmed");

        EventHandler.click(DealerTable.BettingOption.Player);
        WaitHandler.wait(2);
        totalBet = GetHandler.getDouble(DealerTable.Label.TotalBet);

        VerificationHandler.verifyIfDisplayed(DealerTable.BettingChip.Player, 5);
        verifyTotalBet(chipValue, totalBet);
        VerificationHandler.verifyIfNotContained(DealerTable.Container.PlayerBettingChip, "class", "confirm", "Denied");

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

    private static void verifyTotalBet(double expected, double actual) {
        CustomAssert.assertEquals(expected, actual,
                "** Bet Amount is Reflected in Total Bet: " + expected + " == " + actual,
                "** Bet Amount is Not Reflected in Total Bet: " + expected + " != " + actual);
    }

}

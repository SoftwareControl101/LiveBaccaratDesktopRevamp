package modules.BetInformation;

import globals.TestConditions;
import pages.BetDetails;
import pages.DealerTable;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class BetInfoTest1 extends BetInformation {

    static Component betOption = DealerTable.BettingOption.Player;

    public static void placeBetUntilWin() {
        boolean isError = true;
        do {
            try {
                placeBet(betOption);
                waitRoundResult();
                isError = false;
            } catch (Exception e) { Printer.printError("Failed to place a bet"); }
        } while (isError || !TestConditions.isPlayerWin(roundResult));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: BET INFORMATION");
        System.out.println("Test Case: 1");
        System.out.println("Other Information: " + tableName + " " + roundId + " " + Helper.toString(roundResult));
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(BetDetails.Label.BetDetails, 300);
        VerificationHandler.verifyIfDisplayed(BetDetails.Button.Back, 5);

        double expectedStake = totalBet;
        double actualStake = getCurrentStake();
        CustomAssert.assertEquals(expectedStake, actualStake,
                "** Stake is Correct: " + expectedStake + " == " + actualStake,
                "** Stake is Incorrect: " + expectedStake + " != " + actualStake);

        double expectedWinLoss = totalBet;
        double actualWinLoss = GetHandler.getDouble(BetDetails.Label.WinLoss);
        CustomAssert.assertEquals(expectedWinLoss, actualWinLoss,
                "** Win/Loss is Correct: " + expectedWinLoss + " == " + actualWinLoss,
                "** Win/Loss is Incorrect: " + expectedWinLoss + " != " + actualWinLoss);

        VerificationHandler.verifyIfDisplayed(BetDetails.Container.PlayerCards, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Label.PlayerTotalPoints, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.BankerCards, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Label.BankerTotalPoints, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.PlayerWon, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.BettingOptions, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.WinBettingOptions, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.BettingChip.Player, 5);

        System.out.println();
    }

}

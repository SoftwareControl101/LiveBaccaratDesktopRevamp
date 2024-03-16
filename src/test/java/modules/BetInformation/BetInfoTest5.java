package modules.BetInformation;

import globals.TestConditions;
import pages.BetDetails;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Printer;

public class BetInfoTest5 extends BetInformation {

    static Component[] betOptions = {
            DealerTable.BettingOption.Player,
            DealerTable.BettingOption.PlayerPair,
            DealerTable.BettingOption.PlayerDragonBonus
    };

    public static void placeBetUntilTie() {
        boolean isError = true;
        do {
            try {
                waitBettingPhase(25, true);
                WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
                for (Component betOption : betOptions ) EventHandler.click(betOption);
                EventHandler.click(DealerTable.Button.Confirm);
                waitRoundResult();
                isError = false;
            } catch (Exception e) { Printer.printError("Failed to place a bet"); }
        } while (isError || !TestConditions.isTieWin(roundResult));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: BET INFORMATION");
        System.out.println("Test Case: 5");
        System.out.println("Other Information: " + tableName + " " + roundId + " " + Helper.toString(roundResult));
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(BetDetails.Label.BetDetails, 300);
        VerificationHandler.verifyIfDisplayed(BetDetails.Button.Back, 5);

        double expectedStake = totalBet;
        double actualStake = getCurrentStake();
        CustomAssert.assertEquals(expectedStake, actualStake,
                "** Stake is Correct: " + expectedStake + " == " + actualStake,
                "** Stake is Incorrect: " + expectedStake + " != " + actualStake);

        double expectedWinLoss = getExpectedWinLoss();
        double actualWinLoss = GetHandler.getDouble(BetDetails.Label.WinLoss);
        CustomAssert.assertEquals(expectedWinLoss, actualWinLoss,
                "** Win/Loss is Correct: " + expectedWinLoss + " == " + actualWinLoss,
                "** Win/Loss is Incorrect: " + expectedWinLoss + " != " + actualWinLoss);

        VerificationHandler.verifyIfDisplayed(BetDetails.Container.PlayerCards, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Label.PlayerTotalPoints, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.BankerCards, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Label.BankerTotalPoints, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.TieWon, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.BettingOptions, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.Container.WinBettingOptions, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.BettingChip.Player, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.BettingChip.PlayerPair, 5);
        VerificationHandler.verifyIfDisplayed(BetDetails.BettingChip.PlayerDragonBonus, 5);

        System.out.println();
    }

    private static double getExpectedWinLoss() {
        double payout = 0.0;

        payout += getPayout(0, TestConditions.isTieWin(roundResult), BetDetails.BettingChip.Player);
        payout += getPayout(11, TestConditions.isPlayerPairWin(roundResult), BetDetails.BettingChip.PlayerPair);
        payout += getPayout(0, TestConditions.isNaturalTie(roundResult), BetDetails.BettingChip.PlayerPair);

        return payout - totalBet;
    }

    private static double getPayout(int multiplier, boolean condition, Component chipValue) {
        if (condition) {
            int bet = getChipValue(chipValue);
            return (bet * multiplier) + bet;
        }
        return 0;
    }

}

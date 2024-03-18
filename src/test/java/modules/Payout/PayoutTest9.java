package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest9 extends Payout implements PayoutCase {

    private final int testCase = 9;
    private double bet, playerBet, payout;
    private final double payoutOdds = 8;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;

        EventHandler.click(DealerTable.BettingOption.Tie);

        if (Helper.find(6, testCaseList)) return;
        if (Helper.find(7, testCaseList)) return;
        if (Helper.find(8, testCaseList)) return;
        EventHandler.click(DealerTable.BettingOption.Player);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;

        bet = getChipValue(DealerTable.BettingChip.Tie);

        if (Helper.find(6, testCaseList)) return;
        if (Helper.find(7, testCaseList)) return;
        if (Helper.find(8, testCaseList)) return;
        playerBet = getChipValue(DealerTable.BettingChip.Player);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;

        if (TestConditions.isTieWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }

        if (Helper.find(6, testCaseList)) return;
        if (Helper.find(7, testCaseList)) return;
        if (Helper.find(8, testCaseList)) return;
        if (TestConditions.isPlayerWin(roundResult)) addWin(playerBet, 1);
        else if (TestConditions.isTieWin(roundResult)) addWin(playerBet, 0);
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;
        if (!TestConditions.isTieWin(roundResult)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

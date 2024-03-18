package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest2 extends Payout implements PayoutCase {

    private final int testCase = 2;
    private double bet, payout;
    private final double payoutOdds = 0.95;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(1, testCaseList)) return;

        EventHandler.click(DealerTable.BettingOption.Banker);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(1, testCaseList)) return;

        bet = getChipValue(DealerTable.BettingChip.Banker);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(1, testCaseList)) return;

        if (TestConditions.isBankerWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        } else if (TestConditions.isTieWin(roundResult)) {
            payout = bet;
            addWin(bet, 0);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(1, testCaseList)) return;
        if (!TestConditions.isBankerWin(roundResult)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest6 extends Payout implements PayoutCase {

    private final int testCase = 6;
    private double bet, payout;
    private final double payoutOdds = 1;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(1, testCaseList)) return;
        if (Helper.find(2, testCaseList)) return;
        if (Helper.find(3, testCaseList)) return;
        if (Helper.find(4, testCaseList)) return;

        if (!isNonCommission) {
            EventHandler.click(DealerTable.Button.Commission);
            isNonCommission = true;
        }
        EventHandler.click(DealerTable.BettingOption.Player);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;

        bet = getChipValue(DealerTable.BettingChip.Player);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;

        if (TestConditions.isPlayerWin(roundResult)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        } else if (TestConditions.isTieWin(roundResult)) {
            payout = bet;
            addWin(bet, 0);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!isNonCommission) return;
        if (!TestConditions.isPlayerWin(roundResult)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

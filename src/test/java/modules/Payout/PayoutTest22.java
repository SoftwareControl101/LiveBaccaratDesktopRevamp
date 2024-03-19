package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest22 extends Payout implements PayoutCase {

    private final int testCase = 22;
    private double bet, payout;
    private final double payoutOdds = 20;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(21, testCaseList)) return;

        EventHandler.click(DealerTable.BettingOption.FortuneSix);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList) && !Helper.find(21, testCaseList)) return;

        bet = getChipValue(DealerTable.BettingChip.FortuneSix);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList) && !Helper.find(21, testCaseList)) return;

        if (TestConditions.isFortuneSixCardsWin(roundResult, 3)) {
            payout = bet + (bet * payoutOdds);
            addWin(bet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!TestConditions.isFortuneSixCardsWin(roundResult, 3)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo(bet, payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

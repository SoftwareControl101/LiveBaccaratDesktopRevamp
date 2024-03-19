package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest14 extends Payout implements PayoutCase {

    private final int testCase = 14;
    private double playerBet, bankerBet, payout;
    private final double payoutOdds = 30;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(12, testCaseList)) return;
        if (Helper.find(13, testCaseList)) return;

        EventHandler.click(DealerTable.BettingOption.PlayerDragonBonus);
        EventHandler.click(DealerTable.BettingOption.BankerDragonBonus);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList) &&
                !Helper.find(12, testCaseList) &&
                !Helper.find(13, testCaseList) &&
                !Helper.find(15, testCaseList) &&
                !Helper.find(16, testCaseList) &&
                !Helper.find(17, testCaseList) &&
                !Helper.find(18, testCaseList) &&
                !Helper.find(19, testCaseList)) return;

        playerBet = getChipValue(DealerTable.BettingChip.PlayerDragonBonus);
        bankerBet = getChipValue(DealerTable.BettingChip.BankerDragonBonus);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList) &&
                !Helper.find(12, testCaseList) &&
                !Helper.find(13, testCaseList) &&
                !Helper.find(15, testCaseList) &&
                !Helper.find(16, testCaseList) &&
                !Helper.find(17, testCaseList) &&
                !Helper.find(18, testCaseList) &&
                !Helper.find(19, testCaseList)) return;

        if (TestConditions.isPlayerDragonBonusDifferenceWin(roundResult, 9)) {
            payout = playerBet + (playerBet * payoutOdds);
            addWin(playerBet, payoutOdds);
        }

        if (TestConditions.isBankerDragonBonusDifferenceWin(roundResult, 9)) {
            payout = bankerBet + (bankerBet * payoutOdds);
            addWin(bankerBet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!TestConditions.isPlayerDragonBonusDifferenceWin(roundResult, 9) &&
                !TestConditions.isBankerDragonBonusDifferenceWin(roundResult, 9)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo((playerBet + bankerBet), payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

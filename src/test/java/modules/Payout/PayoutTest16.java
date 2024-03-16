package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest16 extends Payout implements PayoutCase {

    private double playerBet, bankerBet;
    private double payout;
    private final double payoutOdds = 6;
    private final int testCase = 16;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;
        if (Helper.find(12, testCaseList)) return;
        if (Helper.find(13, testCaseList)) return;
        if (Helper.find(14, testCaseList)) return;
        if (Helper.find(15, testCaseList)) return;

        EventHandler.click(DealerTable.BettingOption.PlayerDragonBonus);
        EventHandler.click(DealerTable.BettingOption.BankerDragonBonus);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;

        playerBet = getChipValue(DealerTable.BettingChip.PlayerDragonBonus);
        bankerBet = getChipValue(DealerTable.BettingChip.BankerDragonBonus);
    }

    public void computeTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;

        if (TestConditions.isPlayerDragonBonusDifferenceWin(roundResult, 7)) {
            payout = playerBet + (playerBet * payoutOdds);
            addWin(playerBet, payoutOdds);
        }

        if (TestConditions.isBankerDragonBonusDifferenceWin(roundResult, 7)) {
            payout = bankerBet + (bankerBet * payoutOdds);
            addWin(bankerBet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!TestConditions.isPlayerDragonBonusDifferenceWin(roundResult, 7) &&
                !TestConditions.isBankerDragonBonusDifferenceWin(roundResult, 7)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo((playerBet + bankerBet), payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

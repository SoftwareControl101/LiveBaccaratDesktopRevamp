package modules.Payout;

import globals.TestConditions;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.Helper;

public class PayoutTest12 extends Payout implements PayoutCase {

    private final int testCase = 12;
    private double playerBet, bankerBet, payout;
    private final double payoutOdds = 1;

    public int getTestCase() { return testCase; }

    public void setBetOption() {
        if (!Helper.find(testCase, testCaseList)) return;

        EventHandler.click(DealerTable.BettingOption.PlayerDragonBonus);
        EventHandler.click(DealerTable.BettingOption.BankerDragonBonus);
    }

    public void getBetOption() {
        if (!Helper.find(testCase, testCaseList) &&
                !Helper.find(13, testCaseList) &&
                !Helper.find(14, testCaseList) &&
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
                !Helper.find(13, testCaseList) &&
                !Helper.find(14, testCaseList) &&
                !Helper.find(15, testCaseList) &&
                !Helper.find(16, testCaseList) &&
                !Helper.find(17, testCaseList) &&
                !Helper.find(18, testCaseList) &&
                !Helper.find(19, testCaseList)) return;

        if (TestConditions.isPlayerDragonBonusNaturalWin(roundResult)) {
            payout = playerBet + (playerBet * payoutOdds);
            addWin(playerBet, payoutOdds);
        }

        if (TestConditions.isBankerDragonBonusNaturalWin(roundResult)) {
            payout = bankerBet + (bankerBet * payoutOdds);
            addWin(bankerBet, payoutOdds);
        }
    }

    public void saveTestCase(String[] roundResult) {
        if (!Helper.find(testCase, testCaseList)) return;
        if (!TestConditions.isPlayerDragonBonusNaturalWin(roundResult) &&
                !TestConditions.isBankerDragonBonusNaturalWin(roundResult)) return;

        String currentRoundResult = Helper.toString(roundResult);
        String expectedResult = getExpectedResult();
        String actualResult = getActualResult();
        String otherInfo = getOtherInfo((playerBet + bankerBet), payoutOdds, payout);
        TextFileFeature.setTestResult("Payout", testCase, 0, currentRoundResult, expectedResult, actualResult, tableInfo, otherInfo);
        testCaseList = Helper.removeFromArray(testCase, testCaseList);
    }

}

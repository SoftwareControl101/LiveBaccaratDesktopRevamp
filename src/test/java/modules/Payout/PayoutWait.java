package modules.Payout;

import pages.DealerTable;
import utilities.features.ScreenshotFeature;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.interfaces.PayoutCase;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.objects.Printer;
import utilities.objects.TestResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class PayoutWait extends Payout {

    static String[] roundResult = new String[2];
    static List<PayoutCase> payoutCaseList;
    static List<Integer> ignoreTestCase;

    public static void waitUntilWins(List<PayoutCase> payoutCases) {
        testCaseList = getTestCaseList(payoutCases);
        payoutCaseList = payoutCases;
        int round = 0;

        do {
            try {

                ignoreTestCase = new ArrayList<>();

                System.out.println();
                System.out.println("Round #" + (++round));
                System.out.println();

                setBeforeDealing();
                setRoundResult();
                setAfterDealing();

                System.out.println("    " + testCaseList.length + " Test Cases Left: " + Helper.toString(testCaseList));
                System.out.println("    " + ignoreTestCase.size() + " Ignored Test Cases: " + Helper.toString(Helper.toStringArray(ignoreTestCase)));
            } catch (Exception e) {
                Printer.printError("Failed on Round #" + round + " Due to the Following Cause: " + e.getMessage());
            }
        } while (testCaseList.length != 0);

        System.out.println();
        System.out.println("Total Rounds To Complete: " + round);
        System.out.println();
    }

    private static int[] getTestCaseList(List<PayoutCase> payoutCases) {
        Set<Integer> uniqueTestCases = payoutCases.stream()
                .map(PayoutCase::getTestCase)
                .filter(testCase -> testCase != 0)
                .collect(Collectors.toSet());
        return uniqueTestCases.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void setBeforeDealing() {
        totalWinBet = 0.0;
        totalWinResult = 0.0;
        balanceBeforeBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        System.out.println("    Balance Before Betting: " + balanceBeforeBetting);

        waitBettingPhase(20, false);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);

        processPayoutCases(PayoutCase::setBetOption);
        EventHandler.click(DealerTable.Button.Confirm);
        processPayoutCases(PayoutCase::getBetOption);
    }

    private static void setRoundResult() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);

        tableInfo = getTableName() + " " + getRoundId();
        totalBet = GetHandler.getDouble(DealerTable.Label.TotalBet);
        balanceAfterBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        System.out.println("    Balance After Betting: " + balanceAfterBetting);

        roundResult = getRoundResult();

        ScreenshotFeature.capture("rounds", tableInfo + " " + Helper.toString(roundResult));
        System.out.println("    Round Result: " + Helper.toString(roundResult));
    }

    private static void setAfterDealing() {
        processPayoutCases(payoutCase -> payoutCase.computeTestCase(roundResult));
        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);

        balanceAfterDealing = getUpdatedBalance();
        System.out.println("    Balance After Dealing: " + balanceAfterDealing);

        ScreenshotFeature.capture("balances", tableInfo + " " + Helper.toString(roundResult));

        processPayoutCases(payoutCase -> payoutCase.saveTestCase(roundResult));
    }

    private static void processPayoutCases(Consumer<PayoutCase> action) {
        for (PayoutCase payoutCase : payoutCaseList) {
            try {
                if (!ignoreTestCase.contains(payoutCase.getTestCase())) action.accept(payoutCase);
            } catch (Exception e) {
                ignoreTestCase.add(payoutCase.getTestCase());
                Printer.printError("Test Case " + payoutCase.getTestCase() + ": " + e);
            }
        }
    }

    public static void verify(int testCase) {
        TestResult result = TextFileFeature.getTestResult("Payout", testCase, 0);

        double[] expectedResult = getArrayFromExpectedResult(result.getExpectedResult());
        double[] actualResult = getArrayFromActualResult(result.getActualResult());
        double[] otherInfo = getArrayFromOtherInfo(result.getOtherInfo());

        double expectedTotalBalance = expectedResult[0];
        double expectedTotalPayout = expectedResult[1];
        double expectedTotalWinLose = expectedResult[2];
        double actualTotalBalance = actualResult[0];
        double actualTotalPayout = actualResult[1];
        double actualTotalWinLose = actualResult[2];
        double balanceBeforeBetting = otherInfo[0];
        double balanceAfterBetting = otherInfo[1];
        double balanceAfterDealing = otherInfo[2];
        double payoutOdds = otherInfo[3];
        double chipValue = otherInfo[4];
        double payout = otherInfo[5];
        double totalBet = otherInfo[6];

        System.out.println();
        System.out.println("Module: PAYOUT");
        System.out.println("Test Case: " + result.getTestCase());
        System.out.println("Table Information: " + result.getTableInfo());
        System.out.println("Round Result: " + result.getRoundResult());
        System.out.println("Bet: " + chipValue);
        System.out.println("Payout Odds: " + payoutOdds);
        System.out.println("Payout: " + payout);
        System.out.println("Total Bet: " + totalBet);
        System.out.println("Balance Before Betting: " + balanceBeforeBetting);
        System.out.println("Balance After Betting: " + balanceAfterBetting);
        System.out.println("Balance After Dealing: " + balanceAfterDealing);
        System.out.println("Expected Total Balance: " + expectedTotalBalance);
        System.out.println("Expected Total PayoutCase: " + expectedTotalPayout);
        System.out.println("Expected Total Win/Lose: " + expectedTotalWinLose);

        String balanceMessage = "Actual Total Balance: " + actualTotalBalance;
        CustomAssert.assertEquals(expectedTotalBalance, actualTotalBalance, balanceMessage, balanceMessage);

        String payoutMessage = "Actual Total PayoutCase: " + actualTotalPayout;
        CustomAssert.assertEquals(expectedTotalPayout, actualTotalPayout, payoutMessage, payoutMessage);

        String winLoseMessage = "Actual Total Win/Lose: " + actualTotalWinLose;
        CustomAssert.assertEquals(expectedTotalWinLose, actualTotalWinLose, winLoseMessage, winLoseMessage);

        System.out.println();
    }

}

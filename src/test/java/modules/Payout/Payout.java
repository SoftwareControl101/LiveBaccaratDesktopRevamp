package modules.Payout;

import globals.TestMethods;

public class Payout extends TestMethods {

    protected static int[] testCaseList;
    protected static String tableInfo;
    protected static boolean isNonCommission;
    protected static double totalWinBet, totalWinResult, totalBet, balanceBeforeBetting = 0.0, balanceAfterBetting = 0.0, balanceAfterDealing = 0.0;

    protected static void addWin(double chipValue, double payoutOdds) {
        totalWinBet += chipValue;
        totalWinResult += (chipValue * payoutOdds);
    }

    protected static String getExpectedResult() {
        double expectedTotalPayout = totalWinBet + totalWinResult;
        double expectedTotalWinLose = expectedTotalPayout - totalBet;
        double expectedTotalBalance = balanceAfterBetting + expectedTotalPayout;
        return "{" + "Expected Total Balance: " + expectedTotalBalance + "}{" +
                "Expected Total Payout: " + expectedTotalPayout + "}{" +
                "Expected Total Win/Lose: " + expectedTotalWinLose + "}";
    }

    protected static String getActualResult() {
        double actualTotalBalance = balanceAfterDealing;
        double actualTotalPayout = balanceAfterDealing - balanceAfterBetting;
        double actualTotalWinLose = actualTotalPayout - totalBet;
        return "{" + "Actual Total Balance: " + actualTotalBalance + "}{" +
                "Actual Total Payout: " + actualTotalPayout + "}{" +
                "Actual Total Win/Lose: " + actualTotalWinLose + "}";
    }

    protected static String getOtherInfo(double bet, double payoutOdds, double payout) {
        return  "{" + "Balance Before Betting: " + balanceBeforeBetting + "}{" +
                "Balance After Betting: " + balanceAfterBetting + "}{" +
                "Balance After Dealing: " + balanceAfterDealing + "}{" +
                "Payout Odds: " + payoutOdds + "}{" +
                "Bet: " + bet + "}{" +
                "Payout: " + payout + "}{" +
                "Total Bet: " + totalBet + "}";
    }

    @SuppressWarnings("all")
    protected static double[] getArrayFromExpectedResult(String expectedResult) {
        double expectedTotalBalance = 0.0;
        double expectedTotalPayout = 0.0;
        double expectedTotalWinLose = 0.0;

        expectedResult = expectedResult.substring(1, expectedResult.length() - 1);
        String[] parts = expectedResult.split("\\}\\{");
        for (String part : parts) {
            String[] keyValue = part.split(": ");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                switch (key) {
                    case "Expected Total Balance" -> expectedTotalBalance = Double.parseDouble(value);
                    case "Expected Total Payout" -> expectedTotalPayout = Double.parseDouble(value);
                    case "Expected Total Win/Lose" -> expectedTotalWinLose = Double.parseDouble(value);
                }
            }
        }
        return new double[]{expectedTotalBalance, expectedTotalPayout, expectedTotalWinLose};
    }

    @SuppressWarnings("all")
    protected static double[] getArrayFromActualResult(String actualResult) {
        double actualTotalBalance = 0.0;
        double actualTotalPayout = 0.0;
        double actualTotalWinLose = 0.0;

        actualResult = actualResult.substring(1, actualResult.length() - 1);
        String[] parts = actualResult.split("\\}\\{");

        for (String part : parts) {
            String[] keyValue = part.split(": ");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                switch (key) {
                    case "Actual Total Balance" -> actualTotalBalance = Double.parseDouble(value);
                    case "Actual Total Payout" -> actualTotalPayout = Double.parseDouble(value);
                    case "Actual Total Win/Lose" -> actualTotalWinLose = Double.parseDouble(value);
                }
            }
        }
        return new double[]{actualTotalBalance, actualTotalPayout, actualTotalWinLose};
    }

    @SuppressWarnings("all")
    protected static double[] getArrayFromOtherInfo(String otherInfo) {
        double balanceBeforeBetting = 0.0;
        double balanceAfterBetting = 0.0;
        double balanceAfterDealing = 0.0;
        double payoutOdds = 0.0;
        double chipValue = 0.0;
        double payout = 0.0;
        double totalBet = 0.0;

        otherInfo = otherInfo.substring(1, otherInfo.length() - 1);
        String[] parts = otherInfo.split("\\}\\{");
        for (String part : parts) {
            String[] keyValue = part.split(": ");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                switch (key) {
                    case "Balance Before Betting" -> balanceBeforeBetting = Double.parseDouble(value);
                    case "Balance After Betting" -> balanceAfterBetting = Double.parseDouble(value);
                    case "Balance After Dealing" -> balanceAfterDealing = Double.parseDouble(value);
                    case "Payout Odds" -> payoutOdds = Double.parseDouble(value);
                    case "Bet" -> chipValue = Double.parseDouble(value);
                    case "Payout" -> payout = Double.parseDouble(value);
                    case "Total Bet" -> totalBet = Double.parseDouble(value);
                }
            }
        }
        return new double[]{balanceBeforeBetting, balanceAfterBetting, balanceAfterDealing, payoutOdds, chipValue, payout, totalBet};
    }

}

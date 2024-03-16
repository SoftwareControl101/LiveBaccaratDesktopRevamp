package globals;

import org.openqa.selenium.WebElement;
import pages.ChipSettings;
import pages.DealerTable;
import utilities.enums.HandleCollection;
import utilities.handlers.*;
import utilities.objects.Component;
import utilities.objects.Helper;

import java.util.ArrayList;
import java.util.List;

public class TestMethods {

    /***************************************************************************************************************
     * The 'waitBettingPhase' method is used to wait for the betting phase for a duration within the timer.
     ***************************************************************************************************************/

    public static void waitBettingPhase(int specifiedTime, boolean isExact) {
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        int currentTimerValue = isExact ? 45 : -1;
        while (isExact ? (currentTimerValue != specifiedTime) : (currentTimerValue < specifiedTime))
            currentTimerValue = GetHandler.getInt(DealerTable.Label.ShowTimer, HandleCollection.WithException);
    }

    /***************************************************************************************************************
     * The 'getRoundResult' method is used to fetch the round result from the game.
     ***************************************************************************************************************/

    public static String[] getRoundResult() {
        WaitHandler.waitVisibility(DealerTable.Container.WinResult, 300);
        int[] playerCards = getCardResults(DealerTable.Container.PlayerCards);
        int[] bankerCards = getCardResults(DealerTable.Container.BankerCards);
        int playerTotal = GetHandler.getInt(DealerTable.Label.PlayerTotalPoints);
        int bankerTotal = GetHandler.getInt(DealerTable.Label.BankerTotalPoints);

        List<String> roundResults = new ArrayList<>();
        roundResults.add("P " + Helper.toString(playerCards));
        roundResults.add("B " + Helper.toString(bankerCards));
        if (TestConditions.isWin(DealerTable.BettingOption.Tie)) {
            roundResults.add(TestVariables.TIE);
            if ((playerCards.length == 2 && bankerCards.length == 2) &&
                    (playerTotal == 8 || playerTotal == 9 ) && (bankerTotal == 8 || bankerTotal == 9 ))
                roundResults.add(TestVariables.NATURAL_TIE);
        }
        if (TestConditions.isWin(DealerTable.BettingOption.Player)) {
            roundResults.add(TestVariables.PLAYER);
            if (playerCards.length == 2 && (playerTotal == 8 || playerTotal == 9 ))
                roundResults.add(TestVariables.NATURAL_WIN);
        }
        if (TestConditions.isWin(DealerTable.BettingOption.Banker)) {
            roundResults.add(TestVariables.BANKER);
            if (bankerCards.length == 2 && (bankerTotal == 8 || bankerTotal == 9 ))
                roundResults.add(TestVariables.NATURAL_WIN);
        }
        if (TestConditions.isWin(DealerTable.BettingOption.PlayerPair)) roundResults.add(TestVariables.PLAYER_PAIR);
        if (TestConditions.isWin(DealerTable.BettingOption.BankerPair)) roundResults.add(TestVariables.BANKER_PAIR);
        if (TestConditions.isWin(DealerTable.BettingOption.PlayerDragonBonus))
            roundResults.add(TestVariables.PLAYER_DRAGON_BONUS + (playerTotal - bankerTotal));
        if (TestConditions.isWin(DealerTable.BettingOption.BankerDragonBonus))
            roundResults.add(TestVariables.BANKER_DRAGON_BONUS + (bankerTotal - playerTotal));
        if (TestConditions.isWin(DealerTable.BettingOption.FortuneSix))
            roundResults.add(TestVariables.FORTUNE_SIX + bankerCards.length);

        return Helper.toStringArray(roundResults);
    }

    /***************************************************************************************************************
     * The 'getCardResults' method is used to retrieve the cards of a player and banker.
     ***************************************************************************************************************/

    public static int[] getCardResults(Component component) {
        return GetHandler.getElements(component).parallelStream()
                .mapToInt(element -> Integer.parseInt(element.getAttribute("class").split("_")[1]))
                .toArray();
    }

    /***************************************************************************************************************
     * The 'getChipValue' method is used to retrieve the value of a chip.
     ***************************************************************************************************************/

    public static int getChipValue(Component chip) {
        String chipText = GetHandler.getText(chip);
        if (chipText.endsWith("K")) return GetHandler.getInt(chip) * 1000;
        else if (chipText.endsWith("M")) return GetHandler.getInt(chip) * 1000000;
        return switch (chipText) {
            case "1" -> 1;
            case "5" -> 5;
            case "10" -> 10;
            case "25" -> 25;
            case "100" -> 100;
            case "500" -> 500;
            default -> GetHandler.getInt(chip);
        };
    }

    /***************************************************************************************************************
     * The 'getTableName' method is used to retrieve the table name within the dealer table.
     ***************************************************************************************************************/

    public static String getTableName() {
        String table = GetHandler.getText(DealerTable.Label.TableName).split(" ")[1];
        String initial = Helper.getFirstChar(table);
        return "Baccarat " + initial;
    }

    /***************************************************************************************************************
     * The 'getRoundId' method is used to retrieve the round ID within the dealer table.
     ***************************************************************************************************************/

    public static String getRoundId() {
        return GetHandler.getText(DealerTable.Label.GameId);
    }

    /***************************************************************************************************************
     * The 'getUpdatedBalance' method is used to retrieve the balance after round results.
     ***************************************************************************************************************/

    public static double getUpdatedBalance() {
        WaitHandler.wait(5);
        return GetHandler.getDouble(DealerTable.Label.BalanceValue);
    }

    /***************************************************************************************************************
     * The 'setDefaultChips' method is used to set all chips to the lowest value.
     ***************************************************************************************************************/

    public static void setDefaultChips() {
        EventHandler.click(DealerTable.Button.EditChips);
        List<WebElement> myChips = GetHandler.getElements(ChipSettings.Container.MyChips);
        for (WebElement myChip : myChips) EventHandler.click(ChipSettings.Container.MyChips, myChip);
        EventHandler.click(ChipSettings.Method.getChipSelection("1"));
        EventHandler.click(ChipSettings.Method.getChipSelection("5"));
        EventHandler.click(ChipSettings.Method.getChipSelection("10"));
        EventHandler.click(ChipSettings.Method.getChipSelection("25"));
        EventHandler.click(ChipSettings.Button.Save);
    }


}

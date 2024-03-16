package modules.Functionality;

import globals.TestMethods;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

public class Functionality extends TestMethods {

    protected static String roundId;
    protected static double oldBalance, oldBet;
    protected static String[] roundResult;

    public static void waitUntilRoundIsOver() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        roundResult = TestMethods.getRoundResult();
        waitBettingPhase(0, false);
    }

    public static void waitUntilBettingPhase() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
    }

    public static void clickTheBackButtonOnTheGame() {
        WaitHandler.wait(3);
        EventHandler.click(DealerTable.Button.Back, 2);
    }

    public static void placeABetOnAnyBettingOptions() {
        waitBettingPhase(20, false);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        roundId = getRoundId();
        oldBalance = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        EventHandler.click(DealerTable.Method.getChip("5"));
        EventHandler.click(DealerTable.BettingOption.Player);
    }

    public static void clickTheConfirmButton() {
        EventHandler.click(DealerTable.Button.Confirm, 1);
        oldBet = getChipValue(DealerTable.BettingChip.Player);
    }

}

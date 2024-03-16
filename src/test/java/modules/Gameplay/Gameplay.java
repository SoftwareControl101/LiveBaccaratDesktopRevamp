package modules.Gameplay;

import globals.TestMethods;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

public class Gameplay extends TestMethods {

    protected static double balanceBeforeBetting;

    public static void placeABetOnAnyBettingOptions() {
        waitBettingPhase(25, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        EventHandler.click(DealerTable.BettingOption.Player);
        balanceBeforeBetting = GetHandler.getDouble(DealerTable.Label.BalanceValue);
    }

    public static void placeAndConfirmAnyBettingOptions() {
        placeABetOnAnyBettingOptions();
        EventHandler.click(DealerTable.Button.Confirm);
    }

    public static void waitUntilBettingPhaseOpen() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
    }

    public static void waitUntilNewRoundStarts() {
        waitUntilBettingPhaseOpen();
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
    }

    public static void waitUntilBettingPhaseClose() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
    }

}

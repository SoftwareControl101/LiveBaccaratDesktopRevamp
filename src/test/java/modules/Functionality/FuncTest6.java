package modules.Functionality;

import pages.GameLobby;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest6 {

    static String expectedLiveGame = "Roulette";

    public static void clickTheOtherLiveGames() {
        EventHandler.click(GameLobby.Method.getLiveCasinoGame(expectedLiveGame));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 6");
        System.out.println("Other Information: " + expectedLiveGame);
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherTableLimits(expectedLiveGame), 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherDealerTables(expectedLiveGame), 5);

        System.out.println();
    }

}

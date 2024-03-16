package modules.Functionality;

import pages.GameLobby;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest7 {

    static String expectedLiveGame = "All Games";

    public static void clickTheAllGames() {
        EventHandler.click(GameLobby.Method.getLiveCasinoGame(expectedLiveGame));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 7");
        System.out.println("Other Information: " + expectedLiveGame);
        System.out.println("Actual Results: ");

        EventHandler.scroll(GameLobby.Method.getOtherTableLimits("Baccarat"));
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherTableLimits("Baccarat"), 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherDealerTables("Baccarat"), 5);

        EventHandler.scroll(GameLobby.Method.getOtherTableLimits("Roulette"));
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherTableLimits("Roulette"), 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherDealerTables("Roulette"), 5);

        EventHandler.scroll(GameLobby.Method.getOtherTableLimits("Sic Bo"));
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherTableLimits("Sic Bo"), 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Method.getOtherDealerTables("Sic Bo"), 5);

        System.out.println();
    }

}

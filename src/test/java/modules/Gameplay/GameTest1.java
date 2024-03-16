package modules.Gameplay;

import pages.DealerTable;
import pages.GameLobby;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class GameTest1 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        waitBettingPhase(20, false);
        String targetTable = getTableName();
        EventHandler.click(DealerTable.Button.Back);
        EventHandler.click(GameLobby.Method.getDealerTable(targetTable), HandleCollection.WithException);

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.PlaceYourBetsPlease, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.WelcomeAndGoodLuck, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

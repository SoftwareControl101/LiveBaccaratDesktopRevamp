package modules.Gameplay;

import pages.DealerTable;
import pages.GameLobby;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class GameTest2 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        waitBettingPhase(0, false);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        String targetTable = getTableName();
        EventHandler.click(DealerTable.Button.Back);
        EventHandler.click(GameLobby.Method.getDealerTable(targetTable), HandleCollection.WithException);

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.NoMoreBets, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.WelcomeAndGoodLuck, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Gameplay;

import pages.DealerTable;
import utilities.objects.CustomAssert;
import utilities.handlers.ConditionHandler;
import utilities.handlers.WaitHandler;

public class GameTest37 extends Gameplay {

    public static void verify() {
        System.out.println();

        byte count = 0;
        do {
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
            System.out.println("Round Count: " + (++count));
            WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        } while (count < 9);

        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 37");
        System.out.println("Actual Results: ");

        WaitHandler.wait(10);
        CustomAssert.assertTrue(ConditionHandler.isUrlContains("/gameLobby", 5),
                "** Player is on the Lobby",
                "** Player is Not on the Lobby");

        System.out.println();
    }

}
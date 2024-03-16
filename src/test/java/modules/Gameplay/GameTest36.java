package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.*;
import utilities.objects.CustomAssert;

public class GameTest36 extends Gameplay {

    public static void verify() {
        System.out.println();

        byte count = 0;
        do {
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
            System.out.println("Round Count: " + (++count));
            WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        } while (count < 8);

        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 36");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.GiveItATry, 5);
        CustomAssert.assertTrue(ConditionHandler.isUrlContains("/baccaratDesktop", 5),
                "** Player is Seated on the Current Table",
                "** Player is Not Seated on the Current Table");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.UserInterface;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class UITest4 extends UserInterface {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 4");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Container.Announcement, 5);
        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowTimer, 5);
        assertGameUI();
        assertActionButtons();

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

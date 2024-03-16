package modules.UserInterface;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;
import utilities.handlers.WaitHandler;

public class UITest5 extends UserInterface {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 5");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Container.Announcement, 5);
        WaitHandler.waitVisibility(DealerTable.Label.NoMoreBets, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.ShowDealing, 5);
        assertGameUI();

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

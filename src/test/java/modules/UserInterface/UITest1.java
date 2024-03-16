package modules.UserInterface;

import pages.LiveCasino;
import utilities.handlers.VerificationHandler;

public class UITest1 extends UserInterface {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(LiveCasino.Thumbnail.LiveBaccaratRevamp, 5);

        System.out.println();
    }

}

package modules.Functionality;

import pages.DealerTable;
import pages.Help;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest14 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 14");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(Help.Button.Basics, 5);
        VerificationHandler.verifyIfDisplayed(Help.Button.BetOptions, 5);
        VerificationHandler.verifyIfDisplayed(Help.Button.GameControls, 5);
        VerificationHandler.verifyIfDisplayed(Help.Button.Likelihood, 5);

        System.out.println();
        EventHandler.click(Help.Button.Back);
        EventHandler.click(DealerTable.Button.Back);
    }

}

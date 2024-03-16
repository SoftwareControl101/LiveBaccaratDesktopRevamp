package modules.Functionality;

import pages.DealerTable;
import pages.Help;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest16 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 16");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(Help.Button.Basics, 1);
        VerificationHandler.verifyIfNotDisplayed(Help.Button.BetOptions, 1);
        VerificationHandler.verifyIfNotDisplayed(Help.Button.GameControls, 1);
        VerificationHandler.verifyIfNotDisplayed(Help.Button.Likelihood, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Functionality;

import pages.ChipSettings;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest41 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 41");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(ChipSettings.Container.PreviousChip, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

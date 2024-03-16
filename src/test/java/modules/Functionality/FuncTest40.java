package modules.Functionality;

import pages.ChipSettings;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest40 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 40");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(ChipSettings.Container.NextChip, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

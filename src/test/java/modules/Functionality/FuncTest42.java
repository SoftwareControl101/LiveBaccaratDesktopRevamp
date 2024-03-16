package modules.Functionality;

import pages.ChipSettings;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest42 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 42");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfNotDisplayed(ChipSettings.Container.ChipSelections, 1);
        VerificationHandler.verifyIfNotDisplayed(ChipSettings.Container.MyChips, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Functionality;

import pages.DealerTable;
import pages.SwitchTable;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;

public class FuncTest28 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 28");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(SwitchTable.Container.SwitchTablePanel, 5);
        CustomAssert.assertEquals("Baccarat", GetHandler.getText(SwitchTable.Label.ActiveGameName),
                "** Default Product Baccarat is Highlighted",
                "** Default Product Baccarat is Not Highlighted");
        CustomAssert.assertTrue(ConditionHandler.isDisplayed(SwitchTable.Label.InactiveGameNames, 5),
                "** Other Live Products are Displayed",
                "** Other Live Products are Not Displayed");

        System.out.println();
        EventHandler.click(SwitchTable.Button.Close);
        EventHandler.click(DealerTable.Button.Back);
    }

}

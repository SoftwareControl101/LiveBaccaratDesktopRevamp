package modules.Functionality;

import pages.DealerTable;
import pages.TableLimit;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.objects.CustomAssert;

public class FuncTest13 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 13");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(ConditionHandler.isDisplayed(TableLimit.Method.getTableLimits(true), 5),
                "** Available Table Limits are Displayed",
                "** Available Table Limits are Not Displayed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

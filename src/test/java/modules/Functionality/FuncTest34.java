package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest34 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 34");
        System.out.println("Actual Results: ");

        String[] nonCommission = GetHandler.getTextArray(DealerTable.Label.NonCommission);
        CustomAssert.assertTrue(Helper.find("1 : 1", nonCommission),
                "** \"1 : 1\" is Displayed",
                "** \"1 : 1\" is Not Displayed");
        CustomAssert.assertTrue(Helper.find("Non Comm", nonCommission),
                "** \"Non Comm\" is Displayed",
                "** \"Non Comm\" is Not Displayed");
        CustomAssert.assertTrue(Helper.find("Banker wins 6 pay half", nonCommission),
                "** \"Banker wins 6 pay half\" is Displayed",
                "** \"Banker wins 6 pay half\" is Not Displayed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

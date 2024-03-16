package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest26 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 26");
        System.out.println("Actual Results: ");

        WaitHandler.wait(2);
        double newBalance = GetHandler.getDouble(DealerTable.Label.BalanceValue);
        CustomAssert.assertTrue(oldBalance > newBalance,
                "** Balance is Decreased: " + oldBalance + " --> " + newBalance,
                "** Balance is Not Decreased: " + oldBalance + " --> " + newBalance);

        System.out.println();
        waitUntilRoundIsOver();
        EventHandler.click(DealerTable.Button.Back);
    }

}

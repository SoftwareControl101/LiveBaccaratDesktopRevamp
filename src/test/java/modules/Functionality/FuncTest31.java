package modules.Functionality;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class FuncTest31 {

    static String oldRoundID;

    public static void checkTheRoundIdIndicator() {
        oldRoundID = GetHandler.getText(DealerTable.Label.GameId);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 31");
        System.out.println("Actual Results: ");

        String newRoundID = GetHandler.getText(DealerTable.Label.GameId);
        CustomAssert.assertNotEquals(oldRoundID, newRoundID,
                "** New Round ID is Generated: " + oldRoundID + " --> " + newRoundID,
                "** New Round ID is Not Generated: " + oldRoundID + " --> " + newRoundID);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

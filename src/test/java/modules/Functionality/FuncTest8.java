package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest8 extends Functionality {

    static String targetTable;
    static int expectedTotalCounter;

    public static void checkNumberOfDeals() {
        WaitHandler.wait(3);
        targetTable = getTableName();
        expectedTotalCounter = GetHandler.getInt(DealerTable.Label.TotalCounter);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 8");
        System.out.println("Actual Results: ");

        int actualTotalCounter = GetHandler.getInt(GameLobby.Method.getDeals(targetTable));
        CustomAssert.assertTrue(expectedTotalCounter < actualTotalCounter,
                "** The Number of Deals has Increased",
                "** The Number of Deals has Not Increased");

        System.out.println();
    }

}

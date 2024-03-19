package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.CustomAssert;

public class FuncTest1 extends Functionality {

    static String targetTable;
    static int expectedTotalCounter;

    public static void checkNumberOfDealsAndTableName() {
        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        targetTable = getTableName();
        expectedTotalCounter = GetHandler.getInt(DealerTable.Label.TotalCounter);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 1");
        System.out.println("Actual Results: ");

        int actualTotalCounter = GetHandler.getInt(GameLobby.Method.getDeals(targetTable));
        CustomAssert.assertEquals(expectedTotalCounter, actualTotalCounter,
                "** The Number of Deals at The Table and in The Lobby is Same",
                "** The Number of Deals at The Table and in The Lobby is Not Same");

        System.out.println();
    }

}

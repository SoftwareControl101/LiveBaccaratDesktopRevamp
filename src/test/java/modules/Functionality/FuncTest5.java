package modules.Functionality;

import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;

public class FuncTest5 {

    static String expectedTable;

    public static void enterAnyDealerTable() {
        do expectedTable = GetHandler.getElementByRandom(GameLobby.Label.TableNames).getText();
        while (expectedTable.contains("Speed"));
        EventHandler.click(GameLobby.Method.getDealerTable(expectedTable));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 5");
        System.out.println("Other Information: " + expectedTable);
        System.out.println("Actual Results: ");

        String tableName = GetHandler.getText(DealerTable.Label.TableName);
        CustomAssert.assertTrue(tableName.contains(expectedTable),
                "** Entered Table is Correct: " + expectedTable + " == " + tableName,
                "** Entered Table is Incorrect: " + expectedTable + " != " + tableName);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

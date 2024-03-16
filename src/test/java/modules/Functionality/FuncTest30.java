package modules.Functionality;

import org.openqa.selenium.WebElement;
import pages.DealerTable;
import pages.SwitchTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest30 {

    static String expectedTable;

    public static void enterOtherLiveGameTable() {
        EventHandler.click(SwitchTable.Button.SicBoGame, 3);
        Component tableCards = SwitchTable.Method.getTableCards(true);
        WebElement randomTable = GetHandler.getElementByRandom(tableCards);
        expectedTable = "Sic Bo " + Helper.getLastChar(randomTable.getAttribute("data-gtm").toUpperCase());
        EventHandler.click(tableCards, randomTable);
        WaitHandler.wait(3);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 30");
        System.out.println("Other Information: " + expectedTable);
        System.out.println("Actual Results: ");

        String tableName = GetHandler.getText(DealerTable.Label.TableName);
        CustomAssert.assertTrue(tableName.contains(expectedTable),
                "** Player is Seated On The Selected Table of the Other Live Game: " + tableName,
                "** Player is Not Seated On The Selected Table of the Other Live Game: " + tableName);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

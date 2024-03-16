package modules.Functionality;

import org.openqa.selenium.WebElement;
import pages.DealerTable;
import pages.SwitchTable;
import utilities.handlers.*;
import utilities.objects.Component;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest29 {

    static String expectedTable;

    public static void enterOtherTable() {
        Component tableCards = SwitchTable.Method.getTableCards(false);
        WebElement randomTable = GetHandler.getElementByRandom(tableCards);
        expectedTable = "Baccarat " + Helper.getLastChar(randomTable.getAttribute("data-gtm").toUpperCase());
        EventHandler.click(tableCards, randomTable);
        WaitHandler.wait(3);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 29");
        System.out.println("Other Information: " + expectedTable);
        System.out.println("Actual Results: ");

        String tableName = GetHandler.getText(DealerTable.Label.TableName);
        CustomAssert.assertTrue(tableName.contains(expectedTable),
                "** Player is Seated On The Selected Table: " + tableName,
                "** Player is Not Seated On The Selected Table: " + tableName);

        CustomAssert.assertFalse(ConditionHandler.isDisplayed(SwitchTable.Container.SwitchTablePanel, 1),
                "** Switch Table is Closed",
                "** Switch Table is Not Closed");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Gameplay;

import pages.DealerTable;
import pages.TableLimit;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class GameTest49 extends Gameplay {

    private static String expectedTableLimit;

    public static void clickAnyTableLimitAvailable() {
        Component tableLimits = TableLimit.Method.getTableLimits(false);
        WaitHandler.waitVisibility(tableLimits, 15);
        expectedTableLimit = GetHandler.getElementByRandom(tableLimits).getText();
        EventHandler.click(TableLimit.Method.getTableLimit(expectedTableLimit));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 49");
        System.out.println("Actual Results: ");

        WaitHandler.wait(3);
        EventHandler.click(DealerTable.Button.TableLimit);
        WaitHandler.waitVisibility(TableLimit.Method.getTableLimits(true), 15);
        String actualTableLimit = GetHandler.getText(TableLimit.Button.ActiveTableLimit);

        CustomAssert.assertEquals(expectedTableLimit, actualTableLimit,
                expectedTableLimit +" Table Limit is Highlighted",
                expectedTableLimit +" Table Limit is Not Highlighted");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

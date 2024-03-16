package modules.Functionality;

import org.openqa.selenium.WebElement;
import pages.GameLobby;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class FuncTest3 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 3");
        System.out.println("Actual Results: ");

        Component tableLimits = GameLobby.Button.TableLimits;
        Component tableNames = GameLobby.Label.TableNames;
        for (WebElement tableLimit : GetHandler.getElements(tableLimits)) {
            EventHandler.click(tableLimits, tableLimit);
            CustomAssert.assertTrue(ConditionHandler.isDisplayed(tableNames, 5),
                    "** Table Limit " + tableLimit.getText() + " : " + GetHandler.getElements(tableNames).size(),
                    "** Table Limit " + tableLimit.getText() + " : " + 0);
        }

        System.out.println();
    }

}

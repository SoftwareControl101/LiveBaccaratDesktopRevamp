package modules.Gameplay;

import org.openqa.selenium.WebElement;
import pages.DealerTable;
import pages.GameLobby;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Component;

import java.util.List;

public class GameTest38 extends Gameplay {

    public static void clickTheHighTableLimits() {
        Component tableLimits = GameLobby.Button.TableLimits;
        List<WebElement> tables = GetHandler.getElements(tableLimits);
        EventHandler.click(tableLimits, tables.get(tables.size() - 1));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 38");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(GetHandler.getText(DealerTable.Button.Confirm).contains("Top Up Confirm"),
                "** \"Confirm\" Button is Changed to \"Top Up Confirm\"",
                "** \"Confirm\" Button is Not Changed to \"Top Up Confirm\"");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }


}

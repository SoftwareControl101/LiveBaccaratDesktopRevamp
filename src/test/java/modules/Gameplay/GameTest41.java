package modules.Gameplay;

import org.openqa.selenium.WebElement;
import pages.DealerTable;
import pages.TableLimit;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Component;

import java.util.List;

public class GameTest41 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 41");
        System.out.println("Actual Results: ");

        EventHandler.click(DealerTable.Button.TableLimit);
        WaitHandler.waitVisibility(TableLimit.Method.getTableLimits(true), 15);
        String[] tableLimits = GetHandler.getTextArray(TableLimit.Method.getTableLimits(true));
        EventHandler.click(DealerTable.Button.TableLimit);

        for (String tableLimit : tableLimits) {
            WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
            EventHandler.click(DealerTable.Button.TableLimit);
            EventHandler.click(TableLimit.Method.getTableLimit(tableLimit));
            WaitHandler.wait(3);
            System.out.println("Table Limit: " + GetHandler.getText(DealerTable.Button.TableLimit));
            waitBettingPhase(20, false);
            Component chips = DealerTable.Button.ChipOptions;
            List<WebElement> chiptList = GetHandler.getElements(chips);
            for (WebElement chip : chiptList) {
                String expectedChipValue = chip.getText();
                EventHandler.click(chips, chip);
                EventHandler.click(DealerTable.BettingOption.Player);
                String actualChipValue = GetHandler.getText(DealerTable.BettingChip.Player);
                CustomAssert.assertEquals(expectedChipValue, actualChipValue,
                        "** \"" + expectedChipValue + "\" Chip is Placed",
                        "** \"" + expectedChipValue + "\" Chip is Not Placed");
                EventHandler.click(DealerTable.Button.Undo);
            }
        }

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Gameplay;

import org.openqa.selenium.WebElement;
import pages.ChipSettings;
import pages.DealerTable;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.Component;

public class GameTest45 extends Gameplay {

    private static String[] expectedChips = new String[4];

    public static void selectAndRemoveAnyChipToSelectedChips() {
        Component myChips = ChipSettings.Container.MyChips;
        expectedChips = GetHandler.getTextArray(myChips);
        for (WebElement chip : GetHandler.getElements(myChips)) EventHandler.click(myChips, chip);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 45");
        System.out.println("Actual Results: ");

        String[] actualChips = GetHandler.getTextArray(ChipSettings.Container.ChipSelections);
        for (String expectedChip : expectedChips) {
            CustomAssert.assertTrue(Helper.find(expectedChip, actualChips),
                    "Removed " + expectedChip + " Chip is Transferred to Available Chips",
                    "Removed " + expectedChip + " Chip is Not Transferred to Available Chips");
        }

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

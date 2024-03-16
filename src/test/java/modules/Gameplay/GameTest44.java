package modules.Gameplay;

import org.openqa.selenium.WebElement;
import pages.ChipSettings;
import pages.DealerTable;
import utilities.enums.HandleCollection;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Component;
import utilities.objects.Helper;

public class GameTest44 extends Gameplay {

    private static String[] expectedChips = new String[4];

    public static void selectAndAddAnyChipToSelectedChips() {
        Component myChips = ChipSettings.Container.MyChips;
        for (WebElement chip : GetHandler.getElements(myChips)) EventHandler.click(myChips, chip);
        for (int i = 0; i < 4; i++) EventHandler.click(ChipSettings.Container.ChipSelections, HandleCollection.WithScroll);
        expectedChips = GetHandler.getTextArray(myChips);
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 44");
        System.out.println("Actual Results: ");

        String[] actualChips = GetHandler.getTextArray(ChipSettings.Container.MyChips);
        CustomAssert.assertTrue(Helper.isEqual(expectedChips, actualChips),
                "Added Chips is Transferred to Selected Chips",
                "Added Chips is Not Transferred to Selected Chips");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

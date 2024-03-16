package modules.Functionality;

import pages.ChipSettings;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest44 extends Functionality {

    private static String[] oldMyChips = new String[4];

    public static void changeAnyChipOnMyChips() {
        oldMyChips = GetHandler.getTextArray(ChipSettings.Container.MyChips);
        EventHandler.click(ChipSettings.Method.getMyChip("25"));
        EventHandler.click(ChipSettings.Method.getChipSelection("50"));
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 44");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(DealerTable.Label.RememberedChipSettings, 5);
        waitUntilBettingPhase();
        String[] newMyChips = GetHandler.getTextArray(DealerTable.Button.ChipOptions);
        CustomAssert.assertFalse(Helper.isEqual(oldMyChips, newMyChips),
                "** My Chips is Changed: " + Helper.toString(oldMyChips) + " --> " + Helper.toString(newMyChips),
                "** My Chips is Not Changed: " + Helper.toString(oldMyChips) + " --> " + Helper.toString(newMyChips));

        System.out.println();
        setDefaultChips();
        EventHandler.click(DealerTable.Button.Back);
    }

}

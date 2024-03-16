package modules.Functionality;

import pages.LiveCasino;
import utilities.handlers.ConditionHandler;
import utilities.handlers.NavigationHandler;
import utilities.objects.CustomAssert;

public class FuncTest4 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 4");
        System.out.println("Actual Results: ");

        CustomAssert.assertFalse(ConditionHandler.isUrlContains("/gameLobby", 5) ||
                        ConditionHandler.isUrlContains("/baccaratDesktop", 5),
                "** Live Baccarat Revamp is Close",
                "** Live Baccarat Revamp is Not Close");

        NavigationHandler.switchBackToMainWindow();

        CustomAssert.assertTrue(ConditionHandler.isDisplayed(LiveCasino.Thumbnail.LiveBaccaratRevamp, 5),
                "** Player is Back to Live Casino Page",
                "** Player is Not Back to Live Casino Page");

        System.out.println();
    }

}

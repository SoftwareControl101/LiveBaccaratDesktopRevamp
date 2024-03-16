package modules.Functionality;

import pages.DealerTable;
import pages.MyBets;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest24 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 24");
        System.out.println("Actual Results: ");

        String[] roundIDs = GetHandler.getTextArray(MyBets.Label.RoundId, HandleCollection.WithScroll);
        CustomAssert.assertTrue(Helper.contains(roundId, roundIDs),
                "** Currently Settled Game is Displayed: " + roundId,
                "** Currently Settled Game is Not Displayed: " + roundId);

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(DealerTable.Button.Back);
    }

}

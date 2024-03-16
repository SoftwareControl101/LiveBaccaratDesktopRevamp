package modules.Functionality;

import pages.DealerTable;
import pages.MyBets;
import utilities.enums.HandleCollection;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class FuncTest23 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 23");
        System.out.println("Actual Results: ");

        String[] roundIDs = GetHandler.getTextArray(MyBets.Label.RoundId);

        CustomAssert.assertTrue(Helper.contains(roundId, roundIDs),
                "** Currently Running Game is Displayed: " + roundId,
                "** Currently Running Game is Not Displayed: " + roundId);

        System.out.println();
        EventHandler.click(100, 100);
        waitUntilRoundIsOver();
        EventHandler.click(DealerTable.Button.Back);
    }

}

package modules.Functionality;

import pages.GameLobby;
import utilities.handlers.ConditionHandler;
import utilities.handlers.GetHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class FuncTest25 {

    public static void verify(boolean isClick) {
        Component balanceText = GameLobby.Label.BalanceText;
        String currentBalance = GetHandler.getText(balanceText);

        if(isClick) {

            System.out.println();
            System.out.println("Module: FUNCTIONALITY");
            System.out.println("Test Case: 25");
            System.out.println("Actual Results: ");

            CustomAssert.assertTrue(ConditionHandler.isDisplayed(balanceText, 5) && currentBalance.length() == 3,
                    "** Currency is Displayed: " + currentBalance,
                    "** Currency is Not Displayed: " + currentBalance);

            CustomAssert.assertFalse(ConditionHandler.isDisplayed(GameLobby.Label.BalanceValue, 5),
                    "** Balance is Hidden When Click: " + currentBalance,
                    "** Balance is Not Hidden When Click: " + currentBalance);

        } else {

            CustomAssert.assertTrue(ConditionHandler.isDisplayed(GameLobby.Label.BalanceValue, 5),
                    "** Balance is Displayed When Re-click: " + currentBalance,
                    "** Balance is Not Displayed When Re-click: " + currentBalance);

            System.out.println();

        }
    }

}

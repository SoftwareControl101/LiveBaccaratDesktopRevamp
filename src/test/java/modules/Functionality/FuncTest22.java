package modules.Functionality;

import pages.DealerTable;
import pages.MyBets;
import utilities.handlers.ConditionHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest22 extends Functionality {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 22");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(MyBets.Label.MyBets, 5);
        VerificationHandler.verifyIfDisplayed(MyBets.TabMenu.Settled, 5);
        VerificationHandler.verifyIfDisplayed(MyBets.TabMenu.Running, 5);
        if (ConditionHandler.isDisplayed(MyBets.Container.HistoryCards, 5))
            VerificationHandler.verifyIfDisplayed(MyBets.Label.Total, 5);
        else
            VerificationHandler.verifyIfDisplayed(MyBets.Label.DefaultTotal, 5);
        VerificationHandler.verifyIfDisplayed(MyBets.Label.Message, 5);

        System.out.println();
        EventHandler.click(100, 100);
        EventHandler.click(DealerTable.Button.Back);
    }

}

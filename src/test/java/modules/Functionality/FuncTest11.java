package modules.Functionality;

import modules.Gameplay.Gameplay;
import pages.DealerTable;
import pages.LimitsAndPayouts;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest11 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 11");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.Container.Payout, 5);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

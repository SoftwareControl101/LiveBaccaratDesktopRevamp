package modules.Functionality;

import modules.Gameplay.Gameplay;
import pages.DealerTable;
import pages.LimitsAndPayouts;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class FuncTest10 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 10");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.TabMenu.BetLimit, 5);
        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.TabMenu.Payout, 5);
        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.Container.BetLimit, 5);
        VerificationHandler.verifyIfNotDisplayed(LimitsAndPayouts.Container.Payout, 1);

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

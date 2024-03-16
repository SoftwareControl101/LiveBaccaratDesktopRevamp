package modules.Gameplay;

import pages.DealerTable;
import pages.LimitsAndPayouts;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;
import utilities.objects.CustomAssert;

public class GameTest48 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 48");
        System.out.println("Actual Results: ");

        Component betLimitTabMenu = LimitsAndPayouts.TabMenu.BetLimit;
        EventHandler.click(betLimitTabMenu);

        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.Container.BetLimit, 5);
        CustomAssert.assertFalse(GetHandler.getAttribute(LimitsAndPayouts.Container.LimitPayout, "class").contains("RightOpen"),
                betLimitTabMenu.getName() + " Tab Menu is Highlighted",
                betLimitTabMenu.getName() + " Tab Menu is Not Highlighted");

        Component payoutTabMenu = LimitsAndPayouts.TabMenu.Payout;
        EventHandler.click(payoutTabMenu);

        VerificationHandler.verifyIfDisplayed(LimitsAndPayouts.Container.Payout, 5);
        CustomAssert.assertTrue(GetHandler.getAttribute(LimitsAndPayouts.Container.LimitPayout, "class").contains("RightOpen"),
                payoutTabMenu.getName() + " Tab Menu is Highlighted",
                payoutTabMenu.getName() + " Tab Menu is Not Highlighted");

        System.out.println();
        EventHandler.click(DealerTable.Button.Back);
    }

}

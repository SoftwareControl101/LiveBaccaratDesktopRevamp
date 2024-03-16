package modules.Gameplay;

import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.handlers.VerificationHandler;

public class GameTest35 extends Gameplay {

    public static void verify(boolean isClick) {
        if(isClick) {

            System.out.println();
            System.out.println("Module: GAMEPLAY");
            System.out.println("Test Case: 35");
            System.out.println("Actual Results: ");

            VerificationHandler.verifyIfContained(DealerTable.Container.Commission, "data-gtm", "Off", "On The Right Side");

        } else {

            VerificationHandler.verifyIfContained(DealerTable.Container.Commission, "data-gtm", "On", "On The Left Side");

            System.out.println();
            EventHandler.click(DealerTable.Button.Back);

        }
    }

}

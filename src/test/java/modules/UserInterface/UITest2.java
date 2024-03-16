package modules.UserInterface;

import utilities.objects.CustomAssert;
import utilities.handlers.ConditionHandler;

public class UITest2 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 2");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(ConditionHandler.isUrlContains("/gameLobby", 15),
                "** Live Roulette Revamp is Launched",
                "** Live Roulette Revamp is Not Launched");

        System.out.println();
    }

}

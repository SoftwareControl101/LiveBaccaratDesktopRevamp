package modules.Functionality;

import utilities.handlers.ConditionHandler;
import utilities.objects.CustomAssert;

public class FuncTest9 {

    public static void verify() {
        System.out.println();
        System.out.println("Module: FUNCTIONALITY");
        System.out.println("Test Case: 9");
        System.out.println("Actual Results: ");

        CustomAssert.assertTrue(ConditionHandler.isUrlContains("/gameLobby", 5),
                "** Player is Back to Game Lobby",
                "** Player is Not Back to Game Lobby");

        System.out.println();
    }

}

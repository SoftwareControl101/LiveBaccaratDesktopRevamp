package modules.Gameplay;

import pages.GameLobby;
import pages.MyBets;
import utilities.handlers.*;
import utilities.objects.CustomAssert;
import utilities.objects.Helper;

public class GameTest42 extends Gameplay {

    private static String roundId, tableName;

    public static void checkTheRoundId() {
        tableName = getTableName();
        roundId = getRoundId();
    }

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 42");
        System.out.println("Actual Results: ");

        WaitHandler.waitVisibility(GameLobby.Method.getShowDealing(tableName), 300);
        WaitHandler.waitVisibility(GameLobby.Method.getShowTimer(tableName), 300);

        EventHandler.click(GameLobby.Button.MyBets);
        String[] roundIds = GetHandler.getTextArray(MyBets.Label.RoundId);

        CustomAssert.assertFalse(Helper.find(roundId, roundIds),
                "Round ID is Not Accepted",
                "Round ID is Accepted");

        System.out.println();
    }

}
package modules.Gameplay;

import pages.DealerTable;
import pages.SwitchTable;
import utilities.enums.HandleCollection;
import utilities.handlers.VerificationHandler;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;

import java.util.Objects;

public class GameTest43 extends Gameplay {

    public static void verify() {
        System.out.println();
        System.out.println("Module: GAMEPLAY");
        System.out.println("Test Case: 43");
        System.out.println("Actual Results: ");

        EventHandler.click(DealerTable.Button.SwitchTable);
        WaitHandler.waitVisibility(SwitchTable.Method.getTableCards(true), 15);
        String[] tableNames = GetHandler.getTextArray(SwitchTable.Label.TableNames, HandleCollection.WithScroll);
        EventHandler.click(SwitchTable.Button.Close);

        for (String tableName : Objects.requireNonNull(tableNames)) {
            EventHandler.click(DealerTable.Button.SwitchTable);
            EventHandler.click(SwitchTable.Method.getTableCard(tableName));
            WaitHandler.wait(3);
            System.out.println("Table Name: " + tableName);
            waitBettingPhase(20, false);
            WaitHandler.wait(1);
            EventHandler.click(DealerTable.BettingOption.Player);
            EventHandler.click(DealerTable.Button.Confirm);
            WaitHandler.wait(3);
            VerificationHandler.verifyIfDisplayed(DealerTable.BettingChip.Player, 5);
            VerificationHandler.verifyIfContained(DealerTable.Container.PlayerBettingChip, "class", "confirm", "Confirmed");
        }

        System.out.println();
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
        EventHandler.click(DealerTable.Button.Back);
    }

}

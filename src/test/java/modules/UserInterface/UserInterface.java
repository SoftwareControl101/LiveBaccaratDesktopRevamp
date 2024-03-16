package modules.UserInterface;

import globals.TestVariables;
import globals.TestMethods;
import pages.DealerTable;
import utilities.handlers.VerificationHandler;
import utilities.objects.Component;

public class UserInterface extends TestMethods {

    protected static void assertGameUI() {
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Back, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.TableName, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.GameId, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.LimitsPayout, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.TableLimit, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.TotalBet, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.FullScreen, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Video, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Music, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Voice, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.MyBets, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Help, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.HideShowBalance, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.BalanceText, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.User, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.SwitchTable, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.PlayerCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.BankerCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.TieCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.PlayerPairCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.BankerPairCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Label.TotalCounter, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Commission, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.RedPrediction, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.BluePrediction, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Container.BeadRoadMap, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Container.BigRoadMap, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Container.BigEyeRoadMap, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Container.SmallRoadMap, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Container.CockroachRoadMap, 5);
        for (Component bettingOption : TestVariables.ALL_BET_OPTIONS) VerificationHandler.verifyIfDisplayed(bettingOption, 5);
        VerificationHandler. verifyIfDisplayed(DealerTable.Container.PlayerSeats, 5);
    }

    protected static void assertActionButtons() {
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.EditChips, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.ChipOptions, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Undo, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Cancel, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Double, 5);
        VerificationHandler.verifyIfDisplayed(DealerTable.Button.Confirm, 5);
    }

}

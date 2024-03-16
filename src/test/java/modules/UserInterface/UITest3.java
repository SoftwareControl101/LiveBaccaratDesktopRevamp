package modules.UserInterface;

import pages.GameLobby;
import utilities.handlers.VerificationHandler;

public class UITest3 extends UserInterface {

    public static void verify() {
        System.out.println();
        System.out.println("Module: USER INTERFACE");
        System.out.println("Test Case: 3");
        System.out.println("Actual Results: ");

        VerificationHandler.verifyIfDisplayed(GameLobby.Button.Back, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.DateTime, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.FullScreen, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.MyBets, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.Help, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.HideShowBalance, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.BalanceText, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.HideShowBalance, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.User, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.InGameName, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.Baccarat, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.TableLimits, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Button.LiveCasinoGames, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Container.DealerTables, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Container.DealerPhotos, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.DealerNames, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Label.TableNames, 5);
        VerificationHandler.verifyIfDisplayed(GameLobby.Container.RoadMaps, 5);

        System.out.println();
    }

}

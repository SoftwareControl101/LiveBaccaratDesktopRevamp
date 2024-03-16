package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DealerTable;
import pages.GameLobby;
import pages.LiveCasino;
import pages.Login;
import utilities.enums.HandleCollection;
import utilities.handlers.*;
import utilities.interfaces.Navigator;
import utilities.objects.Component;
import utilities.objects.Printer;
import settings.AccountManager;

public class NavigationSteps {

    @Given("I Go To The Live Casino")
    public void iGoToTheLiveCasino() {
        Navigator navigator = () -> {
            NavigationHandler.goToWebsite();
            EventHandler.click(Login.Button.Language);
            EventHandler.click(Login.Button.English);
            WaitHandler.wait(5);
            EventHandler.sendKeys(Login.TextBox.Username, AccountManager.getUsername());
            EventHandler.sendKeys(Login.TextBox.Password, AccountManager.getPassword());
            EventHandler.click(Login.Button.SignIn);
            WaitHandler.wait(5);
            EventHandler.click(Login.TabMenu.LiveCasino);
        };
        retrySteps(navigator, "Go To The Live Casino.");
    }

    @When("I Join Live Baccarat Revamp")
    public void iJoinLiveBaccaratRevamp() {
        Navigator navigator = () -> {
            EventHandler.click(LiveCasino.Thumbnail.LiveBaccaratRevamp);
            NavigationHandler.switchToAnotherWindow();
            WaitHandler.wait(5);
            if (ConditionHandler.isUrlContains("/baccaratDesktop", 5))
                EventHandler.click(DealerTable.Button.Back, HandleCollection.WithException);
            WaitHandler.waitUrlContains("/gameLobby", 5);
        };
        retrySteps(navigator, "Go To Live Baccarat Revamp.");
    }

    @When("I Enter The Dealer Table")
    public void iEnterTheDealerTable() {
        Navigator navigator = () -> {
            Component dealerTables = GameLobby.Method.getDealerTables();
            EventHandler.click(dealerTables, GetHandler.getElementByRandom(dealerTables));
        };
        retrySteps(navigator, "Enter The Dealer Table.");
    }

    @When("I Check The Round Result")
    public void iCheckTheRoundResult() {
        NavigationHandler.goToWebsite();
    }

    private void retrySteps(Navigator navigator, String description) {
        byte count = 0;
        boolean isError = true;
        do {
            try {
                if (count > 0) NavigationHandler.refresh();
                navigator.execute();
                isError = false;
            } catch (Exception e) {
                Printer.printWarning((++count) + " Failed Attempt To " + description);
                if (count == 5) throw e;
            }
        } while (isError);
    }

}
package steps.BetInformation;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.BetInformation.*;
import pages.BetDetails;
import pages.DealerTable;
import utilities.handlers.EventHandler;

public class Steps {


    @When("I Place Bet On {string} Betting Option Until {string}")
    public void iPlaceBetOnBettingOptionUntil(String bettingOption, String result) {
        switch (result) {
            case "Win" -> BetInfoTest1.placeBetUntilWin();
            case "Lose" -> BetInfoTest2.placeBetUntilLose();
            case "Tie" -> {
                switch (bettingOption) {
                    case "Player Or Banker" -> BetInfoTest3.placeBetUntilTie();
                    case "Tie" -> BetInfoTest4.placeBetUntilTie();
                    case "Main And Side" -> BetInfoTest5.placeBetUntilTie();
                }
            }
        }
    }


    @When("I Place Bet On Any Betting Option Until {string}")
    public void iPlaceBetOnAnyBettingOptionUntil(String step) {
        switch (step) {
            case "Win On Player Or Banker" -> BetInfoTest1.placeBetUntilWin();
            case "Lose On Player Or Banker" -> BetInfoTest2.placeBetUntilLose();
            case "Tie On Player Or Banker" -> BetInfoTest3.placeBetUntilTie();
        }
    }

    @When("I Go To My Bets")
    public void iGoToMyBets() {
        EventHandler.click(DealerTable.Button.MyBets);
    }

    @When("I Click Bet Details")
    public void iClickBetDetails() {
        BetInformation.clickBetDetails();
    }

    @Then("I Verify The Bet Details Information With {string}")
    public void iVerifyTheBetDetailsInformationWith(String step) {
        switch (step) {
            case "Win Result When Placed Bet On Player Or Banker" -> BetInfoTest1.verify();
            case "Lose Result When Placed Bet On Player Or Banker" -> BetInfoTest2.verify();
            case "Tie Result When Placed Bet On Player Or Banker" -> BetInfoTest3.verify();
            case "Tie Result When Placed Bet On Tie" -> BetInfoTest4.verify();
            case "Tie Result When Placed Bet On Main And Side" -> BetInfoTest5.verify();
        }

        EventHandler.click(BetDetails.Button.Back);
        EventHandler.click(100, 100);
        EventHandler.click(DealerTable.Button.Back);
    }

}

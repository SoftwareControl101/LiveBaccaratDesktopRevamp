package steps.Gameplay;

import globals.TestMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.Gameplay.*;
import pages.DealerTable;
import utilities.handlers.EventHandler;
import utilities.objects.Printer;
import utilities.handlers.WaitHandler;

public class Steps {

    @When("Wait {string}")
    public void iWait(String step) {
        switch (step) {
            case "Until New Round Starts" -> Gameplay.waitUntilNewRoundStarts();
            case "Until Timer Less Than 10 Seconds" -> WaitHandler.waitVisibility(DealerTable.Container.RedTimer, 300);
            case "Until Timer Reaches 10 Seconds" -> TestMethods.waitBettingPhase(10, true);
            case "Until Dealing Phase" -> WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
            case "Until Betting Phase" -> WaitHandler.waitVisibility(DealerTable.Label.ShowTimer, 900);
            case "Until Betting Phase Close" -> Gameplay.waitUntilBettingPhaseClose();
            case "Until Betting Phase Open" -> Gameplay.waitUntilBettingPhaseOpen();
            case "Until Player Wins" -> Printer.printInfo("Test Case 27 - Wait Step Is Included In Verify Step");
            case "Until Player Loses" -> Printer.printInfo("Test Case 28 - Wait Step Is Included In Verify Step");
            case "Until Player Or Banker Has 10 Of Face Cards" -> Printer.printInfo("Test Case 34 - Wait Step Is Included In Verify Step");
        }
    }

    @When("Place {string}")
    public void iPlace(String step) {
        switch (step) {
            case "A Bet On Each Betting Option" -> Printer.printInfo("Test Case 9 - Place Step Is Included In Verify Step");
            case "And Confirm Any Betting Options" -> Gameplay.placeAndConfirmAnyBettingOptions();
            case "A Bet Again" -> Printer.printInfo("Test Case 10 - Place Step Is Included In Verify Step");
            case "A Bet On Any Betting Options" -> Gameplay.placeABetOnAnyBettingOptions();
            case "Each Chips On All Table Limits" -> Printer.printInfo("Test Case 41 - Place Step Is Included In Verify Step");
            case "And Confirm Bets On Multiple Table" -> Printer.printInfo("Test Case 43 - Place Step Is Included In Verify Step");
        }
    }

    @When("Click {string}")
    public void iClick(String step) {
        switch (step) {
            case "The Commission And Non-Commission Button" -> EventHandler.click(DealerTable.Button.Commission, 2);
            case "The High Table Limits" -> GameTest38.clickTheHighTableLimits();
            case "The Back Button" -> EventHandler.click(DealerTable.Button.Back);
            case "The Edit Chips Button" -> EventHandler.click(DealerTable.Button.EditChips);
            case "The Limits & Payouts Button" -> EventHandler.click(DealerTable.Button.LimitsPayout);
            case "Bet Limit Or Payout Tab" -> Printer.printInfo("Test Case 48 - Click Step Is Included In Verify Step");
            case "The Table Limit Button" -> EventHandler.click(DealerTable.Button.TableLimit);
            case "Any Table Limit Available" -> GameTest49.clickAnyTableLimitAvailable();
        }
    }

    @When("Do {string}")
    public void iDo(String step) {
        switch (step) {
            case "Not Bet For 8 Consecutive Rounds" -> Printer.printInfo("Test Case 36 - Do Step Is Included In Verify Step");
            case "Not Bet For 9 Consecutive Rounds" -> Printer.printInfo("Test Case 37 - Do Step Is Included In Verify Step");
            case "Select And Add Any Chip To Selected Chips" -> GameTest44.selectAndAddAnyChipToSelectedChips();
            case "Select And Remove Any Chip To Selected Chips" -> GameTest45.selectAndRemoveAnyChipToSelectedChips();
        }
    }

    @And("Check {string}")
    public void iCheck(String step) {
        switch (step) {
            case "The Round ID" -> GameTest42.checkTheRoundId();
            case "" -> System.out.println();
        }
    }

    @Then("Verify {string}")
    public void iVerify(String step) {
        switch (step) {
            case "The Behavior Of The Game When Entered Table While Betting Phase" -> GameTest1.verify();
            case "The Behavior Of The Game When Entered Table While Dealing Phase" -> GameTest2.verify();
            case "The Behavior Of The Game When New Round Started" -> GameTest8.verify();
            case "The Behavior Of The Game When Placed Bet On Each Betting Options" -> GameTest9.verify();
            case "The Behavior Of The Game When When Placed Bets After Confirmed Bets" -> GameTest10.verify();
            case "The Behavior Of The Game When Not Confirmed Bet And Timer Less Than 10 Seconds" -> GameTest11.verify();
            case "The Behavior Of The Betting Timer When It Reaches 10 Seconds" -> GameTest12.verify();
            case "The Behavior Of The Game During Dealing Phase" -> GameTest13.verify();
            case "The Behavior Of The Game During Betting Phase" -> GameTest14.verify();
            case "The Behavior Of The Game When Placed Bet And Betting Phase Closed" -> GameTest22.verify();
            case "The Behavior Of The Game When Betting Phase Closed" -> GameTest23.verify();
            case "The Behavior Of The Game When Betting Phase Opened" -> GameTest24.verify();
            case "The Behavior Of The Game When Player Wins" -> GameTest27.verify();
            case "The Behavior Of The Game When Player Loses" -> GameTest28.verify();
            case "The Behavior Of The Game When Player Or Banker Has 10 Or Face Cards" -> GameTest34.verify();
            case "The Behavior Of The Commission And Non-Commission Button When Clicked" -> GameTest35.verify(true);
            case "The Behavior Of The Commission And Non-Commission Button When Re-clicked" -> GameTest35.verify(false);
            case "The Behavior Of The Game When Did Not Bet For 8 Rounds" -> GameTest36.verify();
            case "The Behavior Of The Game When Did Not Bet For 9 Rounds" -> GameTest37.verify();
            case "The Behavior Of The Game When Placed Minimum Bet On Any Betting Options" -> GameTest38.verify();
            case "The Behavior Of The Chips When Placed Each Chips On All Table Limits" -> GameTest41.verify();
            case "The Behavior Of The Game When Placed Bet And Exit The Table" -> GameTest42.verify();
            case "The Behavior Of The Game When Placed And Confirmed Bets On Multiple Table" -> GameTest43.verify();
            case "The Behavior Of The Game When Added Chips To Selected Chips" -> GameTest44.verify();
            case "The Behavior Of The Game When Removed Chips To Selected Chips" -> GameTest45.verify();
            case "The Behavior Of The Game When Clicked Bet Limit Or Payout Tab Menu" -> GameTest48.verify();
            case "The Behavior Of The Game When Selected Any Available Table Limit" -> GameTest49.verify();
            case "The Behavior Of The Confirm Button After Betting A Round" -> GameTest54.verify();
        }
    }

}
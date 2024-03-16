package steps.Functionality;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.Functionality.*;
import pages.*;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Printer;

public class Steps {

    @When("I Check {string}")
    public void iCheck(String step) {
        switch (step) {
            case "The Number Of Deals And Table Name" -> FuncTest1.checkNumberOfDealsAndTableName();
            case "The Number Of Deals" -> FuncTest8.checkNumberOfDeals();
            case "The Round ID Indicator" -> FuncTest31.checkTheRoundIdIndicator();
        }
    }

    @When("I Click {string}")
    public void iClick(String step) {
        switch (step) {
            case "The Show/Hide Balance Button On The Lobby" -> EventHandler.click(GameLobby.Button.HideShowBalance, 2);
            case "On Each Table Limit" -> Printer.printInfo("Test Case 3 - Click Step Is Included In Verify Step");
            case "The Back Button On The Lobby" -> EventHandler.click(GameLobby.Button.Back);
            case "The Other Live Games" -> FuncTest6.clickTheOtherLiveGames();
            case "The All Games" -> FuncTest7.clickTheAllGames();
            case "The Back Button On The Game" -> Functionality.clickTheBackButtonOnTheGame();
            case "The Limits & Payouts" -> EventHandler.click(DealerTable.Button.LimitsPayout);
            case "The Payout Tab" -> EventHandler.click(LimitsAndPayouts.TabMenu.Payout);
            case "The Bet Limit Tab" -> EventHandler.click(LimitsAndPayouts.TabMenu.BetLimit);
            case "The Table Limit Button" -> EventHandler.click(DealerTable.Button.TableLimit);
            case "The Help" -> EventHandler.click(DealerTable.Button.Help);
            case "On Each Category In Help" -> Printer.printInfo("Test Case 15 - Click Step Is Included In Verify Step");
            case "The Back Button On The Help" -> EventHandler.click(Help.Button.Back, 2);
            case "The Confirm Button" -> Functionality.clickTheConfirmButton();
            case "The My Bets" -> EventHandler.click(DealerTable.Button.MyBets);
            case "The Running Tab" -> EventHandler.click(MyBets.TabMenu.Running);
            case "The Settled Tab" -> EventHandler.click(MyBets.TabMenu.Settled);
            case "The Show/Hide Balance Button On The Game" -> EventHandler.click(DealerTable.Button.HideShowBalance, 2);
            case "The Switch Table Button" -> EventHandler.click(DealerTable.Button.SwitchTable);
            case "The Player Prediction Button" -> EventHandler.click(DealerTable.Button.BluePrediction);
            case "The Banker Prediction Button" -> EventHandler.click(DealerTable.Button.RedPrediction);
            case "The Commission And Non-Commission Button" -> EventHandler.click(DealerTable.Button.Commission);
            case "The Double Button" -> EventHandler.click(DealerTable.Button.Double);
            case "The Cancel Button" -> EventHandler.click(DealerTable.Button.Cancel);
            case "The Edit Chips Button" -> EventHandler.click(DealerTable.Button.EditChips);
            case "The Next Arrow Button" -> EventHandler.click(ChipSettings.Button.NextArrow);
            case "The Previous Arrow Button" -> EventHandler.click(ChipSettings.Button.PreviousArrow);
            case "The Close Button In Edit Chips" -> EventHandler.click(ChipSettings.Button.Close);
            case "The Save Button In Edit Chips" -> EventHandler.click(ChipSettings.Button.Save);
            case "The Popup Confirm Button" -> EventHandler.click(DealerTable.Button.PopUpConfirm);
            case "The Popup Not Now Button" -> EventHandler.click(DealerTable.Button.PopUpNotNow);
            case "The ReBet Button" -> EventHandler.click(DealerTable.Button.ReBet);
            case "The Undo Button" -> EventHandler.click(DealerTable.Button.Undo);
        }
    }

    @When("I Enter {string}")
    public void iEnter(String step) {
        switch (step) {
            case "Any Dealer Table" -> FuncTest5.enterAnyDealerTable();
            case "Other Table Limit Table" -> FuncTest17.enterOtherTableLimitTable();
            case "Other Table" -> FuncTest29.enterOtherTable();
            case "Other Live Game Table" -> FuncTest30.enterOtherLiveGameTable();
        }
    }

    @When("I Wait {string}")
    public void iWait(String step) {
        switch (step) {
            case "Until Round Is Over" -> Functionality.waitUntilRoundIsOver();
            case "Until Betting Phase" -> Functionality.waitUntilBettingPhase();
            case "Until Bet Wins" -> FuncTest27.waitUntilBetWins();
            case "Until Betting Timer Reaches Last 10 Seconds" -> WaitHandler.waitVisibility(DealerTable.Container.RedTimer, 300);
        }
    }

    @When("I Place {string}")
    public void iPlace(String step) {
        switch (step) {
            case "A Bet On Any Betting Options" -> Functionality.placeABetOnAnyBettingOptions();
            case "" -> System.out.println();
        }
    }

    @When("I Do {string}")
    public void iDo(String step) {
        switch (step) {
            case "Change Any Chip On My Chips" -> FuncTest44.changeAnyChipOnMyChips();
            case "" -> System.out.println();
        }
    }


    @Then("I Verify {string}")
    public void iVerify(String step) {
        switch (step) {
            case "The Number Of Deals Displayed On The Lobby" -> FuncTest1.verify();
            case "The Functionality After Clicking Show/Hide Balance Button On The Lobby" -> FuncTest2.verify(true);
            case "The Functionality After Re-clicking Show/Hide Balance Button On The Lobby" -> FuncTest2.verify(false);
            case "The Functionality After Clicking Each Table Limit Button" -> FuncTest3.verify();
            case "The Functionality After Clicking The Back Button On The Lobby" -> FuncTest4.verify();
            case "The Functionality After Clicking Any Table" -> FuncTest5.verify();
            case "The Functionality After Clicking The Other Live Games" -> FuncTest6.verify();
            case "The Functionality After Clicking The All Games" -> FuncTest7.verify();
            case "The Number Of Deals Displayed After Round Finished" -> FuncTest8.verify();
            case "The Functionality After Clicking The Back Button On The Game" -> FuncTest9.verify();
            case "The Functionality After Clicking The Limits & Payouts" -> FuncTest10.verify();
            case "The Functionality After Clicking The Payout Tab In Limits & Payouts" -> FuncTest11.verify();
            case "The Functionality After Clicking The Bet Limit Tab In Limits & Payouts" -> FuncTest12.verify();
            case "The Functionality After Clicking The Table Limit Button" -> FuncTest13.verify();
            case "The Functionality After Clicking The Help" -> FuncTest14.verify();
            case "The Functionality After Clicking Each Category In The Help" -> FuncTest15.verify(true);
            case "The Functionality After Re-clicking Each Category In The Help" -> FuncTest15.verify(false);
            case "The Functionality After Clicking The Back Button On The Help" -> FuncTest16.verify();
            case "The Functionality After Selecting Other Table Limit" -> FuncTest17.verify();
            case "The Functionality Of The Total Bet Indicator" -> FuncTest18.verify();
            case "The Functionality After Clicking The My Bets" -> FuncTest22.verify();
            case "The Functionality Of Running Round In My Bets" -> FuncTest23.verify();
            case "The Functionality Of Settled Round In My Bets" -> FuncTest24.verify();
            case "The Functionality After Clicking Show/Hide Balance Button On The Game" -> FuncTest25.verify(true);
            case "The Functionality After Re-clicking Show/Hide Balance Button On The Game" -> FuncTest25.verify(false);
            case "The Functionality Of Balance Indicator When Placed And Confirmed Bets" -> FuncTest26.verify();
            case "The Functionality Of Balance Indicator After Winning Round" -> FuncTest27.verify();
            case "The Functionality After Clicking The Switch Table Button" -> FuncTest28.verify();
            case "The Functionality When Joined Other Table In The Switch Table" -> FuncTest29.verify();
            case "The Functionality When Joined Other Live Game Table In The Switch Table" -> FuncTest30.verify();
            case "The Functionality Of Round ID Indicator When New Round Started" -> FuncTest31.verify();
            case "The Functionality Of The Player Prediction Button" -> FuncTest32.verify();
            case "The Functionality Of The Banker Prediction Button" -> FuncTest33.verify();
            case "The Functionality Of The Commission And Non-Commission Button" -> FuncTest34.verify();
            case "The Functionality After Clicking The Confirm Button" -> FuncTest36.verify();
            case "The Functionality After Clicking The Double Button" -> FuncTest37.verify();
            case "The Functionality After Clicking The Cancel Button" -> FuncTest38.verify();
            case "The Functionality After Clicking The Edit Chips Button" -> FuncTest39.verify();
            case "The Functionality After Clicking The Next Arrow Button" -> FuncTest40.verify();
            case "The Functionality After Clicking The Previous Arrow Button" -> FuncTest41.verify();
            case "The Functionality After Clicking The Close Button In Edit Chips" -> FuncTest42.verify();
            case "The Functionality After Clicking The Save Button In Edit Chips" -> FuncTest43.verify();
            case "The Functionality After Clicking The Save Button In Edit Chips When Changed Chip" -> FuncTest44.verify();
            case "The Functionality After Clicking The Confirm Button On Popup Message" -> FuncTest47.verify();
            case "The Functionality After Clicking The Not Now Button On Popup Message" -> FuncTest48.verify();
            case "The Functionality After Clicking The ReBet Button" -> FuncTest49.verify();
            case "The Functionality After Clicking The ReBet Button When Doubled ReBet" -> FuncTest50.verify();
            case "The Functionality After Clicking The ReBet Button When Canceled ReBet" -> FuncTest51.verify();
            case "The Functionality After Clicking The ReBet Button When Undo ReBet" -> FuncTest52.verify();
        }
    }

}

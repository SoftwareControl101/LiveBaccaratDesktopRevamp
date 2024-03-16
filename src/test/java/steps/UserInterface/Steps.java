package steps.UserInterface;

import io.cucumber.java.en.Then;
import modules.UserInterface.*;

public class Steps {

    @Then("I Verify The Thumbnail Of Game")
    public void iVerifyTheThumbnailOfGame() {
        UITest1.verify();
    }

    @Then("I Verify The Launching Of Game")
    public void iVerifyTheLaunchingOfGame() {
        UITest2.verify();
    }

    @Then("I Verify The Game Lobby")
    public void iVerifyTheGameLobby() { UITest3.verify(); }

    @Then("I Verify The UI Of Game During Betting Phase")
    public void iVerifyTheUIOfGameDuringBettingPhase() {
        UITest4.verify();
    }

    @Then("I Verify The UI Of Game During Dealing Phase")
    public void iVerifyTheUIOfGameDuringDealingPhase() {
        UITest5.verify();
    }

}

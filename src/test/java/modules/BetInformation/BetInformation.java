package modules.BetInformation;

import globals.TestMethods;
import org.openqa.selenium.WebElement;
import pages.BetDetails;
import pages.DealerTable;
import pages.MyBets;
import utilities.enums.HandleCollection;
import utilities.handlers.EventHandler;
import utilities.handlers.GetHandler;
import utilities.handlers.WaitHandler;
import utilities.objects.Component;

import java.util.List;

public class BetInformation extends TestMethods {

    protected static String[] roundResult;
    protected static double totalBet;
    protected static String roundId, tableName;

    protected static void placeBet(Component betOption) {
        waitBettingPhase(25, true);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        EventHandler.click(betOption);
        EventHandler.click(DealerTable.Button.Confirm);
    }

    protected static void waitRoundResult() {
        WaitHandler.waitVisibility(DealerTable.Label.ShowDealing, 900);
        totalBet = GetHandler.getDouble(DealerTable.Label.TotalBet);
        tableName = getTableName();
        roundId = getRoundId();
        roundResult = getRoundResult();
    }

    public static void clickBetDetails() {
        EventHandler.click(MyBets.Method.getDetailsButton(roundId), HandleCollection.WithScroll);
    }

    protected static double getCurrentStake() {
        WaitHandler.wait(2);
        return GetHandler.getDouble(BetDetails.Label.Stake);
    }

    public static boolean isWins(List<WebElement> winBettingOptions, String betOption) {
        for (WebElement winBettingOption : winBettingOptions)
            if (winBettingOption.getAttribute("class").contains(betOption)) return true;
        return false;
    }

}

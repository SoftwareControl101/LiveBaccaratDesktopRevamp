package steps.Payout;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import modules.Payout.*;
import pages.DealerTable;
import utilities.features.TextFileFeature;
import utilities.handlers.EventHandler;
import utilities.handlers.WaitHandler;
import utilities.interfaces.PayoutCase;

import java.util.ArrayList;
import java.util.List;

public class Steps {

    @Then("I Place A Bet Until There Is A Round Result For All Payouts")
    public void iPlaceABetUntilThereIsARoundResultForAllPayouts(DataTable dataTable) {
        List<String> results = dataTable.asList(String.class);
        PayoutWait.waitUntilWins(getFirstBatch(results));
        WaitHandler.waitVisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        WaitHandler.waitInvisibility(DealerTable.Label.PlaceYourBetsPlease, 900);
        EventHandler.click(DealerTable.Button.Commission);
        PayoutWait.waitUntilWins(getSecondBatch(results));
        TextFileFeature.write();
        EventHandler.click(DealerTable.Button.Back);
    }

    private List<PayoutCase> getFirstBatch(List<String> results) {
        List<PayoutCase> payoutCases = new ArrayList<>();
        for (String result : results) {
            switch (result) {
                case "Commission Player" -> payoutCases.add(new PayoutTest1());
                case "Commission Banker" -> payoutCases.add(new PayoutTest2());
                case "Commission Tie" -> payoutCases.add(new PayoutTest3());
                case "Commission Pair" -> payoutCases.add(new PayoutTest4());
                case "Dragon Bonus Natural Win" -> payoutCases.add(new PayoutTest12());
                case "Dragon Bonus Natural Tie" -> payoutCases.add(new PayoutTest13());
                case "Dragon Bonus 9 Difference" -> payoutCases.add(new PayoutTest14());
                case "Dragon Bonus 8 Difference" -> payoutCases.add(new PayoutTest15());
                case "Dragon Bonus 7 Difference" -> payoutCases.add(new PayoutTest16());
                case "Dragon Bonus 6 Difference" -> payoutCases.add(new PayoutTest17());
                case "Dragon Bonus 5 Difference" -> payoutCases.add(new PayoutTest18());
                case "Dragon Bonus 4 Difference" -> payoutCases.add(new PayoutTest19());
                case "Fortune Six 2 Cards" -> payoutCases.add(new PayoutTest21());
                case "Fortune Six 3 Cards" -> payoutCases.add(new PayoutTest22());
            }
        }
        return payoutCases;
    }

    private List<PayoutCase> getSecondBatch(List<String> results) {
        List<PayoutCase> payoutCases = new ArrayList<>();
        for (String result : results) {
            switch (result) {
                case "Non-commission Player" -> payoutCases.add(new PayoutTest6());
                case "Non-commission Banker" -> payoutCases.add(new PayoutTest7());
                case "Non-commission Banker Of Six" -> payoutCases.add(new PayoutTest8());
                case "Non-commission Tie" -> payoutCases.add(new PayoutTest9());
                case "Non-commission Pair" -> payoutCases.add(new PayoutTest11());
            }
        }
        return payoutCases;
    }

    @Then("I Verify The Payout Calculation Of {string}")
    public void iVerifyThePayoutCalculationOf(String result) {
        switch (result) {
            case "Commission Player" -> PayoutWait.verify(1);
            case "Commission Banker" -> PayoutWait.verify(2);
            case "Commission Tie" -> PayoutWait.verify(3);
            case "Commission Pair" -> PayoutWait.verify(4);
            case "Non-commission Player" -> PayoutWait.verify(6);
            case "Non-commission Banker" -> PayoutWait.verify(7);
            case "Non-commission Banker Of Six" -> PayoutWait.verify(8);
            case "Non-commission Tie" -> PayoutWait.verify(9);
            case "Non-commission Pair" -> PayoutWait.verify(11);
            case "Dragon Bonus Natural Win" -> PayoutWait.verify(12);
            case "Dragon Bonus Natural Tie" -> PayoutWait.verify(13);
            case "Dragon Bonus 9 Difference" -> PayoutWait.verify(14);
            case "Dragon Bonus 8 Difference" -> PayoutWait.verify(15);
            case "Dragon Bonus 7 Difference" -> PayoutWait.verify(16);
            case "Dragon Bonus 6 Difference" -> PayoutWait.verify(17);
            case "Dragon Bonus 5 Difference" -> PayoutWait.verify(18);
            case "Dragon Bonus 4 Difference" -> PayoutWait.verify(19);
            case "Fortune Six 2 Cards" -> PayoutWait.verify(21);
            case "Fortune Six 3 Cards" -> PayoutWait.verify(22);
        }
    }

}

package pages;

import utilities.objects.Component;

public class MyBets {

    /***************************************************************************************************************
     * These are the container components on the My Bets Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component HistoryCards = new Component(
                "History Cards",
                "Container",
                "My Bets Page",
                "//div[@class='history_card']"
        );
    }

    /***************************************************************************************************************
     * These are the tab menu components on the Login Page.
     ***************************************************************************************************************/

    public static class TabMenu {
        public static Component Running = new Component(
                "Running",
                "Button",
                "My Bets Page",
                "//div[normalize-space()='Running']"
        );
        public static Component Settled = new Component(
                "Settled",
                "Button",
                "My Bets Page",
                "//div[normalize-space()='Settled']"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the My Bets Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "My Bets Page",
                "//button[@class='back_btn']"
        );
        public static Component Details = new Component(
                "Details",
                "Button",
                "My Bets Page",
                "//button[normalize-space()='Details']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the My Bets Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component MyBets = new Component(
                "My Bets",
                "Label",
                "My Bets Page",
                "//div[normalize-space()='My Bets']"
        );
        public static Component DefaultTotal = new Component(
                "Total 0.00 (0.00)",
                "Label",
                "My Bets Page",
                "//div[normalize-space()='Total0.00(0.00)']"
        );
        public static Component Message = new Component(
                "All transactions are time stamped at GMT-4.",
                "Label",
                "My Bets Page",
                "//div[@id='Settled_history']//p[@class='time_stamped'][normalize-space()='All transactions are time stamped at GMT-4.']"
        );
        public static Component TableName = new Component(
                "Table Name",
                "Label",
                "My Bets Page",
                "//div[@class='title']//p"
        );
        public static Component RoundId = new Component(
                "Round ID",
                "Label",
                "My Bets Page",
                "//div[@class='id']"
        );
        public static Component GameStatus = new Component(
                "Game Status",
                "Label",
                "My Bets Page",
                "//div[contains(@class, 'status')]"
        );
        public static Component Stake = new Component(
                "Stake",
                "Label",
                "My Bets Page",
                "//h3[contains(normalize-space(), 'Stake')]/ancestor::div[1]//p"
        );
        public static Component WinLoss = new Component(
                "Win/Loss",
                "Label",
                "My Bets Page",
                "//h3[contains(normalize-space(), 'Win/Loss')]/ancestor::div[1]//p"
        );
        public static Component RefNo = new Component(
                "Reference Number",
                "Label",
                "My Bets Page",
                "//div[@class='info']//p[1]"
        );
        public static Component BetDate = new Component(
                "Bet Date",
                "Label",
                "My Bets Page",
                "//div[@class='info']//p[2]"
        );
        public static Component Total = new Component(
                "Total",
                "Label",
                "My Bets Page",
                "//div[@class='total']"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the My Bets Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getDetailsButton(String roundId) {
            return new Component(
                    "Round ID " + roundId + " Details",
                    "Button",
                    "My Bets Page",
                    "//div[normalize-space()='" + roundId + "']/ancestor::div[contains(@class,'history_card')]//div[contains(@data-gtm,'BetDetail')]"
            );
        }
    }

}

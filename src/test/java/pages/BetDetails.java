package pages;

import utilities.objects.Component;

public class BetDetails {

    /***************************************************************************************************************
     * These are the container components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component BettingOptions = new Component(
                "Betting Options",
                "Container",
                "Bet Details Page",
                "//div[@class='bet_options betting_area_baccarat']"
        );
        public static Component PlayerCards = new Component(
                "Player Cards",
                "Container",
                "Bet Details Page",
                "//div[contains(@class, 'player')]//div[contains(@class, 'front')]"
        );
        public static Component BankerCards = new Component(
                "Banker Cards",
                "Container",
                "Bet Details Page",
                "//div[contains(@class, 'banker')]//div[contains(@class, 'front')]"
        );
        public static Component PlayerWon = new Component(
                "Player Won",
                "Container",
                "Bet Details Page",
                "//div[@class='result player']"
        );
        public static Component BankerWon = new Component(
                "Banker Won",
                "Container",
                "Bet Details Page",
                "//div[@class='result banker']"
        );
        public static Component TieWon = new Component(
                "Banker Won",
                "Container",
                "Bet Details Page",
                "//div[@class='result tie']"
        );
        public static Component WinBettingOptions = new Component(
                "List of Win Betting Options",
                "Container",
                "Bet Details Page",
                "//div[@class='bet_options betting_area_baccarat']//li[contains(@class, 'win')]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Bet Details Page",
                "//div[@class='nav_bar']//button[@class='back_btn']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Bet Details Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component BetDetails = new Component(
                "Bet Details",
                "Label",
                "Bet Details Page",
                "//h2[normalize-space()='Bet Details']"
        );
        public static Component Stake = new Component(
                "Stake",
                "Label",
                "Bet Details Page",
                "//h3[normalize-space()='Stake']/ancestor::div[1]//p"
        );
        public static Component WinLoss = new Component(
                "Win/Loss",
                "Label",
                "Bet Details Page",
                "//h3[normalize-space()='Win/Loss']/ancestor::div[1]//p"
        );
        public static Component PlayerTotalPoints = new Component(
                "Player Total Points",
                "Label",
                "Bet Details Page",
                "//div[contains(@class, 'player')]//div[@class='total_points']//p"
        );
        public static Component BankerTotalPoints = new Component(
                "Banker Total Points",
                "Label",
                "Bet Details Page",
                "//div[contains(@class, 'banker')]//div[@class='total_points']//p"
        );
    }

    /***************************************************************************************************************
     * These are the betting chips on the Bet Details Page.
     ***************************************************************************************************************/

    public static class BettingChip {
        static String chipPath = "//div[contains(@class, 'chip_locate_user')]//div[contains(@class, 'chip_text')]";
        public static Component Player = new Component(
                "Player Betting Chip",
                "Container",
                "Bet Details Page",
                "//p[contains(text(),'Player')]/ancestor::li[contains(@class, 'main_bet blue')]" + chipPath
        );
        public static Component Tie = new Component(
                "Tie Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Tie')]/ancestor::li[contains(@class, 'main_bet green')]" + chipPath
        );
        public static Component PlayerDragonBonus = new Component(
                "Player Dragon Bonus Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Dragon Bonus')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );
        public static Component PlayerPair = new Component(
                "Player Pair Betting Chip",
                "Container",
                "Dealer Table Page",
                "//p[contains(text(),'Player Pair')]/ancestor::li[contains(@class, 'side_bet blue')]" + chipPath
        );
    }

}

package pages;

import utilities.enums.TestEnvironment;
import utilities.objects.Component;
import settings.AccountManager;

public class GameLobby {

    /***************************************************************************************************************
     * These are the container components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component DealerTables = new Component(
                "List of Dealer Tables",
                "Container",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'Baccarat')]/ancestor::div[3]"
        );
        public static Component DealerPhotos = new Component(
                "List of Dealer Photos",
                "Container",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'Baccarat')]/ancestor::div[3]" +
                        "//div[@class='dealer-card_dealer-info_dealer']//img"
        );
        public static Component RoadMaps = new Component(
                "List of Road Maps",
                "Label",
                "Game Lobby Page",
                "//div[@class='dealer-card_roadmap dealer-card_roadmap--multiple-roadmap']"
        );
        public static Component Notification = new Component(
                "Notification",
                "Container",
                "Game Lobby Page",
                "//div[@class='snack_bar']"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Game Lobby Page",
                "//button[@class='back_btn']"
        );
        public static Component FullScreen = new Component(
                "Full Screen",
                "Button",
                "Game Lobby Page",
                "//div[@tooltiptext='Fullscreen']//button[@class='button']"
        );
        public static Component MyBets = new Component(
                "My Bets",
                "Button",
                "Game Lobby Page",
                "//div[@tooltiptext='My bets']//button[@class='button']"
        );
        public static Component Help = new Component(
                "Help",
                "Button",
                "Game Lobby Page",
                "//div[@tooltiptext='T&C']//button[@class='button']"
        );
        public static Component HideShowBalance = new Component(
                "Hide/Show Balance",
                "Button",
                "Game Lobby Page",
                "//div[@class='btn balance_btn balance_lg']"
        );
        public static Component User = new Component(
                "User",
                "Button",
                "Game Lobby Page",
                "//div[@class='user-setting_btn']"
        );
        public static Component ActiveTableLimit = new Component(
                "Active Table Limit",
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='Baccarat']/ancestor::div[1]//ul//li[contains(@class,'active')]"
        );
        public static Component ActiveLiveCasinoGame = new Component(
                "Active Live Casino Game",
                "Button",
                "Game Lobby Page",
                "//div[@class='lobby_sidemenu_tabitem selected']"
        );
        public static Component TableLimits = new Component(
                "List of Table Limits",
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='Baccarat']/ancestor::div[1]//ul//li"
        );
        public static Component LiveCasinoGames = new Component(
                "List of Live Casino Games",
                "Button",
                "Game Lobby Page",
                "//div[contains(@class, 'lobby_sidemenu_tabitem')]"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component Baccarat = new Component(
                "Baccarat",
                "Label",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='Baccarat']"
        );
        public static Component DateTime = new Component(
                "Date Time",
                "Label",
                "Game Lobby Page",
                "//div[@class='header_time']"
        );
        public static Component BalanceText = new Component(
                "Balance Text",
                "Label",
                "Game Lobby Page",
                "//div[@class='btn balance_btn balance_lg']//p"
        );
        public static Component BalanceValue = new Component(
                "Balance Value",
                "Label",
                "Game Lobby Page",
                "//div[@class='btn balance_btn balance_lg']//p//span[2]"
        );
        public static Component InGameName = new Component(
                "In Game Name",
                "Label",
                "Game Lobby Page",
                "//div[@class='name']"
        );
        public static Component FindATable = new Component(
                "Let's find a table and start betting.",
                "Label",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'find a table and start betting')]"
        );
        public static Component DealerNames = new Component(
                "List of Dealer Names",
                "Label",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'Baccarat')]/ancestor::div[3]" +
                        "//div[@class='dealer-card_dealer-info_dealer']//span"
        );
        public static Component TableNames = new Component(
                "List of Table Names",
                "Label",
                "Game Lobby Page",
                "//p[contains(normalize-space(), 'Baccarat')]/ancestor::div[3]" +
                        "//p[contains(normalize-space(), 'Baccarat')]"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Game Lobby Page.
     ***************************************************************************************************************/

    public static class Method {
        private static final String tablePath = AccountManager.getEnvironment() == TestEnvironment.PRODUCTION ?
                "//p[contains(text(), 'Baccarat') and not(contains(text(), 'Speed'))]" +
                        "/ancestor::div[2]/preceding-sibling::div//span[@class='dealer_name' and " +
                        "not(contains(text(), 'Maintenance'))]/ancestor::div[3]" :
                "//p[contains(text(), 'Baccarat X')]/ancestor::div[3]";

        public static Component getDealerTables() {
            return new Component(
                    "List of Selected Dealer Tables",
                    "Container",
                    "Game Lobby Page",
                    tablePath
            );
        }

        public static Component getDealerTable(String table) {
            return new Component(
                    table + " Dealer Table",
                    "Container",
                    "Game Lobby Page",
                    tablePath + "//p[contains(text(), '" + table + "')]/ancestor::div[3]"
            );
        }

        public static Component getShowDealing(String table) {
            return new Component(
                    table + " Show Dealing",
                    "Container",
                    "Game Lobby Page",
                    tablePath + "//p[contains(text(), '" + table + "')]/ancestor::div[3]//div[@class='game-status--dealing']"
            );
        }

        public static Component getShowTimer(String table) {
            return new Component(
                    table + " Show Timer",
                    "Container",
                    "Game Lobby Page",
                    tablePath + "//p[contains(text(), '" + table + "')]/ancestor::div[3]//div[@class='game-status_text']"
            );
        }

        public static Component getDeals(String table) {
            return new Component(
                    table + " Deals",
                    "Label",
                    "Game Lobby Page",
                    tablePath + "//p[contains(text(), '" + table + "')]/ancestor::div[3]//p[@class='dealer-card_title_display-deals']"
            );
        }

        public static Component getLiveCasinoGame(String game) {
            return new Component(
                    game + " Live Casino",
                    "Tab Menu",
                    "Game Lobby Page",
                    "//div[@class='lobby_sidemenu_tabitem']//div[contains(text(),'" + game + "')]/ancestor::div[1]"
            );
        }

        public static Component getOtherDealerTables(String game) {
            return new Component(
                    "List of Dealer Tables on " + game,
                    "Container",
                    "Game Lobby Page",
                    "//p[contains(normalize-space(), '" + game + "')]/ancestor::div[3]"
            );
        }

        public static Component getOtherTableLimits(String game) {
            return new Component(
                "List of Table Limits on " + game,
                "Button",
                "Game Lobby Page",
                "//div[@class='product_name'][normalize-space()='" + game + "']/ancestor::div[1]//ul//li"
            );
        }
    }

}

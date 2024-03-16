package pages;

import utilities.objects.Component;

public class SwitchTable {

    /***************************************************************************************************************
     * These are the container components on the Switch Table Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component SwitchTablePanel = new Component(
                "Switch Table Panel",
                "Container",
                "Switch Table Page",
                "//div[@class='switch_table_panel']"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Switch Table Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Close = new Component(
            "Close",
            "Button",
            "Switch Table Page",
            "//button[@class='btn_jump_table']"
        );
        public static Component SicBoGame = new Component(
                "Sic Bo Game",
                "Button",
                "Switch Table Page",
                "//p[normalize-space()='Sic Bo']/ancestor::button"
        );
        public static Component InactiveGames = new Component(
                "List of Inactive Games",
                "Button",
                "Switch Table Page",
                "//button[@class='game_icon']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Switch Table Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component YouAreHere = new Component(
                "You Are Here",
                "Label",
                "Switch Table Page",
                "//div[@class='table_card active']//p[contains(text(),'You are here')]"
        );
        public static Component ActiveGameName = new Component(
                "Active Game Name",
                "Label",
                "Switch Table Page",
                "//button[@class='game_icon active']//p"
        );
        public static Component InactiveGameNames = new Component(
                "List of Inactive Game Names",
                "Label",
                "Switch Table Page",
                "//button[@class='game_icon']//p"
        );
        public static Component TableNames = new Component(
                "List of Table Names",
                "Label",
                "Switch Table Page",
                "//div[@class='title']//h3"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Switch Table Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getTableCards(boolean isActiveInclude) {
            return new Component(
                    "List of Table Cards" + (isActiveInclude ? "" : " (Active Not Included)"),
                    "Container",
                    "Switch Table Page",
                    isActiveInclude ? "//div[contains(@class, 'table_card')]" : "//div[@class='table_card']"
            );
        }
        public static Component getTableCard(String table) {
            return new Component(
                    "Table Card of Dealer " + table,
                    "Container",
                    "Switch Table Page",
                    "//h3[normalize-space()='" + table + "']/ancestor::div[2]"
            );
        }
    }

}

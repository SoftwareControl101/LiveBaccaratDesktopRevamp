package pages;

import utilities.objects.Component;

public class LimitsAndPayouts {

    /***************************************************************************************************************
     * These are the tab menu components on the Login Page.
     ***************************************************************************************************************/

    public static class TabMenu {
        public static Component BetLimit = new Component(
                "Bet Limit",
                "Tab Menu",
                "Limits And Payouts Page",
                "//div[@data-gtm='Btn_ClickLimit']"
        );
        public static Component Payout = new Component(
                "Payout",
                "Tab Menu",
                "Limits And Payouts Page",
                "//div[@data-gtm='Btn_ClickPayout']"
        );
    }

    /***************************************************************************************************************
     * These are the container components on the Limits And Payouts Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component LimitPayout = new Component(
                "LimitPayout",
                "Container",
                "Limits And Payouts Page",
                "//div[contains(@class,'paytable_panel')]"
        );
        public static Component BetLimit = new Component(
                "Bet Limit",
                "Container",
                "Limits And Payouts Page",
                "//div[@class='tab_content content_1']//div[@class='row_item']"
        );
        public static Component Payout = new Component(
                "Payout",
                "Container",
                "Limits And Payouts Page",
                "//div[@class='tab_content content_2']//div[@class='row_item']"
        );
    }

}

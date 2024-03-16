package pages;

import utilities.objects.Component;

public class TableLimit {

    /***************************************************************************************************************
     * These are the button components on the Table Limit Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component ActiveTableLimit = new Component(
                "Active Table Limit",
                "Button",
                "Table Limit Page",
                "//ul[@class='table_limits']//li[contains(@class, 'active')]"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Table Limit Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getTableLimits(boolean isActiveInclude) {
            return new Component(
                    "List of " + (isActiveInclude ? "Table Limits" : "Table Limits (Active Not Included)"),
                    "Button",
                    "Table Limit Page",
                    isActiveInclude ? "//ul[@class='table_limits']//li" : "//ul[@class='table_limits']//li[not(contains(@class, 'active'))]"
            );
        }
        public static Component getTableLimit(String tableLimit) {
            return new Component(
                    tableLimit +" Table Limit",
                    "Button",
                    "Table Limit Page",
                    "//ul[@class='table_limits']//li[contains(normalize-space(), '" + tableLimit + "')]"
            );
        }
    }

}

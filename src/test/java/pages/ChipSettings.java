package pages;

import utilities.objects.Component;

public class ChipSettings {

    /***************************************************************************************************************
     * These are the container components on the Chip Settings Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component MyChips = new Component(
                "List of My Chips",
                "Container",
                "Chip Settings Page",
                "//ul[@class='chips']//li"
        );
        public static Component ChipSelections = new Component(
                "List of Chip Selections",
                "Container",
                "Chip Settings Page",
                "//ul[@class='chips chips_selections']//li[not(contains(@style, 'display: none'))]"
        );
        public static Component PreviousChip = new Component(
                "Previous Chip",
                "Container",
                "Chip Settings Page",
                "//ul[@class='chips chips_selections']//li[5]"
        );
        public static Component NextChip = new Component(
                "Next Chip",
                "Container",
                "Chip Settings Page",
                "//ul[@class='chips chips_selections']//li[15]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Chip Settings Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Close = new Component(
                "Close",
                "Button",
                "Chip Settings Page",
                "//button[@class='close_btn']"
        );
        public static Component Save = new Component(
                "Save",
                "Button",
                "Chip Settings Page",
                "//button[normalize-space()='Save']"
        );
        public static Component PreviousArrow = new Component(
                "Previous Arrow",
                "Button",
                "Chip Settings Page",
                "//button[@class='arr_btn arr_left_btn']//*[name()='svg']"
        );
        public static Component NextArrow = new Component(
                "Next Arrow",
                "Button",
                "Chip Settings Page",
                "//button[@class='arr_btn arr_right_btn']//*[name()='svg']"
        );
    }

    /***************************************************************************************************************
     * These are the label components on the Chip Settings Page.
     ***************************************************************************************************************/

    public static class Label {
        public static Component MyChips = new Component(
                "My Chips",
                "Label",
                "Chip Settings Page",
                "//span[normalize-space()='My Chips']"
        );
        public static Component ChipSelections = new Component(
                "Chip Selections",
                "Label",
                "Chip Settings Page",
                "//span[normalize-space()='Selections']"
        );
    }

    /***************************************************************************************************************
     * These are the methods on the Chip Settings Page.
     ***************************************************************************************************************/

    public static class Method {
        public static Component getChipSelection(String chipValue) {
            return new Component(
                    "#" + chipValue + " Chip Selection",
                    "Button",
                    "Chip Settings Page",
                    "//div[@class='top_section']//div[@class='chip_text'][normalize-space()='" +
                            chipValue + "']/ancestor::div[1]"
            );
        }
        public static Component getMyChip(String chipValue) {
            return new Component(
                    "#" + chipValue + " My Chip",
                    "Button",
                    "Chip Settings Page",
                    "//div[@class='bottom_section']//div[@class='chip_text'][normalize-space()='" +
                            chipValue + "']/ancestor::div[1]"
            );
        }
    }

}

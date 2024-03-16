package pages;

import utilities.objects.Component;

public class Help {

    /***************************************************************************************************************
     * These are the container components on the Help Page.
     ***************************************************************************************************************/

    public static class Container {
        public static Component Basics = new Component(
                "The Basics Information",
                "Container",
                "Help Page",
                "//details[contains(@data-gtm, 'Basics')]"
        );
        public static Component BetOptions = new Component(
                "Bet Options and How to Win Information",
                "Container",
                "Help Page",
                "//details[contains(@data-gtm, 'BetOption')]"
        );
        public static Component GameControls = new Component(
                "What are the Game Controls Information",
                "Container",
                "Help Page",
                "//details[contains(@data-gtm, 'GameControl')]"
        );
        public static Component Likelihood = new Component(
                "What is My Likelihood of Winning Information",
                "Container",
                "Help Page",
                "//details[contains(@data-gtm, 'Likelihood')]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Help Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Back = new Component(
                "Back",
                "Button",
                "Help Page",
                "//div[@class='nav_bar']//button[@class='back_btn']"
        );
        public static Component Basics = new Component(
                "The Basics Information",
                "Button",
                "Help Page",
                "//summary[normalize-space()='The Basics']"
        );
        public static Component BetOptions = new Component(
                "Bet Options and How to Win Information",
                "Button",
                "Help Page",
                "//summary[normalize-space()='Bet Options and How to Win']"
        );
        public static Component GameControls = new Component(
                "What are the Game Controls Information",
                "Button",
                "Help Page",
                "//summary[normalize-space()='What are the Game Controls']"
        );
        public static Component Likelihood = new Component(
                "What is My Likelihood of Winning Information",
                "Button",
                "Help Page",
                "//summary[normalize-space()='What is My Likelihood of Winning']"
        );
    }

}

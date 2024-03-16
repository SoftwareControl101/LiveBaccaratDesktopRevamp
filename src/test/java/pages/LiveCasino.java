package pages;

import utilities.objects.Component;

public class LiveCasino {

    /***************************************************************************************************************
     * These are the thumbnail components on the Live Casino Page.
     ***************************************************************************************************************/

    public static class Thumbnail {
        public static Component LiveBaccaratRevamp = new Component(
                "Live Baccarat Revamp",
                "Thumbnail",
                "Live Casino Page",
                "//p[normalize-space()='SBO Live Deluxe Baccarat']/ancestor::div[1]"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Live Casino Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component Verify = new Component(
                "Verify",
                "Button",
                "Live Casino Page",
                "//div[@aria-label='Click to verify']"
        );
    }

}

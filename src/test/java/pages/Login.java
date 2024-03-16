package pages;

import utilities.objects.Component;

public class Login {

    /***************************************************************************************************************
     * These are the tab menu components on the Login Page.
     ***************************************************************************************************************/

    public static class TabMenu {
        public static Component LiveCasino = new Component(
                "Live Casino",
                "Tab Menu",
                "Login Page",
                "//a[normalize-space()='Live Casino']"
        );
    }

    /***************************************************************************************************************
     * These are the button components on the Login Page.
     ***************************************************************************************************************/

    public static class Button {
        public static Component SignIn = new Component(
                "Submit Login Form",
                "Button",
                "Login Page",
                "//li[contains(@class,'sign-in')]"
        );
        public static Component Language = new Component(
                "Language",
                "Button",
                "Login Page",
                "//div[@id='selected-lang']"
        );
        public static Component English = new Component(
                "Language",
                "Button",
                "Login Page",
                "//a[normalize-space()='English']"
        );
    }

    /***************************************************************************************************************
     * These are the textBox components on the Login Page.
     ***************************************************************************************************************/

    public static class TextBox {
        public static Component Username = new Component(
                "Username",
                "TextBox",
                "Login Page",
                "//input[@id='username']"
        );
        public static Component Password = new Component(
                "Password",
                "TextBox",
                "Login Page",
                "//input[@id='password']"
        );
    }

}

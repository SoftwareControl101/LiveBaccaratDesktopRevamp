package settings;

import utilities.enums.TestEnvironment;

public class AccountManager {

    /*********************************************************************************************************************
     ** The variable 'testEnvironment' represents the chosen test environment for ongoing test execution.
     ** The 'TestEnvironment' enum class is located in the 'utilities/enums' directory.
     *********************************************************************************************************************/

    private static TestEnvironment testEnvironment;

    /*********************************************************************************************************************
     ** The 'setEnvironment' method is utilized to configure the test environment.
     ** The 'setEnvironment' method is invoked within the 'beforeScenario' method in the 'HooksController' class.
     *********************************************************************************************************************/

    public static void setEnvironment(TestEnvironment env) {
        testEnvironment = env;
    }

    /*********************************************************************************************************************
     ** The 'getEnvironment' method retrieves the chosen test environment, setting up everything accordingly for each test.
     *********************************************************************************************************************/

    public static TestEnvironment getEnvironment() {
        return testEnvironment;
    }

    /*********************************************************************************************************************
     ** These getter methods are designed to obtain the appropriate account information and URL for each test environment.
     *********************************************************************************************************************/

    public static String getURL() {
        return switch (testEnvironment) {
            case PRODUCTION -> Production.URL;
            case UAT -> UAT.URL;
            case STAGING -> Staging.URL;
        };
    }

    public static String getUsername() {
        return switch (testEnvironment) {
            case PRODUCTION -> Production.USERNAME;
            case UAT -> UAT.USERNAME;
            case STAGING -> Staging.USERNAME;
        };
    }

    public static String getPassword() {
        return switch (testEnvironment) {
            case PRODUCTION -> Production.PASSWORD;
            case UAT -> UAT.PASSWORD;
            case STAGING -> Staging.PASSWORD;
        };
    }

    /*********************************************************************************************************************
     ** These enums are the available accounts for each environment.
     ** Note: Set it up with the accurate account information and URL for each test environment.
     *********************************************************************************************************************/

    private static class Production {
        public static final String URL = "https://www.sbobet.com";
        public static final String USERNAME = "idrauto06";
        public static final String PASSWORD = "asdf1234**";
    }

    private static class UAT {
        public static final String URL = "https://www.sbotest.com";
        public static final String USERNAME = "idrauto06";
        public static final String PASSWORD = "asdf1234**";
    }

    private static class Staging {
        public static final String URL = "https://www.sbotry.com";
        public static final String USERNAME = "zirconsmamaag020";
        public static final String PASSWORD = "asdf1234*";
    }

}

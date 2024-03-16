package settings;

import io.cucumber.java.*;
import utilities.enums.TestEnvironment;
import utilities.features.ScreenshotFeature;
import utilities.objects.Printer;

public class HooksController extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'beforeScenario' method runs before the scenario begins.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void beforeScenario() {
        AccountManager.setEnvironment(TestEnvironment.PRODUCTION);
        initializeVariables();
        Printer.printInfo("***************************** START SCENARIO *****************************");
    }

    /*********************************************************************************************************************
     ** The 'afterScenario' method runs after the scenario begins.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void afterScenario() {
        Printer.printInfo("***************************** END SCENARIO *******************************");
    }

    /*********************************************************************************************************************
     ** The 'beforeStep' method runs before each step begins.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void beforeStep(Scenario scenario) {
        AutomationSetup.setScenario(scenario);
    }

    /*********************************************************************************************************************
     ** The 'afterStep' method runs after each step begins.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            ScreenshotFeature.capture("errors");
        }
    }

}

package settings;

import engine.Driver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objects.CustomScenario;
import utilities.objects.TestResult;

import java.util.ArrayList;
import java.util.List;

public class AutomationSetup extends Driver {

    /*********************************************************************************************************************
     ** These variables are used for automation test scripts.
     *********************************************************************************************************************/

    protected static CustomScenario scenario;
    protected static WebDriverWait wait;
    protected static JavascriptExecutor jsExecutor;
    protected static Actions actions;
    protected static List<TestResult> testResultList;
    protected static String originalWindowHandle;

    /*********************************************************************************************************************
     ** The 'initialize' method initialize all global variables but not the scenario and its name.
     *********************************************************************************************************************/

    public static void initializeVariables() {
        driver.switchTo().window(driver.getWindowHandle());
        wait = new WebDriverWait(driver, 5);
        jsExecutor = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        testResultList = new ArrayList<>();
        originalWindowHandle = driver.getWindowHandle();
    }

    /*********************************************************************************************************************
     ** The 'setScenario' method sets up the current scenario.
     *********************************************************************************************************************/

    public static void setScenario(Scenario scenario) {
        AutomationSetup.scenario = new CustomScenario(scenario);
    }

}

package utilities.handlers;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.objects.Printer;
import settings.AccountManager;
import settings.AutomationSetup;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;

@SuppressWarnings("unused")
public class NavigationHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'capture' method is used to capture a screenshot in case of failure in every test scenario.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void goToWebsite() {
        try {
            driver.get(AccountManager.getURL());
            if (getStatus() == 404) throw new RuntimeException("404 Not Found Error");
        } catch (Exception e) {
            Printer.printError("Failed to go to the URL of " + AccountManager.getURL());
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'getStatus' method is used to get the status of navigating to the website.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    private static int getStatus() {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(driver.getCurrentUrl()).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getResponseCode();
        } catch (Exception e) { return -1; }
    }

    /*********************************************************************************************************************
     ** The 'refresh' method is used for reloading the website.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void refresh() {
        try {
            jsExecutor.executeScript("location.reload();");
            if (getStatus() == 404) throw new RuntimeException("404 Not Found Error");
        } catch (Exception e) {
            Printer.printError("Failed to reload the website");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'switchToAnotherWindow' method is used for switching to another window.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void switchToAnotherWindow() {
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            Set<String> windowHandles = driver.getWindowHandles();
            String newWindowHandle = "";
            for (String windowHandle : windowHandles) {
                if (!windowHandle.equals(originalWindowHandle)) {
                    newWindowHandle = windowHandle;
                    break;
                }
            }
            driver.switchTo().window(newWindowHandle);
        } catch (Exception e) {
            Printer.printError("Failed to switch to another window");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'switchBackToMainWindow' method is used for switching to main window.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void switchBackToMainWindow() {
        try {
            driver.switchTo().window(originalWindowHandle);
        } catch (Exception e) {
            Printer.printError("Failed to switch to main window");
            throw e;
        }
    }

}

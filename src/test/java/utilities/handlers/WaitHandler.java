package utilities.handlers;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objects.Component;
import utilities.objects.Printer;
import settings.AutomationSetup;

@SuppressWarnings("unused")
public class WaitHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'wait' method handles waiting for a particular number of milliseconds.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void wait(int seconds) {
        int millis = seconds * 1000;
        try { Thread.sleep(millis); }
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    /*********************************************************************************************************************
     ** The 'waitUrlToBe' method handles waiting for a specific URL.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void waitUrlToBe(String url, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.urlToBe(url));
        } catch (Exception e) {
            Printer.printError("Failed to wait the URL of " + url);
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'waitUrlContains' method handles waiting for a particular text in the current URL.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void waitUrlContains(String text, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.urlContains(text));
        } catch (Exception e) {
            Printer.printError("Failed to wait \"" + text + "\" in the URL of " + driver.getCurrentUrl());
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'waitVisibility' method handles waiting for the visibility of a particular element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void waitVisibility(Component component, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to wait the visibility of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'waitInvisibility' method handles waiting for the invisibility of a particular element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void waitInvisibility(Component component, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(component.getPath()));
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to wait the invisibility of \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

}

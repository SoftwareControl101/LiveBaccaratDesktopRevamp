package utilities.handlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.enums.HandleCollection;
import utilities.objects.Component;
import utilities.objects.Printer;
import settings.AutomationSetup;

@SuppressWarnings("unused")
public class EventHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'sendKeys' method is used for inputting data into the element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void sendKeys(Component component, String input) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            element.sendKeys(input);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to input \"" + input + "\" in \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'select' method is used for choosing an option within the element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void select(Component component, String value) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            Select select = new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to select \"" + value + "\" in \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'click' method is used for clicking the element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void click(Component component) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to click \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static void click(Component component, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    element.click();
                } catch (Exception e) { /* Exclude the exception. */ }
                break;
            case WithScroll:
                try {
                    WebElement element = driver.findElement(component.getPath());
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    element.click();
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to click \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
                break;
        }
    }

    @SuppressWarnings("unused")
    public static void click(Component component, int seconds) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            WaitHandler.wait(seconds);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to click \"" + name + "\" " + type + " on " + page +
                    " then wait " + seconds + " seconds");
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static void click(Component component, WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to click \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static void click(Component component, WebElement element, HandleCollection handleCollection) {
        switch (handleCollection) {
            case WithException:
                try {
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    element.click();
                } catch (Exception e) { /* Exclude the exception. */ }
                break;
            case WithScroll:
                try {
                    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
                    wait.until(ExpectedConditions.elementToBeClickable(element));
                    element.click();
                } catch (Exception e) {
                    String name = component.getName();
                    String type = component.getType();
                    String page = component.getPage();
                    Printer.printError("Failed to click \"" + name + "\" " + type + " on " + page + " with scroll");
                    throw e;
                }
                break;
        }
    }

    @SuppressWarnings("unused")
    public static void click(int xCoordinate, int yCoordinate) {
        try {
            actions.moveByOffset(xCoordinate, yCoordinate).click().perform();
        } catch (Exception e) {
            Printer.printError("Failed to click in location of {" + xCoordinate + ", " + yCoordinate + "}");
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'scroll' method is used to navigate and view the specified element.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void scroll(Component component) {
        try {
            WebElement element = driver.findElement(component.getPath());
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to scroll \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    @SuppressWarnings("unused")
    public static void scroll(Component component, WebElement element) {
        try {
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to scroll \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

    /*********************************************************************************************************************
     ** The 'pressAndHold' method is used to press and hold the element for a specific duration.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void pressAndHold(Component component, int seconds) {
        try {
            int millis = seconds * 1000;
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            actions.clickAndHold(element).perform();
            actions.pause(millis).perform();
            actions.release().perform();
        } catch (Exception e) {
            String name = component.getName();
            String type = component.getType();
            String page = component.getPage();
            Printer.printError("Failed to press and hold \"" + name + "\" " + type + " on " + page);
            throw e;
        }
    }

}

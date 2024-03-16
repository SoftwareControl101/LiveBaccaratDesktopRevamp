package utilities.handlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objects.Component;
import settings.AutomationSetup;

@SuppressWarnings("unused")
public class ConditionHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'isUrlContains' method checks if the URL contains a specific text.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isUrlContains(String text, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            return driver.getCurrentUrl().contains(text);
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isDisplayed' method checks if the element is visible.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isDisplayed(Component component, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath())).isDisplayed();
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isPresence' method checks if the element is present.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isPresent(Component component, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            wait.until(ExpectedConditions.presenceOfElementLocated(component.getPath()));
            return true;
        } catch (Exception e) { return false; }
    }

    /*********************************************************************************************************************
     ** The 'isSelected' method checks if the element is selected.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static boolean isSelected(Component component, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, seconds);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(component.getPath()));
            return element.isSelected();
        } catch (Exception e) { return false; }
    }

}

package utilities.handlers;

import utilities.objects.Component;
import utilities.objects.CustomAssert;

@SuppressWarnings("unused")
public class VerificationHandler {

    /*********************************************************************************************************************
     ** The 'verifyIfDisplayed' method is used to confirm the visibility of an element
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfDisplayed(Component component, int seconds) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertTrue(ConditionHandler.isDisplayed(component, seconds),
                "** \"" + name + "\" " + type + " on " + page + " is Displayed",
                "** \"" + name + "\" " + type + " on " + page + " is Not Displayed");
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotDisplayed' method is used to confirm the invisibility of an element
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfNotDisplayed(Component component, int seconds) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertFalse(ConditionHandler.isDisplayed(component, seconds),
                "** \"" + name + "\" " + type + " on " + page + " is Not Displayed",
                "** \"" + name + "\" " + type + " on " + page + " is Displayed");
    }

    /*********************************************************************************************************************
     ** The 'verifyIfContained' method confirms the presence of text in an element's displayed text
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfContained(Component component, String target, String message) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertTrue(GetHandler.getText(component).contains(target),
                "** \"" + name + "\" " + type + " on " + page + " is " + message,
                "** \"" + name + "\" " + type + " on " + page + " is Not " + message);
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotContained' method confirms the absence of text in an element's displayed text
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfNotContained(Component component, String target, String message) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertFalse(GetHandler.getText(component).contains(target),
                "** \"" + name + "\" " + type + " on " + page + " is " + message,
                "** \"" + name + "\" " + type + " on " + page + " is Not " + message);
    }

    /*********************************************************************************************************************
     ** The 'verifyIfContained' method confirms the presence of text in an element's attribute
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfContained(Component component, String attribute, String target, String message) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertTrue(GetHandler.getAttribute(component, attribute).contains(target),
                "** \"" + name + "\" " + type + " on " + page + " is " + message,
                "** \"" + name + "\" " + type + " on " + page + " is Not " + message);
    }

    /*********************************************************************************************************************
     ** The 'verifyIfNotContained' method confirms the absence of text in an element's attribute
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void verifyIfNotContained(Component component, String attribute, String target, String message) {
        String name = component.getName();
        String type = component.getType();
        String page = component.getPage();
        CustomAssert.assertFalse(GetHandler.getAttribute(component, attribute).contains(target),
                "** \"" + name + "\" " + type + " on " + page + " is " + message,
                "** \"" + name + "\" " + type + " on " + page + " is Not " + message);
    }

}

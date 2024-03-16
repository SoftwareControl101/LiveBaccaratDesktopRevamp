package utilities.objects;

import org.junit.Assert;

import java.util.Objects;

/*********************************************************************************************************************
 ** These object class is customized to manage the verification process by handling the assertion for each condition.
 ** It adds printing of success messages or error messages in the console for each assertion.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class CustomAssert extends Assert {

    @SuppressWarnings("unused")
    public static void assertTrue(boolean condition, String successMessage, String errorMessage) {
        if (!condition) Printer.printError(errorMessage);
        Assert.assertTrue(errorMessage, condition);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertFalse(boolean condition, String successMessage, String errorMessage) {
        if (condition) Printer.printError(errorMessage);
        Assert.assertFalse(errorMessage, condition);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertEquals(String expected, String actual, String successMessage, String errorMessage) {
        if (!Objects.equals(expected, actual)) Printer.printError(errorMessage);
        Assert.assertEquals(errorMessage, expected, actual);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertNotEquals(String expected, String actual, String successMessage, String errorMessage) {
        if (Objects.equals(expected, actual)) Printer.printError(errorMessage);
        Assert.assertNotEquals(errorMessage, expected, actual);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertEquals(double expected, double actual, String successMessage, String errorMessage) {
        if (expected != actual) Printer.printError(errorMessage);
        Assert.assertEquals(errorMessage, expected, actual, 0.0);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertNotEquals(double expected, double actual, String successMessage, String errorMessage) {
        if (expected == actual) Printer.printError(errorMessage);
        Assert.assertNotEquals(errorMessage, expected, actual, 0.0);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertEquals(int expected, int actual, String successMessage, String errorMessage) {
        if (expected != actual) Printer.printError(errorMessage);
        Assert.assertEquals(errorMessage, expected, actual);
        Printer.printSuccess(successMessage);
    }

    @SuppressWarnings("unused")
    public static void assertNotEquals(int expected, int actual, String successMessage, String errorMessage) {
        if (expected == actual) Printer.printError(errorMessage);
        Assert.assertNotEquals(errorMessage, expected, actual);
        Printer.printSuccess(successMessage);
    }

}

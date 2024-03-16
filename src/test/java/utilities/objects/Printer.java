package utilities.objects;

/*********************************************************************************************************************
 ** This object class is used to print colored messages in the console, segregating messages during test execution.
 *********************************************************************************************************************/

@SuppressWarnings("unused")
public class Printer {

    private static final String ANSI_BLUE = "\u001B[34m"; // * Information Color
    private static final String ANSI_GREEN = "\u001B[32m"; // * Success Color
    private static final String ANSI_YELLOW = "\u001B[33m"; // * Warning Color
    private static final String ANSI_ORANGE = "\u001B[38;5;208m"; // * Error Color
    public static final String ANSI_RESET = "\u001B[0m"; // * It is used to reset the color of the message.

    /*********************************************************************************************************************
     ** The 'printInfo' method print an information message.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void printInfo(String message) {
        System.out.println(ANSI_BLUE + message + ANSI_RESET);
    }

    /*********************************************************************************************************************
     ** The 'printSuccess' method print a success message.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void printSuccess(String message) {
        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }

    /*********************************************************************************************************************
     ** The 'printWarning' method print a warning message.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void printWarning(String message) {
        System.out.println(ANSI_YELLOW + message + ANSI_RESET);
    }

    /*********************************************************************************************************************
     ** The 'printError' method print an error message.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void printError(String message) {
        System.out.println(ANSI_ORANGE + message + ANSI_RESET);
    }

}

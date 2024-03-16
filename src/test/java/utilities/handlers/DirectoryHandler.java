package utilities.handlers;

import settings.AutomationSetup;

import java.io.*;

@SuppressWarnings("unused")
public class DirectoryHandler extends AutomationSetup {

    /*********************************************************************************************************************
     ** These are the variables and constants used to manage directories.
     *********************************************************************************************************************/

    private static final String RESULTS_PATH = System.getProperty("user.dir") + "\\results";
    private static final String USER_INTERFACE_FOLDER = "\\UserInterface";
    private static final String BET_INFORMATION_FOLDER = "\\BetInformation";
    private static final String GAMEPLAY_FOLDER = "\\Gameplay";
    private static final String FUNCTIONALITY_FOLDER = "\\Functionality";
    private static final String PAYOUT_FOLDER = "\\Payout";
    private static final String RESULT_AND_STATS_FOLDER = "\\ResultAndStatistics";
    private static final String SCREENSHOTS_FOLDER = "\\screenshots";
    private static final String WEBPAGES_FOLDER = "\\webpages";

    /*********************************************************************************************************************
     ** The 'getFeaturePath' is utilized to retrieve directories for each module.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getFeaturePath() {
        return createDirectory(RESULTS_PATH +
            switch (scenario.getFeature()) {
                case "UserInterface" -> USER_INTERFACE_FOLDER;
                case "BetInformation" -> BET_INFORMATION_FOLDER;
                case "Gameplay" -> GAMEPLAY_FOLDER;
                case "Functionality" -> FUNCTIONALITY_FOLDER;
                case "Payout" -> PAYOUT_FOLDER;
                case "ResultAndStatistics" -> RESULT_AND_STATS_FOLDER;
                default -> throw new IllegalArgumentException("Invalid Feature Name");
            }
        );
    }

    /*********************************************************************************************************************
     ** The 'getTextFilePath' function is used to get directories for storing data and generating text file.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getTextFilePath() {
        return createDirectory(RESULTS_PATH);
    }

    /*********************************************************************************************************************
     ** The 'getScreenshotPath' function is used to get directories for storing screenshots for each module.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getScreenshotPath(String folderName) {
        return createDirectory(getFeaturePath() + SCREENSHOTS_FOLDER + "\\" + folderName);
    }

    /*********************************************************************************************************************
     ** The 'getScreenshotPath' function is used to get directories for storing screenshots for each module.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static String getWebPagePath() {
        return createDirectory(getFeaturePath() + WEBPAGES_FOLDER);
    }

    /*********************************************************************************************************************
     ** The 'createDirectory' method is used to generate a specific folder within the test directory.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    private static String createDirectory(String path) {
        File folder = new File(path);
        if (!folder.exists()) {
            boolean success = folder.mkdirs();
            if (success) System.out.println();
            else System.err.println();
        }
        return path;
    }

}

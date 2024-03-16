package utilities.features;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import settings.AutomationSetup;
import utilities.handlers.DirectoryHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotFeature extends AutomationSetup {

    /*********************************************************************************************************************
     ** The 'capture' method is used to capture a screenshot in case of failure in every test scenario.
     *********************************************************************************************************************/

    @SuppressWarnings("unused")
    public static void capture(String folderName, String fileName) {
        try {
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
            String path = new File(DirectoryHandler.getScreenshotPath(folderName)).getAbsolutePath() +
                    File.separator + currentTime + " " + fileName + ".png";
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            FileUtils.writeByteArrayToFile(new File(path), screenshot);
        } catch (IOException e) { e.printStackTrace(); }
    }

    @SuppressWarnings("unused")
    public static void capture(String folderName) {
        try {
            if (!ignoreScenario(scenario.getName())) {
                String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
                String path = new File(DirectoryHandler.getScreenshotPath(folderName)).getAbsolutePath() +
                        File.separator + currentTime + " " + scenario.getName() + ".png";
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                FileUtils.writeByteArrayToFile(new File(path), screenshot);
                scenario.attach(screenshot, "image/png", "image");
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    /*********************************************************************************************************************
     ** The 'ignoreScenario' method determines whether a scenario needs to be excluded from screenshot capture.
     *********************************************************************************************************************/

    private static boolean ignoreScenario(String scenarioName) {
        String[] ignoredScenarioList = new String[] {
                "PO Fetch"
        };

        for (String ignoredScenario : ignoredScenarioList)
            if (scenarioName.contains(ignoredScenario)) return true;
        return false;
    }

}

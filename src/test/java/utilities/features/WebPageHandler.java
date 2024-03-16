package utilities.features;

import settings.AutomationSetup;
import utilities.handlers.DirectoryHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SuppressWarnings("unused")
public class WebPageHandler extends AutomationSetup {

    @SuppressWarnings("unused")
    public static void saveHtml(String fileName) {
        try (FileWriter writer = new FileWriter(
                new File(DirectoryHandler.getWebPagePath()).getAbsolutePath() +
                        File.separator + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")) + " " + fileName + ".html"
        )) {
            String htmlContent = driver.getPageSource();
            writer.write(htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package engine;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class GoogleChromeDriver extends ChromeDriver {

    GoogleChromeDriver() {
        super(getCaps());
    }

    private static ChromeOptions getCaps() {
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        chromeOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        chromeOptions.setCapability("ignoreZoomSetting", true);
        chromeOptions.setCapability("requireWindowFocus", false);
        chromeOptions.setCapability("enablePersistentHover", false);

//        chromeOptions.addArguments("--headless");

        return chromeOptions;
    }

}



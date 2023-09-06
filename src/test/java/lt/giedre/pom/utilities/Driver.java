package lt.giedre.pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {
    private static WebDriver webDriver;

    public static void setChromeDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("--start-maximized");
        webDriver = new ChromeDriver(optionsChrome);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void quitWebDriver() {
        webDriver.quit();
    }
}

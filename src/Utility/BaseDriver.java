package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.logging.*;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test",
            "UI Test", "TABMenu Test", "Search Test", "Order Test"})
    public void startUpOperations() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        driver.get("https://demo.nopcommerce.com/");

    }

    @AfterClass(groups = {"Smoke Test", "Registiration Test", "Login Test", "Logout Test"
            , "UI Test", "TABMenu Test", "Search Test", "Order Test"})
    public void closingOperations() {
        Tools.wait(3);

        driver.quit();

    }
}

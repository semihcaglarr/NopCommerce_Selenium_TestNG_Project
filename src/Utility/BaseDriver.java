package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;

    public static WebDriverWait wait;

    @BeforeClass
    public void startUpOperations() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        wait = new WebDriverWait(driver, Duration.ofSeconds(25));

    }

    @AfterClass
    public void closingOperations() {
        Tools.wait(3);

        driver.quit();

    }
}

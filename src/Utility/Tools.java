package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Tools {

    public static void wait(int limit) {
        try {
            Thread.sleep(limit * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ActionScroll(WebElement element) {
        Actions driverAksiyon = new Actions(BaseDriver.driver);
        Action aksiyon = driverAksiyon.scrollToElement(element).build();
        BaseDriver.wait.until(ExpectedConditions.visibilityOf(element));
        aksiyon.perform();
       // new Actions(BaseDriver.driver).scrollToElement(element).build().perform();
    }

    public static void ActionClick(WebElement element) {
        Actions driverAksiyon = new Actions(BaseDriver.driver);
        Action aksiyon = driverAksiyon.moveToElement(element).click().build();
        BaseDriver.wait.until(ExpectedConditions.visibilityOf(element));
        aksiyon.perform();
    }

    public static void ActionHover(WebElement element) {
        Actions driverAksiyon = new Actions(BaseDriver.driver);
        Action aksiyon = driverAksiyon.moveToElement(element).build();
        BaseDriver.wait.until(ExpectedConditions.visibilityOf(element));
        aksiyon.perform();
    }

    public static void SelectMenu(WebElement element, String value) {
        Select select = new Select(element);
        BaseDriver.wait.until(ExpectedConditions.elementToBeClickable(element));
        select.selectByValue(value);
    }

    public static void JavaScriptClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) BaseDriver.driver;
        jse.executeScript("arguments[0].click();", element);
    }

    public static void JavaScriptScroll(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) BaseDriver.driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static int randomGenerator(int until) {
        return (int) (Math.random() * until);
    }

    public static boolean ListContainsString(List<WebElement> list, String wordToSearch) {
        boolean foundIn = false;

        for (WebElement element : list) {

            if (element.getText().toLowerCase().equals(wordToSearch.toLowerCase())) {
                foundIn = true;
            }
        }
        return foundIn;
    }


}

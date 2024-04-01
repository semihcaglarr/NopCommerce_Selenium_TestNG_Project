package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Tools {

    public static void wait(int limit) {
        try {
            Thread.sleep(limit * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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






}

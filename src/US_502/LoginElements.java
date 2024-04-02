package US_502;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginElements {
    public LoginElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement login;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginButton;


}

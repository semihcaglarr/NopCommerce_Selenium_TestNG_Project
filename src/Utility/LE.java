package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LE {

    public LE() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

}

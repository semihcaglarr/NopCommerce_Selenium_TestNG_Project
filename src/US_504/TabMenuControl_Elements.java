package US_504;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TabMenuControl_Elements {
    public TabMenuControl_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenu;



}

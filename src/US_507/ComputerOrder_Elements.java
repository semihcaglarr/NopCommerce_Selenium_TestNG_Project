package US_507;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ComputerOrder_Elements {

    public ComputerOrder_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenu;


}

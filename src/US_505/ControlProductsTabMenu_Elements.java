package US_505;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ControlProductsTabMenu_Elements {
    public ControlProductsTabMenu_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//a[text()='Computers '])[1]")
    public WebElement computersTab;

    @FindBy(xpath = "(//a[text()='Electronics '])[1]")
    public WebElement electonicsTab;

    @FindBy(xpath = "(//a[text()='Apparel '])[1]")
    public WebElement apparelTab;

    @FindBy(xpath = "(//a[text()='Notebooks '])[1]")
    public WebElement noteBooksTab;

    @FindBy(xpath = "(//div[@class='product-viewmode']/a)[2]")
    public WebElement viewMode;


    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> noteBookNameList;


    @FindBy(xpath = "(//ul[@class='sublist first-level'])[1]//a")
    public List<WebElement> computersList;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[2]//a")
    public List<WebElement> electronicsList;

    @FindBy(xpath = "(//ul[@class='sublist first-level'])[3]//a")
    public List<WebElement> apparelList;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li/a")
    public List<WebElement> tabMenuList;


}

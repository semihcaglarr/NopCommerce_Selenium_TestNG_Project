package US_507;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ComputerOrder extends BaseDriver {


    @Test(groups = {"UI Test", "TABMenu Test", "Order Test"})
    public void TC_507() {
        Tools.wait(2);

        ComputerOrder_Elements coe = new ComputerOrder_Elements();

        Assert.assertTrue(coe.tabMenu.get(0).getText().contains("Computers"), "Tab menu did not display");
        Assert.assertTrue(coe.tabMenu.get(1).getText().trim().equals("Electronics"), "Tab menu did not display");
        Assert.assertEquals(coe.tabMenu.get(2).getText().trim(), "Apparel", "Tab menu did not display");
        Tools.ActionHover(coe.computers);
        Assert.assertTrue(coe.computersSubList.get(0).getText().trim().equals("Desktops"), "Desktops did not display");
        coe.computersSubList.get(0).click();
        wait.until(ExpectedConditions.urlContains("desktops"));
        Assert.assertTrue(coe.productList.get(0).getText().contains("Build"), "Desktop did not display");
        coe.productList.get(0).click();
        wait.until(ExpectedConditions.urlContains("build-your-own-computer"));

        int random = Tools.randomGenerator(coe.ramChoice.size());
        wait.until(ExpectedConditions.visibilityOfAllElements(coe.ramChoice));
//        Tools.ActionHover(coe.harddiscChoice.get(random));
        String rams = coe.ramChoice.get(random).getText();
        System.out.println(rams);
        coe.ramChoice.get(random).click();

        int random1 = Tools.randomGenerator(coe.harddiscChoice.size());
        wait.until(ExpectedConditions.visibilityOfAllElements(coe.harddiscChoice));
        //Tools.JavaScriptClick(coe.harddiscChoice.get(random1));
     //   Tools.ActionHover(coe.harddiscChoice.get(random1));
        String hardDisks = coe.harddiscChoice.get(random).getText();
        System.out.println(hardDisks);
        coe.harddiscChoice.get(random1).click();


        //Tools.JavaScriptClick(coe.addCart);
        Tools.ActionHover(coe.addCart);
        wait.until(ExpectedConditions.elementToBeClickable(coe.addCart));
//        String price1 = coe.priceValue1.getText();
        coe.addCart.click();
//
        wait.until(ExpectedConditions.elementToBeClickable(coe.greenAddCart));
        coe.greenAddCart.click();
//
        wait.until(ExpectedConditions.visibilityOf(coe.priceValue2));

        String rams2 = coe.ramValue.getText();
        System.out.println(rams2);
        String hardDisk2 = coe.hardDiskValue.getText();
        System.out.println(hardDisk2);

        driver.navigate().back();


        Tools.ActionHover(coe.gotoCart);
        wait.until(ExpectedConditions.elementToBeClickable(coe.gotoCart));
        coe.gotoCart.click();


    }
}
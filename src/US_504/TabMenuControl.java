package US_504;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabMenuControl extends BaseDriver {

    @Test(groups = {"UI Test", "TABMenu Test"})
    public void TabMenuControlTest() {

        TabMenuControl_Elements tmce = new TabMenuControl_Elements();

        Assert.assertTrue(tmce.tabMenu.get(0).getText().contains("Computers"));


    }
}

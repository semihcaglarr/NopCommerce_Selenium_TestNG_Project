package US_504;

import US_507.ComputerOrder_Elements;
import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabMenuControl extends BaseDriver {

    @Test(groups = {"UI Test", "TABMenu Test"})
    public void TabMenuControlTest() {

        ComputerOrder_Elements coe = new ComputerOrder_Elements();

        Assert.assertTrue(coe.tabMenu.get(0).getText().contains("Computers"));




    }
}

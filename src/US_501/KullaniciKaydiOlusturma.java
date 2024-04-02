package US_501;

import Utility.BaseDriver;
import Utility.LE;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KullaniciKaydiOlusturma extends BaseDriver {

    String eMailChange = "bugfighters" + ((int) (Math.random() * 1000)) + "@gmail.com";

    @Test(groups = {"Registiration", "Smoke"})
    public void TC_0101() {

        SoftAssert softAssert = new SoftAssert();

        Register_Elements re = new Register_Elements();

        driver.get("https://demo.nopcommerce.com/");

        re.register.click();

        wait.until(ExpectedConditions.urlContains("register"));

        re.radioButton.click();

        re.firstName.sendKeys("bug");

        re.lastName.sendKeys("fighters");

        Tools.SelectMenu(re.dateOfBirthDay, "27");
        Tools.SelectMenu(re.dateOfBirthMonth, "7");
        Tools.SelectMenu(re.dateOfBirthYear, "1995");

        re.email.sendKeys(eMailChange);
        Tools.wait(3);

        re.companyName.sendKeys("Los Pollos Hermanos");

        re.password.sendKeys("123456");
        re.confirmPassword.sendKeys("123456");

        re.registerButton.click();

        wait.until(ExpectedConditions.urlContains("register"));

        softAssert.assertTrue(re.resultText.getText().contains("completed"), "Unable to Login");
        softAssert.assertAll();

    }

}

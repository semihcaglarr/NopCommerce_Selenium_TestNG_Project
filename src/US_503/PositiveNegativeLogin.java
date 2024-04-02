package US_503;

import US_501.Register;
import US_501.Register_Elements;
import US_502.Login_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNegativeLogin extends BaseDriver {


    @Test(dataProvider = "credentials", groups = {"Smoke Test", "Login Test"})
    public void PositiveNegativeLoginTest(String email, String password) {
        Register_Elements re = new Register_Elements();
        Login_Elements le = new Login_Elements();

        le.login.click();

        if ((email.equals("kamil@gmail.com") ||
                email.equals("osman@gmail.com") ||
                email.equals("kamuran@gmail.com") ||
                email.equals("şerafettin@gmail.com") ||
                email.equals("müzeyyen@gmail.com") ||
                email.equals("şaban@gmail.com"))
                &&
                password.equals("ssdd122")
        ) {
            re.email.sendKeys(email);
            re.password.sendKeys(password);
            le.loginButton.click();

        } else if (email.equals(Register.eMailChange) && password.equals(Register.passwordChange)) {
            re.email.sendKeys(email);
            re.password.sendKeys(password);
            le.loginButton.click();

        }

    }

    @DataProvider
    public Object[][] credentials() {

        Object[][] credentialList = {
                {"kamil@gmail.com", "ssdd122"},
                {"osman@gmail.com", "ssdd122"},
                {"kamuran@gmail.com", "ssdd122"},
                {"şerafettin@gmail.com", "ssdd122"},
                {"müzeyyen@gmail.com", "ssdd122"},
                {"dilara@gmail.com", "ssdd122"},
                {Register.eMailChange, Register.passwordChange}
        };
        return credentialList;
    }
}

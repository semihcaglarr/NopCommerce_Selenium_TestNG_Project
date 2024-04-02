package US_502;

import US_501.Register;
import US_501.Register_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseDriver {

    @Test(groups = {"Smoke Test", "Login Test"})
    public void LoginTest() {

        Register_Elements re = new Register_Elements();
        LoginElements le = new LoginElements();

        le.login.click();
        Tools.wait(3);

        re.email.sendKeys(Register.eMailChange);
        re.password.sendKeys(Register.passwordChange);
        Tools.ActionClick(le.loginButton);

    }
}

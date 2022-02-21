package loginTest;

import baseTest.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)

public class InvalidLoginTest extends BaseTest {
    @Test
    @Parameters({
            "12, , Insert a valid email;Password is required",
            "12,111, Insert a valid email;"
    })
    public void loginErrors(String email, String passWord, String errors){
        loginPage.openLoginPage();
        loginPage.closePromotion();
        loginPage.openProfile();
        loginPage.openRegistration();
        loginPage.enterEmailInSignIn(email);
        loginPage.enterPassWordInSignIn(passWord);
        loginPage.clickOnButtonSignIn();
        loginPage.checkErrorsMessages(errors);

    }

}

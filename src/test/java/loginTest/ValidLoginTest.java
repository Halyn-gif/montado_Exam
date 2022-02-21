package loginTest;

import baseTest.BaseTest;
import libs.TestData;
import org.junit.Test;

public class ValidLoginTest extends BaseTest {
    @Test
    public void validLogin(){
        loginPage.openLoginPage();
        loginPage.closePromotion();
        loginPage.openProfile();
        loginPage.openRegistration();
        loginPage.enterEmailInSignIn(TestData.VALID_EMAIL);
        loginPage.enterPassWordInSignIn(TestData.VALID_PASSWORD);
        loginPage.clickOnButtonSignIn();


        checkExpectedResult("button LOGOUT is not visible",homePage.isButtonLogOutPresent(),true);


    }
}

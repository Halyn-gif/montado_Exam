package addToCartTest;

import baseTest.BaseTest;
import org.junit.Test;

public class AddToCartTest extends BaseTest {
    @Test
    public void addCart(){
        loginPage
                .loginWithValidCred()
                //.checkIsButtonLogoutVisible()
                .clickOnButtonCorkBags()
                .clickOnButtonCardTitle()
                .clickOnButtonAddToCart()
                .clickOnButtonCart()
                .checkIsButtonsTotalVisible();



















    }
}

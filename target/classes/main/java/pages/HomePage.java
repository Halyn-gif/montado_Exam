package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//*[@class='m-t-1 nav-brand hidden-md-down']")
    private WebElement buttonLogOut;

    @FindBy(xpath =".//*[@hreflang='EN' and text()='Accessories']")

    private WebElement buttonCorkBags;

    @FindBy(xpath = ".//*[@id='choose-color']")
            //".//*[@class='custom-control-description']")
    private WebElement buttonColors;

    @FindBy(xpath = ".//*[@id='btnAddCart']")
    private WebElement buttonAddToCart;

    @FindBy(xpath =".//*[@id='totalCartCount']")
    private WebElement buttonTotal;


    public boolean isButtonTotalPresent() {
        return isElementPresent(buttonTotal);
    }


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isButtonLogOutPresent(){
        return isElementPresent(buttonLogOut);

    }

    public HomePage checkIsButtonLogoutVisible() {
        Assert.assertTrue("Button Log Out is not displayed", isButtonLogOutPresent());
        return this;
    }

    public AddCorkBagsPage clickOnButtonCorkBags() {
        clickOnElement(buttonCorkBags);
        return new AddCorkBagsPage(webDriver);
    }

    public HomePage clickOnButtonChoiceColor() {
        clickOnElement(buttonColors);
        return new HomePage(webDriver);


    }

    public AddCorkBagsPage clickOnButtonAddToCart() {
        clickOnElement(buttonAddToCart);
        return new AddCorkBagsPage(webDriver);
    }



    public HomePage checkIsButtonsTotalVisible() {
       Assert.assertTrue("is not visible", isButtonTotalPresent());
        return this;
    }
}





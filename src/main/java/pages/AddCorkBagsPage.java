package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCorkBagsPage extends ParentPage{

    @FindBy(xpath = ".//*[@id='bcLast'] ")
    private WebElement visibleTitle;

    @FindBy(xpath = ".//*[@class='card-title' and text()='Cleaning Sponge']")
    private WebElement buttonCardTitle;

    @FindBy(xpath = ".//*[@class='btn btn-primary btn-block' and text()='View Cart']")
    private WebElement buttonCart;


    public AddCorkBagsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddCorkBagsPage checkIsBagsTitlePresent(){
        Assert.assertTrue("Bags title is not present", isElementPresent(visibleTitle) );
        return this;
    }


    public HomePage clickOnButtonCardTitle() {
        clickOnElement(buttonCardTitle);
        return new HomePage(webDriver);
    }


    public HomePage clickOnButtonCart() {
        clickOnElement(buttonCart);
        return new HomePage(webDriver);
    }
}

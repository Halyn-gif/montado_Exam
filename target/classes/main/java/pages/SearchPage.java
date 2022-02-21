package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends ParentPage{

    @FindBy(xpath = ".//*[@id='top-search']")
    private WebElement buttonSearch;
    @FindBy(xpath = ".//*[@placeholder='Search...']")
    private WebElement inputValidProducts;
    @FindBy(xpath = ".//*[@id='lupaBtn']")
    private WebElement buttonLupa;


    public SearchPage(WebDriver webDriver){super(webDriver);}

    public void openSearchPage(){
        try {
            webDriver.get("https://www.montado.pt/en/home");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not work with SearchPage" + e);
            Assert.fail("Can not work with SearchPage");
        }
    }
    public void closePromotion() {
        try {
            WebElement element = webDriver.findElement(By.xpath(".//*[@class='cc-compliance']"));
            element.click();
            logger.info("was closed");

        } catch (Exception e) {
            logger.error("Can not closed element" + e);
            Assert.fail("Can not closed element" + e);
        }
    }
    public void clickOnButtonSearch(){
        clickOnElement(buttonSearch);

    }
    public void enterProduct(String validProducts) { enterTextToElement(inputValidProducts, validProducts);
    }
    public void clickOnLupa() {
        clickOnElement(buttonLupa);
    }


}

package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver webDriver;
    WebDriverWait webDriverWait10, webDriverWait15;



    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        webDriverWait10 = new WebDriverWait(webDriver, 10);
        webDriverWait15 = new WebDriverWait(webDriver, 15);
    }

    protected void enterTextToElement(WebElement webElement, String text){
        try{
            webElement.sendKeys(text);
            logger.info("'" + text + "' was inputted in element ");
        }catch (Exception e){
            writeErrorAndStopTest(e);
        }
    }
    protected void clickOnElement(WebElement webElement){
        try {
            webDriverWait10.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            logger.info("Element was clicked");
        }catch (Exception e){
            writeErrorAndStopTest(e);
        }
    }

    protected boolean isElementPresent(WebElement webElement){
        try {
           // return webElement.isDisplayed();
            boolean state = webElement.isDisplayed();
            if (state){
                logger.info("Element present");
            }else {
                logger.info("Element is not present");
            }
            return state;
        }catch (Exception e){
            logger.info("Element is not present");
            return false;
        }
    }
    protected void selectText(WebElement dropDown, String text){
        try{
            Select select = new Select(dropDown);
            select.selectByVisibleText(text);
            logger.info("'" + text + " ' was selected in dropdown");
        }catch (Exception e){
            writeErrorAndStopTest(e);
        }
    }

    private void writeErrorAndStopTest(Exception e) {
        logger.error("can not work with element" + e);
        Assert.fail("can not work with element" + e);


    }



}

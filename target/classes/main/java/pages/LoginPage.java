package pages;

import libs.TestData;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends ParentPage {
    @FindBy(xpath = ".//*[@id='userSigninLogin']")
    private WebElement inputEmail;

    @FindBy(xpath = ".//*[@id='userSigninPassword']")
    private WebElement inputPassWord;

    @FindBy(xpath = ".//*[@class='btn btn-primary btn-wide' and text()='Login']")
    private WebElement buttonSignIn;

    @FindBy(xpath = ".//*[@class='errorMsg visible']")
   private List<WebElement> actualListOfErrors;
    final String listErrorsLocator = ".//*[@class='errorMsg visible']";


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openLoginPage() {
        try {
            webDriver.get("https://www.montado.pt/en/home");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not work with LoginPage" + e);
            Assert.fail("Can not work with LoginPage");
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

    public void openProfile() {
        try {
            WebElement element = webDriver.findElement(By.xpath(".//*[@class='nav-link icon-user dropdown-toggle']"));
            element.click();
            logger.info("was opened");
        } catch (Exception e) {
            logger.error("Can not opened element" + e);
            Assert.fail("Can not opened element" + e);
        }
    }

    public void openRegistration() {
        try {
            WebElement element = webDriver.findElement(By.xpath(".//*[@class='dropdown-menu']"));
            element.click();
            logger.info("was opened");
        } catch (Exception e) {
            logger.error("Can not opened element" + e);
            Assert.fail("Can not opened element" + e);
        }
    }

    public void enterEmailInSignIn(String email) {
        enterTextToElement(inputEmail, email);
    }

    public void enterPassWordInSignIn(String passWord) {
        enterTextToElement(inputPassWord, passWord);
    }

    public void clickOnButtonSignIn() {
        clickOnElement(buttonSignIn);
    }
    //WebElement element = webDriver.findElement(By.xpath(".//*[@class='nav-link icon-user dropdown-toggle']"));

    public void fillLoginFormAndSubmit(String email, String passWord){
        openLoginPage();
        closePromotion();
        openProfile();
        openRegistration();
        enterEmailInSignIn(email);
        enterPassWordInSignIn(passWord);
        clickOnButtonSignIn();
    }

    public HomePage loginWithValidCred(){
        fillLoginFormAndSubmit(TestData.VALID_EMAIL, TestData.VALID_PASSWORD);
        return new HomePage(webDriver);
    }


    public void checkErrorsMessages(String expectedErrors) {
        String[] errorArray = expectedErrors.split(";");

        webDriverWait10.withMessage("Number Of Messages")
                .until(ExpectedConditions.numberOfElementsToBe(By.xpath(listErrorsLocator), errorArray.length));
        Assert.assertEquals(actualListOfErrors.size(), errorArray.length);

        SoftAssertions softAssertions = new SoftAssertions();

        ArrayList<String> actualTextErrors = new ArrayList<>();

        for (WebElement element :actualListOfErrors) {
            actualTextErrors.add(element.getText());

        }
        for (int i = 0; i < errorArray.length; i++) {
           softAssertions.assertThat(errorArray[i]).isIn(actualTextErrors);

       }

        softAssertions.assertAll();


    }


}















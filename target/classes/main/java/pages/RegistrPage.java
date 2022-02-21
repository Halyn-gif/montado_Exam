package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrPage extends ParentPage{

    @FindBy(id = "registerName")
    private WebElement inputName;

    @FindBy(id = "registerApelido")
    private WebElement inputLastName;

    @FindBy(id = "jkshop_ds_address")
    private WebElement inputValidAdress;

    @FindBy(xpath = ".//*[@class='custom-select']")
    private WebElement buttonCountry;

    @FindBy(xpath = ".//select//option[@value='Alemanha' and text()='Germany']")
    private WebElement buttonChangeCountry;

    @FindBy(id = "jkshop_ds_city")
    private WebElement inputValidCity;

    @FindBy(id = "jkshop_ds_county")
    private WebElement inputValidRegion;

    @FindBy(id = "jkshop_ds_postcode")
    private WebElement inputValidZipCode;

    @FindBy(id="registerEmail")
    private WebElement inputEmail;

    @FindBy(id = "registerTelefone")
    private WebElement inputPhoneNumber;

    @FindBy(id = "registerPassword")
    private WebElement inputPassWord;

    @FindBy(id = "accountPasswordConfirm")
    private WebElement inputReapetPassWord;

    @FindBy(xpath = ".//*[@class='btn btn-primary btn-wide' and text()='Create Account']")
    private WebElement buttonLogIn;

    public RegistrPage(WebDriver webDriver) {super(webDriver);}

    public void openRegistrPage() {
        try {
            webDriver.get("https://www.montado.pt/en/home");
            logger.info("Login page was opened");
        } catch (Exception e) {
            logger.error("Can not work with RegistrPage" + e);
            Assert.fail("Can not work with RegistrPage");
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
    } public void enterValidFirstName(String validName){
        enterTextToElement(inputName, validName);
    }
    public void enterValidLastName(String validLastName){
        enterTextToElement(inputLastName,validLastName);
    }
    public void enterValidAdress(String validAdress){
        enterTextToElement(inputValidAdress, validAdress);

    }
    public void clickOnButtonCountry(){
        clickOnElement(buttonCountry);
    }
    public void clickChangeCountry(){
        clickOnElement(buttonChangeCountry);
    }
    public void enterCity(String validCity){
        enterTextToElement(inputValidCity, validCity);
    }
    public void enterRegion(String validRegion){
        enterTextToElement(inputValidRegion, validRegion);
    }

    public void enterZipCode(String validZipCode){
        enterTextToElement(inputValidZipCode, validZipCode);
    }

    public void enterEmail(String email_valid){
        enterTextToElement(inputEmail, email_valid);
    }

    public void enterPhoneNumber(String number){
        enterTextToElement(inputPhoneNumber, number);
    }

    public void enterPassWord(String passWord){
        enterTextToElement(inputPassWord, passWord);
    }

    public void enterReapetPassWord(String reapetPassWord){
        enterTextToElement(inputReapetPassWord, reapetPassWord);
    }

    public void clickOnButtonLogIn(){
        clickOnElement(buttonLogIn);
    }

}

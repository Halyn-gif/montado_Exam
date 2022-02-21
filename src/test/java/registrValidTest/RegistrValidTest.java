package registrValidTest;

import baseTest.BaseTest;
import org.junit.Test;

import java.util.Random;

public class RegistrValidTest extends BaseTest {
    Random rand = new Random();
    int n = rand.nextInt(100) + 1;
    String email= "dolynahalyna9" + n + "@gmail.com";

    @Test
    public void registrValid(){
        registrPage.openRegistrPage();
        registrPage.closePromotion();
        registrPage.openProfile();
        registrPage.openRegistration();
        registrPage.enterValidFirstName("Halyna");
        registrPage.enterValidLastName("Dolyna");
        registrPage.enterValidAdress("Ulmenstr 27");
        registrPage.clickOnButtonCountry();
        registrPage.clickChangeCountry();
        registrPage.enterCity("Stadtkyll");
        registrPage.enterRegion("Stadtkyll");
        registrPage.enterZipCode("54589");
        registrPage.enterEmail(email);
        registrPage.enterPhoneNumber("+351964489289");
        registrPage.enterPassWord("123456qwerty");
        registrPage.enterReapetPassWord("123456qwerty");
        registrPage.clickOnButtonLogIn();










    }
}

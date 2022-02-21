package loginTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver webDriver;

    @Test
    public void validLogin() {
        File fileFF = new File("./src/drivers/96.1/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.montado.pt/en/home");
        System.out.println("Site was opened");

        //webDriver.findElement(By.xpath(".//*[@class='promo-banner__close']")).click();
        //webDriver.findElement(By.xpath(".//img[@alt='profile']")).click();
        webDriver.findElement(By.xpath(".//*[@class='cc-compliance']")).click();
        webDriver.findElement(By.xpath(".//*[@class='nav-link icon-user dropdown-toggle']")).click();
        webDriver.findElement(By.xpath(".//*[@class='dropdown-menu']")).click();
        webDriver.findElement(By.xpath(".//*[@id='userSigninLogin']")).sendKeys("dolinagalina9@gmail.com");
        webDriver.findElement(By.xpath(".//*[@id='userSigninPassword']")).sendKeys("123456qwerty");
        webDriver.findElement(By.xpath(".//*[@class='btn btn-primary btn-wide' and text()='Login']")).click();
        System.out.println();

        webDriver.quit();


    }

    @Test
    public void signUp() {
        File fileFF = new File("./src/drivers/98/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        webDriver.get("https://www.montado.pt/en/home");
        System.out.println("Site was opened");
        webDriver.findElement(By.xpath(".//*[@class='cc-compliance']")).click();
        webDriver.findElement(By.xpath(".//*[@class='nav-link icon-user dropdown-toggle']")).click();
        webDriver.findElement(By.xpath(".//*[@class='dropdown-menu']")).click();
        webDriver.findElement(By.id("registerName")).sendKeys("Halyna");
        webDriver.findElement(By.id("registerApelido")).sendKeys("Dolyna");
        webDriver.findElement(By.id("jkshop_ds_address")).sendKeys("Ulmenstr 27");
        webDriver.findElement(By.xpath(".//*[@class='custom-select']")).click();
        webDriver.findElement(By.xpath(".//select//option[@value='Alemanha' and text()='Germany']")).click();
        webDriver.findElement(By.id("jkshop_ds_city")).sendKeys("Stadtkyll");
        webDriver.findElement(By.id("jkshop_ds_county")).sendKeys("Stadtkyll");
        webDriver.findElement(By.id("jkshop_ds_postcode")).sendKeys("54589");

        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        String email= "dolynahalyna9" + n + "@gmail.com";
        //System.out.println("email");
        webDriver.findElement(By.id("registerEmail")).sendKeys(email);
        webDriver.findElement(By.id("registerTelefone")).sendKeys("+351964489289");
        webDriver.findElement(By.id("registerPassword")).sendKeys("123456qwerty");
        webDriver.findElement(By.id("accountPasswordConfirm")).sendKeys("123456qwerty");
        webDriver.findElement(By.xpath(".//*[@class='btn btn-primary btn-wide' and text()='Create Account']" )).click();


        webDriver.quit();






    }
}


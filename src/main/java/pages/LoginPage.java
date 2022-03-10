package pages;

import org.openqa.selenium.By;

import java.time.Duration;

import static pages.HomePage.cookieButton;
import static pages.HomePage.welcomeBanner;

 
public class LoginPage extends BasePage {
    public LoginPage(){super();}


    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By input = (By.xpath("//input[@name='email']"));
    public static By password = (By.id("password"));
    public static By loginButton = By.id("loginButton");

//    public LoginPage skipBanner() {
//        driver.findElement(welcomeBanner).click();
//        driver.findElement(cookieButton).click();
//        return this;
//    }

    public LoginPage fillLoginDetails() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
        driver.findElement(input).sendKeys("test.class@gmail.com");
        driver.findElement(password).sendKeys("Pass@123");
        driver.findElement(loginButton).click();
        return this;
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public static By welcomeBanner = By.xpath("//button[@aria-label = 'Close Welcome Banner']");
    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By cookieButton = By.xpath("//a[@aria-label='dismiss cookie message']");

    public HomePage skipBanner() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(welcomeBanner).click();
        driver.findElement(cookieButton).click();
        return this;
    }

    public void navigateToLogin() {
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
    }
}



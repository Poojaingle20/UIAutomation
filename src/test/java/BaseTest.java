import Drivers.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

import java.io.IOException;


public class BaseTest extends BasePage {

    @BeforeMethod
    public void setUp() throws InterruptedException , IOException {
        Thread.sleep(2000);
        this.driver = Driver.driverInit();
        driver.get("http://juice-shop.herokuapp.com");
        new HomePage().skipBanner().navigateToLogin();
        driver.manage().window().maximize();
    }
}


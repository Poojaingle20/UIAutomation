import org.testng.annotations.Test;
import pages.UserRegistrationPage;


public class UserRegistration extends BaseTest {


        @Test
        public void test() throws InterruptedException {
            new UserRegistrationPage().clickOnNewCustomerLink().fillRegistrationFormAndSubmit();
        }
}
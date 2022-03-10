import org.testng.annotations.Test;
import pages.LoginPage;

public class seleniumTest extends BaseTest {
    public seleniumTest() {
        super();
    }


    @Test
    public void test() throws InterruptedException {
        new LoginPage().fillLoginDetails();
    }
}

package logInPageTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LogInPage;

public class LogInPageTests extends BaseTests{

    LogInPage logInPage = new LogInPage(driver);

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLogInWithValidUsernamePassword() {
//        Ovde kucate testove, šta konkretno da se izvrši, koji koraci i asertacija
    }

}

package features;

import org.example.base.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagerPage;
import pages.NewCustomerPage;

public class AddCustomerTests extends FrameworkInitialize {

    @Before
    public void Intialize() {

        initializeBrowser(BrowserType.Chrome);
        DriverContext.browser.GotoUrl("https://demo.guru99.com/V4/");
    }

    @Test
    public void Login() {
        CurrentPage = GetInstance(LoginPage.class);
        CurrentPage.As(LoginPage.class).inputUserNameAndPassword("/Users/mac/Documents/dev/framework/Demo/src/test/resources/data/account/ValidAccount.json");
        CurrentPage.As(LoginPage.class).clickLogin();
        CurrentPage.As(HomePage.class).verifyUserSignedSuccessfully();
        CurrentPage = CurrentPage.As(HomePage.class).selectNewCustomerMenu();
        CurrentPage.As(NewCustomerPage.class).inputNewCustomerInfo("/Users/mac/Documents/dev/framework/Demo/src/test/resources/data/account/ValidCustomer.json");
        CurrentPage = CurrentPage.As(NewCustomerPage.class).SubmitNewCustomer();
        CurrentPage.As(ManagerPage.class).verifyCreatedCustomerSuccessfully();
        CurrentPage.As(ManagerPage.class).verifyInfoTheCustomerCreated();

    }

    @After
    public void After() {
        DriverContext.browser.close();
    }
}
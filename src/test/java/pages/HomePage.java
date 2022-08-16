package pages;

import org.example.base.Actions;
import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage() {

    }

    Actions actions = new Actions();

    @FindBy(how = How.LINK_TEXT, using = "New Customer")
    public WebElement textLNewCustomer;

//    @FindBy(how = How.XPATH, using = "//*[@behavior=\"alternatezz\"]")
//    public Locator txtWelcomeMessage;

    private final By txtWelcomeMessage = By.xpath("//*[@behavior=\"alternatezz\"]");


    public NewCustomerPage selectNewCustomerMenu() {
        textLNewCustomer.click();
        return GetInstance(NewCustomerPage.class);
    }


    public void verifyUserSignedSuccessfully() {
        // actions.verifyObjectVisibility(txtWelcomeMessage);
    }
}

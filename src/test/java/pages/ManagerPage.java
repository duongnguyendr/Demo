package pages;

import org.example.base.Actions;
import org.example.base.BasePage;
import org.openqa.selenium.By;

public class ManagerPage extends BasePage {
    Actions actions = new Actions();

    private By txtCreatedCustomerSuccessfully = By.xpath("//p[text()=\"Customer Registered Successfully!!!\"]");
    String xpathDyInfoCustomer = "//td[text()='%s']//following::td";


    public void verifyInfoTheCustomerAttribute(String locatorDy, String nameAttribute) {
        actions.waitAndClick(String.format(xpathDyInfoCustomer, nameAttribute));
    }

    public void verifyInfoTheCustomerCreated() {

    }

    public void verifyCreatedCustomerSuccessfully() {
        actions.verifyObjectVisibility(txtCreatedCustomerSuccessfully);
    }
}

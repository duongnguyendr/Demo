package pages;

import org.example.base.BasePage;
import org.example.utilities.JsonUtil;
import org.example.utilities.JsonUtil.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCustomerPage extends BasePage {
    JsonUtil jsonUtil = new JsonUtil();

    @FindBy(how = How.NAME, using = "name")
    public WebElement textBName;

//    @FindBy(how = How.NAME, using = "name")
//    public WebElement Gender;

    @FindBy(how = How.ID, using = "dob")
    public WebElement txtdob;

    @FindBy(how = How.NAME, using = "addr")
    public WebElement txtAAddress;

    @FindBy(how = How.NAME, using = "city")
    public WebElement txtBCity;

    @FindBy(how = How.NAME, using = "state")
    public WebElement txtBState;

    @FindBy(how = How.NAME, using = "pinno")
    public WebElement txtBPinNumber;

    @FindBy(how = How.NAME, using = "telephoneno")
    public WebElement txtBTeleNumber;

    @FindBy(how = How.NAME, using = "emailid")
    public WebElement txtBEmail;

    @FindBy(how = How.NAME, using = "password")
    public WebElement textBPassword;


    @FindBy(how = How.NAME, using = "btnLogin")
    public WebElement btnSubmit;


    public void inputNewCustomerInfo(String path) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textBName.sendKeys(jsonUtil.getJsonFromKey(path, "Name"));
        txtdob.sendKeys(jsonUtil.getJsonFromKey(path, "Dob"));
        txtAAddress.sendKeys(jsonUtil.getJsonFromKey(path, "Address"));
        txtBCity.sendKeys(jsonUtil.getJsonFromKey(path, "City"));
        txtBState.sendKeys(jsonUtil.getJsonFromKey(path, "State"));
        txtBPinNumber.sendKeys(jsonUtil.getJsonFromKey(path, "PIN"));
        txtBTeleNumber.sendKeys(jsonUtil.getJsonFromKey(path, "Mobile"));
        txtBEmail.sendKeys(jsonUtil.getJsonFromKey(path, "Email"));
        textBPassword.sendKeys(jsonUtil.getJsonFromKey(path, "Password"));
    }

    public NewCustomerPage SubmitNewCustomer() {
        btnSubmit.submit();
        return GetInstance(NewCustomerPage.class);
    }


}

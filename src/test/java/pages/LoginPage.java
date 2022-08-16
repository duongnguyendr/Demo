package pages;

import org.example.base.BasePage;
import org.example.utilities.JsonUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
    public LoginPage() {

    }

    JsonUtil jsonUtil = new JsonUtil();

    @FindBy(how = How.NAME, using = "uid")
    public WebElement textBUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement textBPassword;

    @FindBy(how = How.NAME, using = "btnLogin")
    public WebElement btnLogin;

    public void inputUserNameAndPassword(String path) {

        textBUserName.sendKeys(jsonUtil.getJsonFromKey(path, "Username"));
        textBPassword.sendKeys(jsonUtil.getJsonFromKey(path, "Pass"));

    }

    public HomePage clickLogin() {
        btnLogin.click();
        return GetInstance(HomePage.class);
    }


}

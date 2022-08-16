package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkInitialize extends Base {
    WebDriver driver = null;

    public void initializeBrowser(BrowserType browserTypes) {
        switch (browserTypes) {
            case Chrome: {
                System.setProperty("webdriver.chrome.driver", "D:\\Duong\\sources\\Demo\\src\\main\\resources\\driver\\chromedriver");
                driver = new ChromeDriver();
                break;
            }
            case Firefox: {
                System.out.println("Firefox BrowserType");
                DriverContext.setDriver(driver);
                break;
            }
        }
        // DriverContext.Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        DriverContext.setDriver(driver);
        DriverContext.browser = new Browser(driver);
    }
}

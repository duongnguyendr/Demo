package org.example.base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions extends Base {
    public Actions() {

    }

    private WebDriver _driver;
    private WebDriverWait explicitWait = new WebDriverWait(_driver, Duration.ofSeconds(15));

    public void verifyObjectVisibility(By locator) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitAndClick(By locator) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public void waitAndClick(String locator) {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getWebLocator(locator))).click();
    }

    public By getWebLocator(String locator) {
        return (By) _driver.findElement(By.xpath(locator));
    }


}

package org.example.base;

import org.openqa.selenium.WebDriver;

public class Browser extends Base {
    private WebDriver _driver;
    public BrowserType Type;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public void GotoUrl(String url) {
        _driver.get(url);
    }

    public void close() {
        _driver.close();
    }

    public void Maximize() {
        _driver.manage().window().maximize();
    }
}


package org.example.base;

import org.openqa.selenium.WebDriver;

public class DriverContext {
    public static WebDriver Driver;
    public static Browser browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
}

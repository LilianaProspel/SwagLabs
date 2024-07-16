package com.example.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {
    protected static AppiumDriver driver;
    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

    public static BaseTest initializeDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium:deviceName", "AppSwagLabs");
            capabilities.setCapability("appium:platformName", "Android");
            capabilities.setCapability("appium:platformVersion", "9");
            capabilities.setCapability("appium:automationName", "UiAutomator2");
            capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
            capabilities.setCapability("appium:app", "C:\\Users\\andre\\IdeaProjects\\ex-mobile-liliana-prospel\\ex-mobile-liliana-prospel\\SwagLabs\\src\\main\\java\\driver\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");

            String appiumServerUrl = "http://localhost:4723/wd/hub";

            driver = new AppiumDriver(new URL(appiumServerUrl), capabilities);
        } catch (MalformedURLException e) {
            LOGGER.log(Level.SEVERE, "URL mal formada", e);
        }
        return new BaseTest();
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
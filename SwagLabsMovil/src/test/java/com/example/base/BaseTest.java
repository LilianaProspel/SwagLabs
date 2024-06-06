package com.example.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    private static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

    public static BaseTest initializeDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AppSwaglabs");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability("appium:appActivity", "com.swaglabsmobileapp.MainActivity");
            capabilities.setCapability("appium:app", "C:\\Users\\andre\\IdeaProjects\\ex-mobile-liliana-prospel\\ex-mobile-liliana-prospel\\SwagLabs\\src\\main\\java\\driver\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");

            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            LOGGER.log(Level.SEVERE, "URL mal formada", e);
        }
        return new BaseTest();
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
}

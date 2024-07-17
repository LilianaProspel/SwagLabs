package com.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@content-desc='test-Username']")
    private WebElementFacade usernameField;

    @FindBy(xpath = "//*[@content-desc='test-Password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@content-desc='test-LOGIN']")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//*[@text='PRODUCTS']")
    private WebElementFacade productsTitle;

    @FindBy(className = "android.widget.TextView")
    private List<WebElementFacade> productsList;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean checkTitle() {
        return productsTitle.isDisplayed();
    }

    public boolean checkOneProduct() {
        return !productsList.isEmpty();
    }


}

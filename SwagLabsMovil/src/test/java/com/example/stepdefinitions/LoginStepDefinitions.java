package com.example.stepdefinitions;

import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import com.example.base.BaseTest;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    @Managed
    WebDriver driver;

    @Steps
    LoginPage loginPage;

    private BaseTest baseTest;

    @Before
    public void setUp() {
        baseTest = BaseTest.initializeDriver();
        loginPage = new LoginPage(baseTest.getDriver());
    }

    @Given("The user completes the form using username {string} and password {string}")
    public void completeLoginForm(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("the user presses the login button")
    public void pressLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("The user should see the title PRODUCTS")
    public void checkTheTitle() {
        loginPage.checkTitle();
    }

    @Then("The user should see at least one product")
    public void checkOneProduct() {
        loginPage.checkOneProduct();
    }
}

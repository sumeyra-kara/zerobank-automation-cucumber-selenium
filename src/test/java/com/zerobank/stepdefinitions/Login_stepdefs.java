package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefs {
    BasePage basePage=new LoginPage();
    LoginPage loginPage=new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.get("url"));

    }

    @When("user clicks on the signin menu")
    public void user_clicks_on_the_signin_menu() {
        basePage.signinMenu.click();
    }

    @When("user enters valid credentials and clicks on the sign in button")
    public void user_enters_valid_credentials_and_clicks_on_the_sign_in_button() {
        loginPage.login();
        Driver.getDriver().navigate().back();
    }

    @Then("verify that user can see username")
    public void verify_that_user_can_see_username() {
        String actual=basePage.accountNameInput.getText();
        String expected=ConfigReader.get("userName");
        Assert.assertTrue(actual.contains(expected));
    }

    @When("user enters {string} username {string} and clicks on the sign in button")
    public void user_enters_username_and_clicks_on_the_sign_in_button(String username, String password) {
        loginPage.login(username,password);
        Driver.getDriver().navigate().back();
    }

    @Then("verify that user can see {string}")
    public void verify_that_user_can_see(String username) {
        String actual=basePage.accountNameInput.getText();
        Assert.assertTrue(actual.contains(username));
    }

    @Then("verify that user can see {string} message")
    public void verify_that_user_can_see_message(String expectedMessage) {
        String actualAlertMessage=loginPage.alertMessage.getText();
        Assert.assertTrue(actualAlertMessage.contains(expectedMessage));
    }


    @When("user enters {string} username {string}")
    public void user_enters_username(String username, String password) {
      loginPage.loginInput.sendKeys(username);
      loginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {
       loginPage.signInButton.click();
    }


    @Then("user clicks on the log out")
    public void userClicksOnTheLogOut() {
        basePage.usernameName.click();
        basePage.logoutInput.click();
    }
}

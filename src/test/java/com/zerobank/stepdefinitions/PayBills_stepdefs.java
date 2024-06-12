package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.rowset.BaseRowSet;
import java.time.Duration;

public class PayBills_stepdefs {
    BasePage basePage=new LoginPage();
    OnlineBankingPage onlineBankingPage=new OnlineBankingPage();
    PayBillsPage payBillsPage = new PayBillsPage();

    @When("user clicks Pay Bills")
    public void user_clicks_pay_bills() {
        basePage.moreServicesForOnlineBanking.click();
        onlineBankingPage.payBillsInput.click();
    }

    @When("user enters {string} amount {string} date {string} description and clicks on the pay button")
    public void user_enters_amount_date_description_and_clicks_on_the_pay_button(String amount, String date, String description) {
        payBillsPage.pay(amount,date,description);
        BrowserUtils.waitFor(2);
    }
    @Then("verify that user can see message {string}")
    public void verify_that_user_can_see_message(String message) {
        Assert.assertTrue(payBillsPage.alertMessage.getText().contains(message));
        System.out.println("payBillsPage.alertMessage.getText() = " + payBillsPage.alertMessage.getText());
    }

    /*@Then("verify that user can see negative message {string}")
    public void verifyThatUserCanSeeNegativeMessage(String message) {

        if (payBillsPage.dateInput.getText()==null){
            String actualMessage = payBillsPage.dateInput.getAttribute("validationMessage");
            System.out.println("actualMessage = " + actualMessage);
            Assert.assertEquals(message,actualMessage);

        }else if (payBillsPage.amountInput.getText()==null){
            String actual = payBillsPage.amountInput.getAttribute("validationMessage");
            System.out.println("actual = " + actual);
            Assert.assertEquals(message,actual);
        }
    }

     */
    @Then("verify that user can see negative message {string} {string} amount {string} date")
    public void verify_that_user_can_see_negative_message_amount_date(String message, String amount, String date) {
        if (date.isEmpty()){
            String actualMessage = payBillsPage.dateInput.getAttribute("validationMessage");
            Assert.assertEquals(message,actualMessage);

        }else if (amount.isEmpty()){
            String actual = payBillsPage.amountInput.getAttribute("validationMessage");
            Assert.assertEquals(message,actual);

        } else if ((date.isEmpty())&(amount.isEmpty())) {
            String validationMessage = payBillsPage.amountInput.getAttribute("validationMessage");
            Assert.assertEquals(message,validationMessage);
        }
        //System.out.println("date = " + date);
        //System.out.println("amount = " + amount);
    }


}

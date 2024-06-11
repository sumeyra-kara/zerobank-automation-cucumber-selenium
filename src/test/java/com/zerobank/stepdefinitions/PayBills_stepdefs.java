package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    }
    @Then("verify that user can see message {string}")
    public void verify_that_user_can_see_message(String message) {
        Assert.assertTrue(payBillsPage.alertMessage.getText().contains(message));
        System.out.println("payBillsPage.alertMessage.getText() = " + payBillsPage.alertMessage.getText());
    }

    @Then("verify that user can see negative message {string}")
    public void verifyThatUserCanSeeNegativeMessage(String message) {
        Assert.assertTrue(payBillsPage.alertNegativeMessage.getText().contains(message));
    }
}

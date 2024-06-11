package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_stepdefs {
    BasePage basePage=new LoginPage();
    OnlineBankingPage onlineBankingPage=new OnlineBankingPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("user clicks Account Summary")
    public void user_clicks_account_summary() {
        basePage.moreServicesForOnlineBanking.click();
        onlineBankingPage.accountSummaryInput.click();

    }
    @When("verify the title should be {string}")
    public void verify_the_title_should_be(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @When("verify that user should be able to see following accounts")
    public void verify_that_user_should_be_able_to_see_following_accounts(List<String> accountTypes) {
        Assert.assertEquals(accountTypes, BrowserUtils.getElementsText(accountSummaryPage.accountTypes));
    }


    @When("verify that the user should be able to see following columns on the Credit Accounts")
    public void verify_that_the_user_should_be_able_to_see_following_columns_on_the_credit_accounts(List<String> creditAccountsColoumnName) {
        Assert.assertEquals(creditAccountsColoumnName, BrowserUtils.getElementsText(accountSummaryPage.creditAccountColumns));

    }
}

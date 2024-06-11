package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccuntAktivity_stepdefs {
    BasePage basePage=new LoginPage();
    OnlineBankingPage onlineBankingPage=new OnlineBankingPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    Select select;


    @When("user clicks Account Activity")
    public void user_clicks_account_activity() {
        basePage.moreServicesForOnlineBanking.click();
        onlineBankingPage.accountAktivityInput.click();

    }
    @When("verify that user can see on the account menu {string}") // saving gozukuyor mu?
    public void verify_that_user_can_see_on_the_account_menu(String menuName) {
        select = new Select(accountActivityPage.accountMenuDropDown);
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains(menuName));
    }

    @When("verify that user should be able to see following account menu") // account dropdown menusu
    public void verify_that_user_should_be_able_to_see_following_account_menu(List<String> accountDropDownMenuName) {
        List<WebElement> optionsList = select.getOptions();
        Assert.assertEquals(accountDropDownMenuName, BrowserUtils.getElementsText(optionsList));
    }

    @Then("verify that user should be able to see following transactions")
    public void verify_that_user_should_be_able_to_see_following_transactions(List<String> transactionsHeaderName) {
        Assert.assertEquals(transactionsHeaderName, BrowserUtils.getElementsText(accountActivityPage.accountActivityHeader));

    }
}

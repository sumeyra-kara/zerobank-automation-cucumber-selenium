package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class OnlineBankingPage extends BasePage{
    @FindBy(xpath = "//span[@id='account_summary_link']")
    public WebElement accountSummaryInput;

    @FindBy(xpath = "//span[@id='account_activity_link']")
    public WebElement accountAktivityInput;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsInput;


}

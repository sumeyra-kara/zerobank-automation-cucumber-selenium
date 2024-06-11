package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(xpath = "//select[@id='aa_accountId']")  //AccountActivity menu dropdown
    public WebElement accountMenuDropDown;

    @FindBy(xpath = "//table[@class='table table-condensed table-hover']//tr/th")  //accountActivity sütunlari-basliklar
    public List<WebElement> accountActivityHeader;

}

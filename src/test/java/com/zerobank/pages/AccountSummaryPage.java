package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(xpath = "//div[@class='offset2 span8']//h2") // accountSummary hesap turleri
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//table[@class='table'])[3]/thead//th")  //creditAccount sütunlari
    public List<WebElement> creditAccountColumns;




}

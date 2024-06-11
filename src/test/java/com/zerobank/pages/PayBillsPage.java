package com.zerobank.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{
    Faker faker;

    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//input[@id='sp_date']") // 2024-02-02 tarih bu formatta olmali
    public WebElement dateInput;

    @FindBy(xpath = "//input[@id='sp_description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;

    public void pay(String amount,String date,String description){
        amountInput.sendKeys(amount);
        dateInput.sendKeys(date);
        descriptionInput.sendKeys(description);
        payButton.click();
    }

    @FindBy(xpath = "//div[@id='alert_content']/span")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[text()='Fülle dieses Feld aus.']") //********???????
    public WebElement alertNegativeMessage;





}

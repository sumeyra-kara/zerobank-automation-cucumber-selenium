package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinMenu;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement accountNameInput;


    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement moreServicesForOnlineBanking;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement usernameName;

    @FindBy(xpath = "//a[@id='logout_link']")
    public WebElement logoutInput;





}

package com.zerobank.pages;

import com.zerobank.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertMessage;

    public void login(){
        loginInput.sendKeys(ConfigReader.get("userName"));
        passwordInput.sendKeys(ConfigReader.get("passWord"));
        signInButton.click();
    }

    public void login(String username, String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }
}

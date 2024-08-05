package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.utils.ConfigReader;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void enterUserNameAndPassword() {
        userName.sendKeys(ConfigReader.getValue("username"));
        password.sendKeys(ConfigReader.getValue("password"));
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}

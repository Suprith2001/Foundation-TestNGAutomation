package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void verifyUserIsAbleToLoginWithValidCredentials()
    {
        loginPage.openWebsite();
        loginPage.enterUserNameAndPassword();
        loginPage.clickLoginButton();
        Assert.assertTrue(homePage.isUserOnHomePage());
    }
}

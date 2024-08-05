package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

public class BaseTest {

    public LoginPage loginPage;
    public HomePage homePage;

    @BeforeMethod
    public void setUp() {
        ConfigReader.initProperties();
        DriverManager.createDriver();

        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}

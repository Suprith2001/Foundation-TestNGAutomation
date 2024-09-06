package com.automation.tests;

import com.automation.pages.CartPage;
import com.automation.pages.ProductPage;
import com.automation.pages.SearchResultPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

public class BaseTest {

    public HomePage homePage;
    public SearchResultPage resultPage;
    public ProductPage productPage;
    public CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        ConfigReader.initProperties();
        DriverManager.createDriver();

        homePage = new HomePage();
        resultPage = new SearchResultPage();
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @AfterMethod
    public void cleanUp() {
        DriverManager.getDriver().quit();
    }
}

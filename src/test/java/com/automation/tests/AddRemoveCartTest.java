package com.automation.tests;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveCartTest extends BaseTest {

    @Test
    public void verifyUserIsAbleToAddItemToTheCart() {
        homePage.openWebsite();
        homePage.clickOnSearchIcon();
        homePage.searchForItem(ConfigReader.getValue("search.item"));
        Assert.assertTrue(resultPage.isUserOnResultPage());
        resultPage.clickOnFirstProduct();
        Assert.assertTrue(productPage.isProductPageDisplayed());
        productPage.selectSize(ConfigReader.getValue("shirt.size"));
        productPage.addToCart();
        Assert.assertTrue(productPage.isProductAddedToCartMessageDisplayed());
        Assert.assertEquals("1", productPage.getCartItemCount());
    }

    @Test
    public void verifyUserIsAbleToRemoveItemFromTheCart() {
        homePage.openWebsite();
        homePage.clickOnSearchIcon();
        homePage.searchForItem(ConfigReader.getValue("search.item"));
        Assert.assertTrue(resultPage.isUserOnResultPage());
        resultPage.clickOnFirstProduct();
        Assert.assertTrue(productPage.isProductPageDisplayed());
        productPage.selectSize(ConfigReader.getValue("shirt.size"));
        productPage.addToCart();
        Assert.assertTrue(productPage.isProductAddedToCartMessageDisplayed());
        Assert.assertEquals("1", productPage.getCartItemCount());
        productPage.clickOnCartButton();
        Assert.assertTrue(cartPage.isCartPageDisplayed());
        cartPage.removeItemFromCart();
        Assert.assertEquals("Your cart is empty", cartPage.getEmptyTextMessage());
    }
}

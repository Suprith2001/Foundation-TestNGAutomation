package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//button[@name='add']")
    WebElement addToCartButton;

    @FindBy(xpath = "//label[@class='size__swatch']")
    List<WebElement> selectSize;

    @FindBy(id = "alert_message_product")
    WebElement addedToCartMsg;

    @FindBy(xpath = "//span[@class='cart-count-bubble']/span")
    WebElement cartItemCount;

    @FindBy(css = ".icon.icon-cart")
    WebElement cartIcon;

    public boolean isProductPageDisplayed() {
        return addToCartButton.isDisplayed() && selectSize.get(1).isDisplayed();
    }

    public void selectSize(String size) {
        selectSize.get(Integer.parseInt(size)).click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public boolean isProductAddedToCartMessageDisplayed() {
        return addedToCartMsg.isDisplayed();
    }

    public String getCartItemCount() {
        return cartItemCount.getText();
    }

    public void clickOnCartButton() {
        cartIcon.click();
    }


}

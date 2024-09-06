package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(className = "styles_TrashButton__deleteButton__8uIHq")
    WebElement deleteButton;

    @FindBy(css = ".upcart-checkout-button")
    WebElement checkOutButton;

    @FindBy(css = ".styles_CartPreview__empty__WFP86>h3")
    WebElement cartEmptyMessage;

    public boolean isCartPageDisplayed() {
        return checkOutButton.isDisplayed();
    }

    public void removeItemFromCart() {
        deleteButton.click();
    }

    public String getEmptyTextMessage() {
        return cartEmptyMessage.getText();
    }
}

package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "shopping_cart_container")
    WebElement cartContainer;

    public boolean isUserOnHomePage() {
        return cartContainer.isDisplayed();
    }
}

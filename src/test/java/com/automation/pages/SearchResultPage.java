package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//ul[@id='product-grid']//li")
    List<WebElement> listOfProducts;

    @FindBy(className = "facets__summary")
    WebElement filterButton;

    public void clickOnFirstProduct() {
        listOfProducts.get(0).click();
    }

    public boolean isUserOnResultPage() {
        return filterButton.isDisplayed() && listOfProducts.get(1).isDisplayed();
    }
}

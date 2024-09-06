package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".header__icon.header__icon--summary.header__icon--search.focus-inset.modal__toggle")
    WebElement searchOption;

    @FindBy(xpath = "//input[@class='search__input field__input']")
    WebElement searchInputField;

    public void openWebsite() {
        driver.navigate().to(ConfigReader.getValue("url"));
    }

    public void clickOnSearchIcon() {
        searchOption.click();
    }

    public void searchForItem(String value) {
        searchInputField.sendKeys(value);
        searchInputField.sendKeys(Keys.ENTER);
    }
}

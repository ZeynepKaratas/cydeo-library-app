package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// about:blank
public class BasePage {
    // No page elements added

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[.='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath="//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath="//span[.='Books']")
    public WebElement booksLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userNameLink;
}
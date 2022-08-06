package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class UserAndBookPage extends BasePage {

    @FindBy(tagName = "th")
    public List<WebElement> userTableHeader;

    @FindBy(tagName = "th")
    public List<WebElement> bookTableHeader;

    public UserAndBookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
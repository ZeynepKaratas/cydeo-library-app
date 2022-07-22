package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class UserPage extends BasePage {

    @FindBy(tagName = "th")
    public List<WebElement> userTableHeader;

    public UserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
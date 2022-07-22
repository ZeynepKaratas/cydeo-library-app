package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// https://library2.cydeo.com/login.html
public class LoginPage extends BasePage{

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(css = "button")
    public WebElement signinBtn;


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
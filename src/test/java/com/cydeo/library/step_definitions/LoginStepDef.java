package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LandingPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("I am on the login page")
    public void ı_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

    }
    @When("I login as a librarian")
    public void ı_login_as_a_librarian() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        loginPage.signinBtn.click();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue("dashbord is not faund" , Driver.getDriver().getCurrentUrl().contains("dashboard"));

    }

    @When("I login as a student")
    public void ı_login_as_a_student() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("student55_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("student55_pass"));
        loginPage.signinBtn.click();
    }
    @Then("books should be displayed")
    public void books_should_be_displayed() {
        wait.until(ExpectedConditions.urlContains("books"));
        Assert.assertTrue("books is not faund" , Driver.getDriver().getCurrentUrl().contains("books"));

    }

    @When("I enter username {string}")
    public void ı_enter_username(String username){
        loginPage.emailInput.sendKeys(username);

    }
    @When("I enter password {string}")
    public void ı_enter_password(String password) {
       loginPage.passwordInput.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signinBtn.click();
    }
    @When("there should be {string} users")
    public void there_should_be_users(String expectedUserCount) {
        BrowserUtils.waitForVisibility(landingPage.userCount, 10 );
        String actualUserCount = landingPage.userCount.getText();
        Assert.assertEquals("User count is failing",expectedUserCount,actualUserCount);

    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(int expectedUserCount) {

        String expectedUserNum = String.valueOf(expectedUserCount);
        BrowserUtils.waitForVisibility(landingPage.userCount, 10 );
        String actualUserCount = landingPage.userCount.getText();
        Assert.assertEquals("User count is failing",expectedUserNum,actualUserCount);
    }


    @When("I login using {string} and {string}")
    public void ı_login_using_and(String username, String password) {
        loginPage.emailInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signinBtn.click();

    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedUserName) {

        BrowserUtils.waitForVisibility(landingPage.booksLink,10);
        String actualUserName = landingPage.userNameLink.getText();
        Assert.assertEquals(expectedUserName,actualUserName);

    }
}

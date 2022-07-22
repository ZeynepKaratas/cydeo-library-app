package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.UserPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserTables_stepDef {

    UserPage userPage = new UserPage();


    @Given("I click on {string} link")
    public void click_on_link(String link) {

        BrowserUtils.waitForVisibility(userPage.dashboardLink,10);

       switch (link.toLowerCase()){
           case "dashboard":
               userPage.dashboardLink.click();
               break;
           case "users":
               userPage.usersLink.click();
               break;
           case "books":
               userPage.booksLink.click();
               break;
       }
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedDataTableHeader) {

        BrowserUtils.waitForVisibility(userPage.dashboardLink, 10);
        List<String> actualTableHeader = BrowserUtils.getElementsText(userPage.userTableHeader);
        Assert.assertEquals(expectedDataTableHeader,actualTableHeader);
    }

}
